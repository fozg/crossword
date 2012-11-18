/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entities.Question;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import utilities.SQLUtil;

/**
 *
 * @author Fozg
 */
public class Questions {

    private Component rootPane;
    private List<Question> questions;
    //add a question to database

    public void add(Question q) {
//    
        String cmd2;
//        
        String id = q.getQuestionID();
        int size = q.getQuestionSize();
        String title = q.getQuestionTitle();
        String code = q.getQuestionCode();
        String keyacross = q.getQuestionKeyAcross();
        String keydown = q.getQuestionKeyDown();
        String hintacross = q.getQuestionHintAcross();
        String hintdown = q.getQuestionHintDown();
        int diff = q.getQuestionDifficult();
        cmd2 = "insert into Question values('" + id + "'," + size + ",'" + title + "','" + code + "','" + keyacross + "','" + keydown + "','" + hintacross + "','" + hintdown + "'," + diff + ")";
        boolean result = new SQLUtil().execute(cmd2);
        if (result) {
            JOptionPane.showMessageDialog(rootPane, "Inserted successfully");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Couldn't insert the Question");
        }
    }

    private String convert(int a) {
        String s = a + "";
        if (s.length() == 1) {
            s = "00" + s;
        }
        if (s.length() == 2) {
            s = "0" + s;
        }
        return s;


    }

    // tao ID moi
    public String createID(int diff, int size) {

        //Read data from DB.
        String result = "";
        String cmd = "Select QuestionID from Question";
        ResultSet rs = new SQLUtil().executeResultSet(cmd);
        try {

            int id = 0;
            String clsId = "";
            while (rs.next()) {
                clsId = rs.getString("QuestionID");
                String di = clsId.split("-")[0];
                String si = clsId.split("-")[1];
                int dif = 0, siz = 0;
                switch (di) {
                    case "easy":
                        dif = 0;
                        break;
                    case "normal":
                        dif = 1;
                        break;
                    case "hard":
                        dif = 2;
                        break;
                }
                switch (si) {
                    case "44":
                        siz = 0;
                        break;
                    case "66":
                        siz = 1;
                        break;
                    case "88":
                        siz = 2;
                        break;
                }
                if (dif == diff && siz == size) {
                    id = Integer.parseInt(clsId.split("-")[2]);
                }
            }
            if (clsId.equals("")) {
                id = 0;
            } else {
            }
            id++;
            switch (diff) {
                case 0:
                    result += "easy-";
                    break;
                case 1:
                    result += "normal-";
                    break;
                case 2:
                    result += "hard-";
                    break;
            }
            switch (size) {
                case 0:
                    result += "44-";
                    break;
                case 1:
                    result += "66-";
                    break;
                case 2:
                    result += "88-";
                    break;
            }

            result += convert(id);
            //Set model for the combobox

        } catch (SQLException ex) {
            Logger.getLogger(Questions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    //get question to array
    public Question[] getAllQuestions() {
        List<Question> ques = new LinkedList<Question>();
        try {
            String cmd = "select * from Question ";
            ResultSet rs = new SQLUtil().executeResultSet(cmd);
            //Clear du lieu cu
            ques = new LinkedList<>();
            while (rs.next()) {
                String id = rs.getString("QuestionID");
                int size = rs.getInt("QuestionSize");
                String title = rs.getString("QuestionTitle");
                String code = rs.getString("QuestionCode");
                String keyacross = rs.getString("QuestionKeyAcross");
                String keydown = rs.getString("QuestionKeyDown");
                String hintacross = rs.getString("QuestionHintAcross");
                String hintdown = rs.getString("QuestionHintDown");
                int diff = rs.getInt("QuestionDifficult");
                //Them mot dong gom cac du lieu nay vao bang
                ques.add(new Question(id, size, title, code, keyacross, keydown, hintacross, hintdown, diff));

            }
            //Set the model for the table.
            return (Question[]) ques.toArray(new Question[0]);
        } catch (SQLException ex) {
            Logger.getLogger(Questions.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    // get question o dang List<question>
    public List<Question> getAllQuestionsList() {

        try {
            String cmd = "select * from Question ";
            ResultSet rs = new SQLUtil().executeResultSet(cmd);
            //Clear du lieu cu
            questions = new LinkedList<>();
            while (rs.next()) {
                String id = rs.getString("QuestionID");
                int size = rs.getInt("QuestionSize");
                String title = rs.getString("QuestionTitle");
                String code = rs.getString("QuestionCode");
                String keyacross = rs.getString("QuestionKeyAcross");
                String keydown = rs.getString("QuestionKeyDown");
                String hintacross = rs.getString("QuestionHintAcross");
                String hintdown = rs.getString("QuestionHintDown");
                int diff = rs.getInt("QuestionDifficult");
                //Them mot dong gom cac du lieu nay vao bang
                questions.add(new Question(id, size, title, code, keyacross, keydown, hintacross, hintdown, diff));

            }
            //Set the model for the table.
            //return (Question[])questions.toArray(new Question[0]);
            return questions;
        } catch (SQLException ex) {
            Logger.getLogger(Questions.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //Update question by id
    public boolean UpdateQuestionById(String ID, Question q) {
        String cmd2;
//        
        // String id = q.getQuestionID();
        int size = q.getQuestionSize();
        String title = q.getQuestionTitle();
        String code = q.getQuestionCode();
        String keyacross = q.getQuestionKeyAcross();
        String keydown = q.getQuestionKeyDown();
        String hintacross = q.getQuestionHintAcross();
        String hintdown = q.getQuestionHintDown();
        int diff = q.getQuestionDifficult();
        // cmd2 = "insert into Question values('" + id + "'," + size + ",'" + title + "','" + code + "','" + keyacross + "','" + keydown + "','" + hintacross + "','" + hintdown + "'," + diff + ")";

        cmd2 = "update Question set "
                + " QuestionSize = " + size + ","
                + " QuestionTitle = '" + title + "',"
                + " QuestionCode = '" + code + "',"
                + " QuestionKeyAcross = '" + keyacross + "',"
                + " QuestionKeyDown = '" + keydown + "',"
                + " QuestionHintAcross = '" + hintacross + "',"
                + " QuestionHintDown = '" + hintdown + "',"
                + " QuestionDifficult = " + diff + ","
                + " where QuestionID = '" + ID + "'";

        boolean result = new SQLUtil().execute(cmd2);

        return result;
    }

    public Question getQuestionByID(String ID) {
        try {
            String cmd = "select * from Question where QuestionID = '" + ID + "'";
            ResultSet rs = new SQLUtil().executeResultSet(cmd);
            //Clear du lieu cu
            questions = new LinkedList<>();
            while (rs.next()) {
                String id = rs.getString("QuestionID");
                int size = rs.getInt("QuestionSize");
                String title = rs.getString("QuestionTitle");
                String code = rs.getString("QuestionCode");
                String keyacross = rs.getString("QuestionKeyAcross");
                String keydown = rs.getString("QuestionKeyDown");
                String hintacross = rs.getString("QuestionHintAcross");
                String hintdown = rs.getString("QuestionHintDown");
                int diff = rs.getInt("QuestionDifficult");
                //Them mot dong gom cac du lieu nay vao bang
                return (new Question(id, size, title, code, keyacross, keydown, hintacross, hintdown, diff));

            }
            return null;

        } catch (SQLException ex) {
            Logger.getLogger(Questions.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
}
