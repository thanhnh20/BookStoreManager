/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.tblaccount;

import fu.ultis.DBhelper;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;

/**
 *
 * @author ASUS
 */
public class TblAccountDAO implements Serializable {
    
    
    //check login account with username and password
    public boolean checkLogin(String username, String password) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBhelper.makeConnection();
            if (con != null) {
                String sql = "SELECT username "
                        + "FROM TblAccount "
                        + "WHERE username = ? AND password = ? ";
                stm = con.prepareStatement(sql);
                stm.setString(1, username);
                stm.setString(2, password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    return true;
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
    
    
    //get account by username
    public TblAccountDTO getAccount(String username) throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        TblAccountDTO accountDTO = null;
        try {
            con = DBhelper.makeConnection();
            if (con != null) {
                String sql = "SELECT username, password, fullName, isRole "
                        + "FROM TblAccount "
                        + "WHERE username = ? ";
                stm = con.prepareStatement(sql);
                stm.setString(1, username);
                rs = stm.executeQuery();
                if (rs.next()) {
                    String password = rs.getString("password");
                    String fullName = rs.getString("fullName");
                    boolean role = rs.getBoolean("isRole");
                    accountDTO = new TblAccountDTO(username, password, fullName, role);
                }
                return accountDTO;
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }
}
