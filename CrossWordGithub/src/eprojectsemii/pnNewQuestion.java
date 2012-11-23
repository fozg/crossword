/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eprojectsemii;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import com.sun.org.apache.xpath.internal.FoundIndex;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.security.Key;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.border.LineBorder;


/*
 * @author Fozg
 */
public class pnNewQuestion extends javax.swing.JPanel {

    private String[] a;
    private JTextField[] jtext;
    private int sizexy;       // kích thước của câu hỏi (sizexy * sizyxy)
    private String code;         // mảng chứa cách sắp xếp vị tríe (code)
    // private String keywords;      //  chứa các kết quả của câu hỏi
    private int point;
    private JTextField onlyfocus;
    private int keycontrol;     //luu gia tri de dieu khien con tro bang ban phim
    private int keywordcount;
    //khoi tao kich thuoc cua question

    public void setCode(String codec) {
        this.code = codec;
    }

    public int getKeywordcount() {
        return keywordcount;
    }

    // Set kich thuoc cua question x * x
    public void setSizexy(int x) {
        this.sizexy = x;
    }

    // Lay ve gia tri cach sap xep cua question
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

    //Su kien ban phim (nhap 1 key, to mau ....)
    private void listenKey(final JTextField par) {

        par.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                par.setBackground(new Color(100, 155, 255));
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
                        par.setBackground(new Color(100, 155, 255));
                    }
                } else {
                    par.setEditable(false);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                par.setBackground(new Color(100, 155, 255));
                par.setEditable(true);
            }
        });
    }

    //Xu ly su kien fucus cua 1 box
    private void listenfocus(final JTextField par) {
        par.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                par.setBackground(new Color(100, 155, 255));
            }

            @Override
            public void focusLost(FocusEvent e) {
                if ("".equals(par.getText())) {
                    par.setBackground(new Color(255, 255, 255));
                    par.setText("");
                    // par.setEnabled(false);
                }

            }
        });
    }

    //Xu ly su kien chuot..
    private void listenmouse(final JTextField par) {

        par.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    par.setBackground(new Color(100, 155, 255));
//                    par.setEnabled(true);

                } else {
                    par.setBackground(new Color(255, 255, 255));
                    par.setText("");
                    //  par.setEnabled(false);


                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    par.setBackground(new Color(100, 155, 255));
//                    par.setEnabled(true);

                } else {
                    par.setBackground(new Color(255, 255, 255));
                    par.setText("");
                    //  par.setEnabled(false);
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    par.setBackground(new Color(100, 155, 255));
//                    par.setEnabled(true);

                } else {
                    par.setBackground(new Color(255, 255, 255));
                    par.setText("");
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
                if (par.getText().equals("")) {
                    par.setText("A");
                    par.setBackground(new Color(100, 155, 255));
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

    //lay gia tri cac keyword tao dc theo hang ngang
    public String[] getKeywordsAcross() {
        int count = 0;
        String[] s = new String[100];
        //tao mang 2 chieu luu cac gia tri..
        String[] code = getCode().split(";");
        String[][] axy = new String[sizexy][sizexy];
        int t = 0;
        for (int i = 0; i < sizexy; i++) {
            for (int j = 0; j < sizexy; j++) {
                axy[i][j] = code[t];
                t++;
            }
        }
        //lay cac tu theo hang ngang..
        for (int i = 0; i < sizexy; i++) {
            String across = "";
            for (int j = 0; j < sizexy; j++) {
                across += axy[i][j];
            }
            s[count++] = across;
        }
//        //lay cac tu theo hang doc
//        for (int i = 0; i < sizexy; i++) {
//            String across = "";
//            for (int j = 0; j < sizexy; j++) {
//                across += axy[j][i];
//            }
//            s[count++] = across;
//        }

        ArrayList<String> s3 = new ArrayList<String>();
        int ct = 0;

        for (int i = 0; i < count; i++) {
            for (String ss : s[i].split("-")) {
                if (!ss.equals(null)) {
                    if (ss.length() > 1 && !ss.equals("")) {

                        s3.add(ss);
                    }
                }
            }
        }

        String[] s2 = new String[s3.size()];
        s2 = s3.toArray(s2);
        this.keywordcount = s2.length;
        return s2;
    }

    //lay gia tri keyword tap theo hang doc
    public String[] getKeywordsDown() {
        int count = 0;
        String[] s = new String[100];
        //tao mang 2 chieu luu cac gia tri..
        String[] code = getCode().split(";");
        String[][] axy = new String[sizexy][sizexy];
        int t = 0;
        for (int i = 0; i < sizexy; i++) {
            for (int j = 0; j < sizexy; j++) {
                axy[i][j] = code[t];
                t++;
            }
        }
        //lay cac tu theo hang ngang..
//        for (int i = 0; i < sizexy; i++) {
//            String across = "";
//            for (int j = 0; j < sizexy; j++) {
//                across += axy[i][j];
//            }
//            s[count++] = across;
//        }
        //lay cac tu theo hang doc
        for (int i = 0; i < sizexy; i++) {
            String across = "";
            for (int j = 0; j < sizexy; j++) {
                across += axy[j][i];
            }
            s[count++] = across;
        }

        ArrayList<String> s3 = new ArrayList<String>();
        int ct = 0;

        for (int i = 0; i < count; i++) {
            for (String ss : s[i].split("-")) {
                if (!ss.equals(null)) {
                    if (ss.length() > 1 && !ss.equals("")) {

                        s3.add(ss);
                    }
                }
            }
        }

        String[] s2 = new String[s3.size()];
        s2 = s3.toArray(s2);
        this.keywordcount = s2.length;
        return s2;
    }

    //ham tra ve chuoi dai nhat
    private String strLong(String[] s) {
        String max = "";
        for (String ss : s) {
            if (ss.equals(null)) {
                break;
            } else if (max.length() < ss.length()) {
                max = ss;
            }
        }
        return max;
    }

    public void Draw() {

        this.setSize(sizexy * 40, sizexy * 40);

        jtext = new JTextField[sizexy * sizexy];
        this.setLayout(new GridLayout(sizexy, sizexy));

        for (int i = 0; i < sizexy * sizexy; i++) {

            jtext[i] = new JTextField();
            jtext[i].setSize(30, 30);
            jtext[i].setFont(new Font("Tahoma", 1, 14));
            jtext[i].setForeground(Color.white);
            jtext[i].setHorizontalAlignment(JTextField.CENTER);
            jtext[i].setBackground(new Color(255, 255, 255));
            jtext[i].setBorder(new LineBorder(new Color(240, 240, 240), 1));
            jtext[i].setText("");
            jtext[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
            //  jtext[i].setEnabled(false);
            keycontrol = i;
            listenmouse(jtext[i]);
            listenfocus(jtext[i]);
            this.add(jtext[i]);
            listenKey(jtext[i]);


        }
        onlyfocus = new JTextField();
    }

    public void DrawAgaint(String codec) {

        this.setSize(sizexy * 40, sizexy * 40);
        String[] aa = codec.split(";");
        jtext = new JTextField[sizexy * sizexy];
        this.setLayout(new GridLayout(sizexy, sizexy));

        for (int i = 0; i < sizexy * sizexy; i++) {

            jtext[i] = new JTextField();
            jtext[i].setSize(30, 30);
            jtext[i].setFont(new Font("Tahoma", 1, 14));
            jtext[i].setForeground(Color.white);
            jtext[i].setHorizontalAlignment(JTextField.CENTER);
            jtext[i].setBackground(new Color(255, 255, 255));
            jtext[i].setBorder(new LineBorder(new Color(240, 240, 240), 1));
            if (aa[i].equals("-")) {
                jtext[i].setText("");
            }
            else 
            {
                jtext[i].setText(aa[i]);
                 jtext[i].setBackground(new Color(100, 155, 255));
            }
            jtext[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
            //  jtext[i].setEnabled(false);
            keycontrol = i;
            listenmouse(jtext[i]);
            listenfocus(jtext[i]);
            this.add(jtext[i]);
            listenKey(jtext[i]);


        }
        onlyfocus = new JTextField();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
