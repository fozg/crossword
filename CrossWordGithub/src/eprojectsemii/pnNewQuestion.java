/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eprojectsemii;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Fozg
 */
public class pnNewQuestion extends javax.swing.JPanel {

    private String[] a;
    private JTextField[] jtext;
    private int sizexy;       // kích thước của câu hỏi (sizexy * sizyxy)
    private String code;         // mảng chứa cách sắp xếp vị tríe (code)
    private String keywords;      //  chứa các kết quả của câu hỏi
    private int point;

    public pnNewQuestion() {
        initComponents();
    }

    //khoi tao kich thuoc cua question
    public void setSizexy(int x) {
        this.sizexy = x;
    }

    public String getCode() {
        return this.code;
    }

    //get only 1 key to jtextfield
    private void listenKey(final JTextField par) {

        par.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int code = (int) e.getKeyChar();

                if (code > 64 && code < 123) {
                    if (!"".equals(par.getText())) {
                        par.setText((par.getText().substring(1) + "").toUpperCase());
                        par.setEditable(true);
                    }
                } else {
                    par.setEditable(false);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }

    public void Draw() {
        this.setSize(sizexy * 40, sizexy * 40);
        jtext = new JTextField[sizexy * sizexy];
        this.setLayout(new GridLayout(sizexy, sizexy));

        for (int i = 0; i < sizexy * sizexy; i++) {

            jtext[i] = new JTextField();
            //jtext[i].setSize(30, 30);
            jtext[i].setFont(new Font("Tahoma", 0, 14));
            jtext[i].setHorizontalAlignment(JTextField.CENTER);
            jtext[i].setBackground(new Color(181, 230, 29));
            jtext[i].setBorder(new LineBorder(new Color(240, 240, 240), 1));
            jtext[i].setText("");
            listenKey(jtext[i]);


        }

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
