/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FOZG
 */
public class SQLUtil {

    String url = "jdbc:odbc:project2";
    String username = "sa";
    String password = "123456";
    private Connection con = null;

    public SQLUtil() {
        try {
            //Load driver
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Create new connection
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      con = DriverManager.getConnection(
        "jdbc:odbc:project2;user=sa;password=123456");

        } catch (Exception ex) {
            Logger.getLogger(SQLUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Execute a statement and returns a ResultSet

    public ResultSet executeResultSet(String cmd) {
        try {
            ResultSet rs;
            //Create statement
            Statement stm = con.createStatement();
            //run the statement and return result
            rs = stm.executeQuery(cmd);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(SQLUtil.class.getName()).log(Level.SEVERE, null, ex);
            //Errors occured, return null
            return null;
        }
    }

    public boolean execute(String cmd) {
        try {
            //Create statement
            Statement stm = con.createStatement();
            //run the statement and return result
            stm.execute(cmd);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQLUtil.class.getName()).log(Level.SEVERE, null, ex);
            //Errors occured, return null
            return false;
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        try {
            //try to close the connection if this object is destroyed
            con.close();
            con=null;
        } catch (Exception e) {
        }
    }
    
    
}