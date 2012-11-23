/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entities.Account;
import entities.Saved;
import java.awt.Component;
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
public class Saveds {

    List<Saved> saveds = new LinkedList<>();
    private Component Saved;

    public Saveds() {
        try {
            String cmd = "select * from Saved ";
            ResultSet rs = new SQLUtil().executeResultSet(cmd);
            //Clear du lieu cu
            saveds = new LinkedList<>();
            while (rs.next()) {
                int id = rs.getInt("SavedID");
                int user = rs.getInt("SaveUserID");
                String question = rs.getString("SavedQuestion");
                String code = rs.getString("SavedCode");
                int time = rs.getInt("SavedTime");


                //Them mot dong gom cac du lieu nay vao bang
                saveds.add(new Saved(id, user, question, code, time));

            }
            //Set the model for the table.
            //return (Question[])questions.toArray(new Question[0]);

        } catch (SQLException ex) {
            Logger.getLogger(Questions.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public List<Saved> getAllSaved() {
        return saveds;
    }

    public boolean createSaved(Saved s) {
        int user = s.getSaveUserID();
        String questin = s.getQuestionID();
        String questioncode = s.getSavedCode();
        int time = s.getSaveTime();



        String cmd2 = "insert into Saved values(" + user + ",'" + questin + "','" + questioncode + "'," + time + ")";
        boolean result = new SQLUtil().execute(cmd2);
        if (result) {
            JOptionPane.showMessageDialog(Saved, "Save Successfully");
            return true;
        } else {
            JOptionPane.showMessageDialog(Saved, "Save faild");
            return false;
        }
    }

    public boolean DeleteSaved(int id) {
        String cmd2 = "delete from Saved where SavedID= " + id;
        boolean result = new SQLUtil().execute(cmd2);
        if (result) {

            return true;
        } else {

            return false;
        }
    }
    
    
}
