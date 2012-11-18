/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Fozg
 */
public class Saved {
    private int saveID;
    private String questionID;
    private String savedCode;
    private int saveTime;

    public Saved(int saveID, String questionID, String savedCode, int saveTime) {
        this.saveID = saveID;
        this.questionID = questionID;
        this.savedCode = savedCode;
        this.saveTime = saveTime;
    }

    public int getSaveID() {
        return saveID;
    }

    public void setSaveID(int saveID) {
        this.saveID = saveID;
    }

    public String getQuestionID() {
        return questionID;
    }

    public void setQuestionID(String questionID) {
        this.questionID = questionID;
    }

    public String getSavedCode() {
        return savedCode;
    }

    public void setSavedCode(String savedCode) {
        this.savedCode = savedCode;
    }

    public int getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(int saveTime) {
        this.saveTime = saveTime;
    }
    
    
}
