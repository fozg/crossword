/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entities.HighScore;
import entities.Record;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Fozg
 */
public class HighScoreS {

    List<HighScore> easy = new LinkedList<HighScore>();
    List<HighScore> normal = new LinkedList<HighScore>();
    List<HighScore> hard = new LinkedList<HighScore>();
    
    public HighScoreS(){
        Records r = new Records();
        List<Record> record = r.getAllRecord();
        Accounts acc = new Accounts();

        for (int i = 0; i < 10; i++) {
            easy.add(new HighScore("-", 0));
            normal.add(new HighScore("-", 0));
            hard.add(new HighScore("-", 0));
        }
        for (Record rec : record) {
            String s = rec.getQuestionID().split("-")[0];
            switch (s) {
                case "easy":
                    easy.add(new HighScore(acc.GetAccountName(rec.getAccountID()), rec.getRecordScore()));
                    break;
                case "normal":
                    normal.add(new HighScore(acc.GetAccountName(rec.getAccountID()), rec.getRecordScore()));
                    break;
                case "hard":
                    hard.add(new HighScore(acc.GetAccountName(rec.getAccountID()), rec.getRecordScore()));
                    break;
            }
        }

        Collections.sort(easy);
        Collections.sort(normal);
        Collections.sort(hard);

    }
    
    public List<HighScore> GetTopEasy(){
        return easy;
    }
    
    public List<HighScore> GetTopNormal(){
        return normal;
    }
    
    public List<HighScore> GetTopHard(){
        return hard;
    }
    
}
