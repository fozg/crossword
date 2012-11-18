/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Fozg
 */
public class Account {
    private int accountID;
    private String accountName;
    private String accountPassword;
    private String accountMail;

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public String getAccountMail() {
        return accountMail;
    }

    public void setAccountMail(String accountMail) {
        this.accountMail = accountMail;
    }

    public Account(int accountID, String accountName, String accountPassword, String accountMail) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.accountPassword = accountPassword;
        this.accountMail = accountMail;
    }

    public Account() {
    }
}
