/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eprojectsemii;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Fozg
 */
public class pnPlay extends javax.swing.JPanel {
    
    private String[] a;
    private JTextField[] jtext;
    private int sizexy;       // kích thước của câu hỏi (sizexy * sizyxy)
    private String code;         // mảng chứa cách sắp xếp vị tríe
    private String keywords;      //  chứa các kết quả của câu hỏi
    private int point;           //so diem dat được

    public int getPoint() {
        return doPoint();
    }

    //Ham tinh diem 
    private int doPoint() {
        String[] word = keywords.split(";");
        int point = 0;

        //them dau * vao hai dau
        for (int i = 0; i < word.length; i++) {
            word[i] = "-" + word[i] + "-";
        }
        
        String[] code = getCode().split(";");

        // tao mang 2 chieu luu cac gia tri..
        String[][] axy = new String[sizexy][sizexy];
        int t = 0;
        for (int i = 0; i < sizexy; i++) {
            for (int j = 0; j < sizexy; j++) {
                axy[i][j] = code[t];
                t++;
            }
        }
        
        for (int i = 0; i < sizexy; i++) {
            String acorss = "-";
            for (int j = 0; j < sizexy; j++) {
                acorss += axy[i][j];
            }
            acorss += "-";


            for (String s : word) {
                if (acorss.contains(s)) {
                    point++;
                }
            }
        }
        
        for (int j = 0; j < sizexy; j++) {
            String down = "-";;
            for (int i = 0; i < sizexy; i++) {
                down += axy[i][j];
            }
            down += "-";

            for (String s : word) {
                if (down.contains(s)) {
                    point++;
                }
            }
        }
        
        return point;
    }
    
    public String getKeywords() {
        return keywords;
    }
    
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

//    private void listenKey(final JTextField par) {
//        
//        par.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                par.setEditable(true);
//            }
//            
//            @Override
//            public void keyPressed(KeyEvent e) {
//                int code = (int) e.getKeyChar();
//                
//                if (code > 64 && code < 123) {
//                    if (!"".equals(par.getText())) {
//                        par.setText((par.getText().substring(1) + "").toUpperCase());
//                        par.setEditable(true);
//                    }
//                } else {
//                    par.setEditable(false);
//                }
//            }
//            
//            @Override
//            public void keyReleased(KeyEvent e) {
//                par.setEditable(true);
//            }
//        });
//    }
    private void listenKey(final JTextField par) {
        
        par.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // par.setBackground(new Color(100, 155, 255));
                //   par.setEditable(true);
            }
            
