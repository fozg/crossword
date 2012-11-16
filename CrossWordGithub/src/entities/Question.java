/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Data
 */
public class Question {
    private String QuestionID;
    private int QuestionSize;       // size of question
    private String QuestionTitle;    //title question 
    private String QuestionCode;      
    private String QuestionKeyAcross;
    private String QuestionKeyDown;
    private String QuestionHintAcross;
    private String QuestionHintDown;
    private int QuestionDifficult;

    public Question(String QuestionID, int QuestionSize, String QuestionTitle, String QuestionCode, String QuestionKeyAcross, String QuestionKeyDown, String QuestionHintAcross, String QuestionHintDown, int QuestionDifficult) {
        this.QuestionID = QuestionID;
        this.QuestionSize = QuestionSize;
        this.QuestionTitle = QuestionTitle;
        this.QuestionCode = QuestionCode;
        this.QuestionKeyAcross = QuestionKeyAcross;
        this.QuestionKeyDown = QuestionKeyDown;
        this.QuestionHintAcross = QuestionHintAcross;
        this.QuestionHintDown = QuestionHintDown;
        this.QuestionDifficult = QuestionDifficult;
    }

    public String getQuestionID() {
        return QuestionID;
    }

    public void setQuestionID(String QuestionID) {
        this.QuestionID = QuestionID;
    }

    public int getQuestionSize() {
        return QuestionSize;
    }

    public void setQuestionSize(int QuestionSize) {
        this.QuestionSize = QuestionSize;
    }

    public String getQuestionTitle() {
        return QuestionTitle;
    }

    public void setQuestionTitle(String QuestionTitle) {
        this.QuestionTitle = QuestionTitle;
    }

    public String getQuestionCode() {
        return QuestionCode;
    }

    public void setQuestionCode(String QuestionCode) {
        this.QuestionCode = QuestionCode;
    }

    public String getQuestionKeyAcross() {
        return QuestionKeyAcross;
    }

    public void setQuestionKeyAcross(String QuestionKeyAcross) {
        this.QuestionKeyAcross = QuestionKeyAcross;
    }

    public String getQuestionKeyDown() {
        return QuestionKeyDown;
    }

    public void setQuestionKeyDown(String QuestionKeyDown) {
        this.QuestionKeyDown = QuestionKeyDown;
    }

    public String getQuestionHintAcross() {
        return QuestionHintAcross;
    }

    public void setQuestionHintAcross(String QuestionHintAcross) {
        this.QuestionHintAcross = QuestionHintAcross;
    }

    public String getQuestionHintDown() {
        return QuestionHintDown;
    }

    public void setQuestionHintDown(String QuestionHintDown) {
        this.QuestionHintDown = QuestionHintDown;
    }

    public int getQuestionDifficult() {
        return QuestionDifficult;
    }

    public void setQuestionDifficult(int QuestionDifficult) {
        this.QuestionDifficult = QuestionDifficult;
    }
    
    
    
    
}
