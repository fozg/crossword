/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eprojectsemii;

import java.io.Console;

/**
 *
 * @author Fozg
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String words  = "a;b;c;d;e;";
        String s[] = words.split(";");
        for (String ss: s){
            System.out.println(ss);
        }
       
    }
}
