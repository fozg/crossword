/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Fozg
 */
public class HighScore implements Comparable<HighScore> {

    private String Name;
    private int Score;

    public HighScore(String Name, int Score) {
        this.Name = Name;
        this.Score = Score;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    @Override
    public int compareTo(HighScore o) {
        if (getScore() < o.getScore()) {
            return 1;
        } else if (getScore() == o.getScore()) {
            return 0;
        } else {
            return -1;
        }
    }
}
