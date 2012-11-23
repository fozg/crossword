/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entities.Account;
import entities.Question;
import java.awt.Component;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utilities.SQLUtil;

/**
 *
 * @author Fozg
 */
public class Accounts {

    private List<Account> accounts;
    private Component Accounts;

    public Accounts() {
        try {
            String cmd = "select * from Account ";
            ResultSet rs = new SQLUtil().executeResultSet(cmd);
            //Clear du lieu cu
            accounts = new LinkedList<>();
            while (rs.next()) {
                int id = rs.getInt("AccountID");
                String name = rs.getString("AccountName");
                String pass = rs.getString("accountPassword");
                String mail = rs.getString("accountMail");
                int type = rs.getInt("accountType");

                //Them mot dong gom cac du lieu nay vao bang
                accounts.add(new Account(id, name, pass, mail, type));

            }
            //Set the model for the table.
            //return (Question[])questions.toArray(new Question[0]);

        } catch (SQLException ex) {
            Logger.getLogger(Questions.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    //get all acount

    public List<Account> getAllAccount() {

//        try {
//            String cmd = "select * from Account ";
//            ResultSet rs = new SQLUtil().executeResultSet(cmd);
//            //Clear du lieu cu
//            accounts = new LinkedList<>();
//            while (rs.next()) {
//                int id = rs.getInt("AccountID");
//                String name = rs.getString("AccountName");
//                String pass = rs.getString("accountPassword");
//                String mail = rs.getString("accountMail");
//                int type = rs.getInt("accountType");
//
//                //Them mot dong gom cac du lieu nay vao bang
//                accounts.add(new Account(id, name, pass, mail, type));
//
//            }
//            //Set the model for the table.
//            //return (Question[])questions.toArray(new Question[0]);
//            return accounts;
//        } catch (SQLException ex) {
//            Logger.getLogger(Questions.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
        return accounts;
    }

    //kiem tra dang nhap theo user va password
    public boolean CheckLogin(String user, String passIn) throws NoSuchAlgorithmException {

        try {
            String cmd = "select accountPassword from Account where accountName='" + user + "'";
            ResultSet rs = new SQLUtil().executeResultSet(cmd);
            //Clear du lieu cu
            MD5 md5 = new MD5();
            String pas = md5.createMD5(passIn);
            while (rs.next()) {

                String pass = rs.getString("accountPassword");
                if (pas.equals(pass)) {
                    return true;
                }

            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Questions.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    // check exis of user when create account.
    //if exis -> return true ; not exis -> return false;
    public boolean CheckUserExist(String user) {

        try {
            String cmd = "select accountName from Account";
            ResultSet rs = new SQLUtil().executeResultSet(cmd);
            //Clear du lieu cu


            while (rs.next()) {

                String users = rs.getString("accountName");
                if (user.equals(users)) {
                    return true;
                }

            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(Questions.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    //get account role, 1 = admin, 2 = user, 3 = anymor
    public int GetAccoutType(String user) {
        for (Account a : accounts) {
            if (a.getAccountName().equals(user)) {
                return a.getAccountType();
            }
        }
        return 3;
    }

    public int GetAccoutID(String user){
         for (Account a : accounts) {
            if (a.getAccountName().equals(user)) {
                return a.getAccountID();
            }
        }
        return 0;
    }
    public String GetAccountName(int id){
        for (Account a : accounts){
            if (a.getAccountID() == id)
            {
                return a.getAccountName();
            }
        }
        return null;
    }
    //create account (account name, account password, account email)
    public boolean CreateAccount(Account a) throws NoSuchAlgorithmException {
        String name = a.getAccountName();

        if (!CheckUserExist(name)) {
            String pass = new MD5().createMD5(a.getAccountPassword());
                String email = a.getAccountMail();
                int type = 2;
                String cmd2 = "insert into Account values('" + name + "','" + pass + "','" + email + "'," + type + ")";
                boolean result = new SQLUtil().execute(cmd2);
                if (result) {
                    JOptionPane.showMessageDialog(Accounts, "Register Successfully");
                    return true;
                } else {
                    JOptionPane.showMessageDialog(Accounts, "Create Account faild");
                    return false;
                }

        } else {
            JOptionPane.showMessageDialog(Accounts, "Username already exist");
            return false;
        }
    }
}