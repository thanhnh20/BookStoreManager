/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.ultis;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author ASUS
 */
public class DBhelper {
    
    public static Connection makeConnection() throws NamingException, SQLException {
        // 1. get current context
        Context context = new InitialContext();
        // 2. get server context
        Context tomcatContext = (Context)context.lookup("java:comp/env");
        // 3. get datasource
        DataSource ds = (DataSource)tomcatContext.lookup("DBCONNECTION");
        // 4. get Connection
        Connection con = ds.getConnection();
        return con;
    }
}
