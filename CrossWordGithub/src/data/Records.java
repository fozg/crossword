/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entities.Account;
import entities.Record;
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
public class Records {

    private List<Record> records;

    public Records() {
        try {
            String cmd = "select * from Record ";
            ResultSet rs = new SQLUtil().executeResultSet(cmd);
            //Clear du lieu cu
            records = new LinkedList<>();
            while (rs.next()) {
                int id = rs.getInt("RecordID");
                String questionID = rs.getString("RecordQuestion");
                int userID = rs.getInt("RecordUser");
                int time = rs.getInt("RecordTime");
                int score = rs.getInt("RecordScore");

                //Them mot dong gom cac du lieu nay vao bang
                records.add(new Record(id, questionID, userID, time, score));

            }
            //Set the model for the table.
            //return (Question[])questions.toArray(new Question[0]);

        } catch (SQLException ex) {
            Logger.getLogger(Questions.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    //lay toan bo record
    public List<Record> getAllRecord() {
        return records;
    }

    // them moi 1 record
    public boolean createRecord(Record r) {
        String question = r.getQuestionID();
        int user = r.getAccountID();
        int time = r.getRecordTime();
        int score = r.getRecordScore();
        String cmd = "insert into record values('" + question + "'," + user + "," + time + "," + score + ")";
        boolean result = new SQLUtil().execute(cmd);
        if (result) {
            return true;
        } else {
            return false;
        }

        //return true;
    }
}
//...