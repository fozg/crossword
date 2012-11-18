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
    private String questionID;
    private int questionSize;       // size of question
    private String questionTitle;    //title question 
    private String questionCode;      
    private String questionKeyAcross;
    private String questionKeyDown;
    private String questionHintAcross;
    private String questionHintDown;
    private int questionDifficult;

    public Question() {
    }

    public Question(int questionSize, String questionTitle, String questionCode, String questionKeyAcross, String questionKeyDown, String questionHintAcross, String questionHintDown, int questionDifficult) {
        this.questionSize = questionSize;
        this.questionTitle = questionTitle;
        this.questionCode = questionCode;
        this.questionKeyAcross = questionKeyAcross;
        this.questionKeyDown = questionKeyDown;
        this.questionHintAcross = questionHintAcross;
        this.questionHintDown = questionHintDown;
        this.questionDifficult = questionDifficult;
    }

    
    public Question(String questionID, int questionSize, String questionTitle, String questionCode, String questionKeyAcross, String questionKeyDown, String questionHintAcross, String questionHintDown, int questionDifficult) {
        this.questionID = questionID;
        this.questionSize = questionSize;
        this.questionTitle = questionTitle;
        this.questionCode = questionCode;
        this.questionKeyAcross = questionKeyAcross;
        this.questionKeyDown = questionKeyDown;
        this.questionHintAcross = questionHintAcross;
        this.questionHintDown = questionHintDown;
        this.questionDifficult = questionDifficult;
    }

    public String getQuestionID() {
        return questionID;
    }

    public void setQuestionID(String questionID) {
        this.questionID = questionID;
    }

    public int getQuestionSize() {
        return questionSize;
    }

    public void setQuestionSize(int questionSize) {
        this.questionSize = questionSize;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getQuestionCode() {
        return questionCode;
    }

    public void setQuestionCode(String questionCode) {
        this.questionCode = questionCode;
    }

    public String getQuestionKeyAcross() {
        return questionKeyAcross;
    }

    public void setQuestionKeyAcross(String questionKeyAcross) {
        this.questionKeyAcross = questionKeyAcross;
    }

    public String getQuestionKeyDown() {
        return questionKeyDown;
    }

    public void setQuestionKeyDown(String questionKeyDown) {
        this.questionKeyDown = questionKeyDown;
    }

    public String getQuestionHintAcross() {
        return questionHintAcross;
    }

    public void setQuestionHintAcross(String questionHintAcross) {
        this.questionHintAcross = questionHintAcross;
    }

    public String getQuestionHintDown() {
        return questionHintDown;
    }

    public void setQuestionHintDown(String questionHintDown) {
        this.questionHintDown = questionHintDown;
    }

    public int getQuestionDifficult() {
        return questionDifficult;
    }

    public void setQuestionDifficult(int questionDifficult) {
        this.questionDifficult = questionDifficult;
    }

    
   
    
    
    
    
}
