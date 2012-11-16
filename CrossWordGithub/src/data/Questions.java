/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entities.Question;
import java.awt.Component;
import javax.swing.JOptionPane;
import utilities.SQLUtil;

/**
 *
 * @author Fozg
 */
public class Questions {

    private Component rootPane;

    public void add(Question q) {
//        String clsId = clsItem.getClsId();
        //Insert command
//        String cmd = "insert into Student "
//                + "values('" + q.getQuestionID() + "', '" + q.getQuestionTitle() + "', '" + q. + "',"
//                + " '" + stdEmail + "', "
//                + "'" + stdPhone + "', '" + stdAddress + "', '" + clsId + "')";
        // Questions q= new Questions();
        String cmd2;
//        cmd2 = "insert into Question values('" + q.getQuestionID() + "'," + q.getQuestionSize() + ",'" + q.getQuestionTitle() + "','"
//                + q.getQuestionCode() + "','"
//                + q.getQuestionKeyAcross() + "','"
//                + q.getQuestionKeyDown() + "','"
//                + q.getQuestionHintAcross() + "','"
//                + q.getQuestionHintDown() + "',"
//                + q.getQuestionDifficult() + ")";

        String id = q.getQuestionID();
        int size = q.getQuestionSize();
        String title = q.getQuestionTitle();
        String code = q.getQuestionCode();
        String keyacross = q.getQuestionKeyAcross();
        String keydown = q.getQuestionHintDown();
        String hintacross = q.getQuestionHintAcross();
        String hintdown = q.getQuestionHintDown();
        int diff = q.getQuestionDifficult();
        cmd2 = "insert into Question values('"+id+"',"+size+",'"+title+"','"+code+"','"+keyacross+"','"+keydown+"','"+hintacross+"','"+hintdown+"',"+diff+")";
         //  cmd2="insert into Question values('ID4',1,'Title','Code','Key1','Key2','Hint1','Hint2',2);";

        //Run the command
        boolean result = new SQLUtil().execute(cmd2);
        if (result) {
            JOptionPane.showMessageDialog(rootPane, "Inserted successfully");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Couldn't insert the Question");
        }
    }
}