            @Override
            public void keyPressed(KeyEvent e) {
                
                int code = (int) e.getKeyChar();
                par.setEditable(true);
                
                if (code > 64 && code < 123) {
                    if (!"".equals(par.getText())) {
                        
                        par.setText((par.getText().substring(1) + "").toUpperCase());
                        par.setEditable(true);
                        //   par.setBackground(new Color(100, 155, 255));
                    }
                } else {
                    par.setEditable(false);
                }
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                //    par.setBackground(new Color(100, 155, 255));
                par.setEditable(true);
            }
        });
    }
    
    private void listenfocus(final JTextField par) {
        par.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
               // par.setBorder(new LineBorder(Color.red, 1));
                
            }
            
            @Override
            public void focusLost(FocusEvent e) {
                if (" ".equals(par.getText())) {
                 //   par.setBorder(new LineBorder(new Color(240, 240, 240), 1));
                    par.setText(" ");
                    // par.setEnabled(false);
                }
                
            }
        });
    }
    
    private void listenmouse(final JTextField par) {
        
        par.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    //  par.setBackground(new Color(100, 155, 255));
//                    par.setEnabled(true);
                } else {
                    // par.setBackground(new Color(255, 255, 255));
                    par.setText(" ");
                    //  par.setEnabled(false);

                    
                }
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    // par.setBackground(new Color(100, 155, 255));
//                    par.setEnabled(true);
                } else {
                    //par.setBackground(new Color(255, 255, 255));
                    par.setText(" ");
                    //  par.setEnabled(false);
                }
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    //par.setBackground(new Color(100, 155, 255));
//                    par.setEnabled(true);
                } else {
                    // par.setBackground(new Color(255, 255, 255));
                    par.setText(" ");
                    //par.setEnabled(false);
                }
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                //    par.setBackground(new Color(255, 255, 255));
                par.setBorder(new LineBorder(Color.red, 1));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
               par.setBorder(new LineBorder(new Color(240, 240, 240), 1));
            }
        });

        //Xu ly su kien cuon chuot Up-> A+   Down A-
        par.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if (par.getText().equals(" ")) {
                    par.setText("A");
                    
                } else {
                    par.setText(par.getText().toUpperCase());
                    if (e.getWheelRotation() < 0) {
                        char cc = par.getText().toCharArray()[0];
                        par.setText("" + (char) ((int) (cc - 65 + 1) % 26 + 65));
                    } else {
                        char cc = par.getText().toCharArray()[0];
                        if ((int) cc == 65) {
                            par.setText("Z");
                        } else {
                            par.setText("" + (char) ((int) (cc - 65 - 1) % 26 + 65));
                        }
                    }
                }
            }
        });
        
    }
    
    public int getSizexy() {
        return sizexy;
    }
    
    public void setSizexy(int sizexy) {
        this.sizexy = sizexy;
    }
    
    public String getWords() {
        return code;
    }
    
    public void setWords(String words) {
        this.code = words;
    }
    
    public String getCode() {
        String s = "";
        for (int i = 0; i < sizexy * sizexy; i++) {
            if ("".equals(jtext[i].getText())) {
                s += "-;";
            } else {
                s += jtext[i].getText().toUpperCase() + ";";
            }
        }
        return s;
    }
    
    public pnPlay() {
//       JButton jb = new JButton();
//       this.add(jb);
//       jb.setText("hello");
//       jb.setVisible(true);
    }
    private Color c;//= new Color(0, 165, 224);

    public void Draw() {
        this.setSize(sizexy * 50, sizexy * 50);
        this.setLocation(40*((8-sizexy)/2), 40*((8-sizexy)/2));
        
        a = code.split(";");
        jtext = new JTextField[sizexy * sizexy];
        this.setLayout(new GridLayout(sizexy, sizexy));
        
        for (int i = 0; i < sizexy * sizexy; i++) {
            
            jtext[i] = new JTextField();
            //jtext[i].setSize(30, 30);
            jtext[i].setFont(new Font("Tahoma", 0, 22));
            jtext[i].setForeground(Color.white);
            jtext[i].setHorizontalAlignment(JTextField.CENTER);
            jtext[i].setBackground(new Color(181, 230, 29));
            jtext[i].setBackground(c);
            jtext[i].setBorder(new LineBorder(new Color(240, 240, 240), 1));
            jtext[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
            listenKey(jtext[i]);
            listenmouse(jtext[i]);
            listenfocus(jtext[i]);
            this.add(jtext[i]);
//            this.add(jtext[i]);
            if (a[i].equals("-")) {
                jtext[i].setVisible(false);
                jtext[i].setText("-");
            } else {
                jtext[i].setText(" ");
            }
        }


//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++) {
//                JTextField jbb = new JTextField();
//                jbb.setFont(new Font("Tahoma",0,14));
//                 jbb.setHorizontalAlignment(JTextField.CENTER);
//                jbb.setText("");
//                this.add(jbb);
////           jb.setVisible(true);
//            }
//        }

        
    }
    
    public void SetColor(Color cc) {
        c = cc;
    }
    
    public void DrawAgaint(String code) {
        this.removeAll();
        this.setSize(sizexy * 50, sizexy * 50);


        //a = code.split(";");
        a = code.split(";");
        
        jtext = new JTextField[sizexy * sizexy];
        this.setLayout(new GridLayout(sizexy, sizexy));
        
        for (int i = 0; i < sizexy * sizexy; i++) {
            
            jtext[i] = new JTextField();
            //jtext[i].setSize(30, 30);
            jtext[i].setFont(new Font("Tahoma", 0, 22));
            jtext[i].setForeground(Color.white);
            jtext[i].setHorizontalAlignment(JTextField.CENTER);
            jtext[i].setBackground(new Color(181, 230, 29));
            jtext[i].setBackground(c);
            jtext[i].setBorder(new LineBorder(new Color(240, 240, 240), 1));
            jtext[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
            listenKey(jtext[i]);
            listenmouse(jtext[i]);
            listenfocus(jtext[i]);
            
            this.add(jtext[i]);
//            this.add(jtext[i]);
            if (a[i].equals("-")) {
                
                jtext[i].setVisible(false);
                jtext[i].setText("-");
            } else if (!a[i].equals(" ")) {
                jtext[i].setText(a[i]);
            } else {
                jtext[i].setText(" ");
            }
        }
    }
    
    public void DrawToManager() {
        this.setSize(sizexy * 30, sizexy * 30);
        
        
        a = code.split(";");
        jtext = new JTextField[sizexy * sizexy];
        this.setLayout(new GridLayout(sizexy, sizexy));
        
        for (int i = 0; i < sizexy * sizexy; i++) {
            
            jtext[i] = new JTextField();
            //jtext[i].setSize(30, 30);
            jtext[i].setFont(new Font("Tahoma", 0, 14));
            jtext[i].setHorizontalAlignment(JTextField.CENTER);
            jtext[i].setBackground(new Color(40, 40, 40));
            jtext[i].setBorder(new LineBorder(new Color(240, 240, 240), 1));
            
            listenKey(jtext[i]);
            
            this.add(jtext[i]);
//            this.add(jtext[i]);
            if (a[i].equals("-")) {
                jtext[i].setVisible(false);
                jtext[i].setText("-");
                
            } else {
                jtext[i].setText(a[i]);
                jtext[i].setEnabled(false);
                jtext[i].setDisabledTextColor(Color.WHITE);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
