/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.tblaccount;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class TblAccountError implements Serializable{
    private String usernameEmpty;
    private String passwordEmpty;
    private String wrongAccount;

    public TblAccountError() {
    }

    public TblAccountError(String usernameEmpty, String passwordEmpty, String wrongAccount) {
        this.usernameEmpty = usernameEmpty;
        this.passwordEmpty = passwordEmpty;
        this.wrongAccount = wrongAccount;
    }

    public String getUsernameEmpty() {
        return usernameEmpty;
    }

    public void setUsernameEmpty(String usernameEmpty) {
        this.usernameEmpty = usernameEmpty;
    }

    public String getPasswordEmpty() {
        return passwordEmpty;
    }

    public void setPasswordEmpty(String passwordEmpty) {
        this.passwordEmpty = passwordEmpty;
    }

    public String getWrongAccount() {
        return wrongAccount;
    }

    public void setWrongAccount(String wrongAccount) {
        this.wrongAccount = wrongAccount;
    }
    
    
}
