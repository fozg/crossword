/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eprojectsemii;

import data.Questions;
import entities.Question;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.geom.QuadCurve2D;
import java.io.File;
import javax.print.attribute.standard.Media;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Fozg
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        btnResume.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar(){

            ImageIcon icon = new ImageIcon("src/icons/bgmenu.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        btnNewgame = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        btnResume = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnOption = new javax.swing.JButton();
        btnHighScore = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnMusic = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtHintAcross = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtHintDown = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src/icons/crossword.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        pnMain = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        btnColorGreen = new javax.swing.JButton();
        btnChangeColor2 = new javax.swing.JButton();
        btnChangeColor3 = new javax.swing.JButton();
        btnChangeColor4 = new javax.swing.JButton();
        btnChangeColor5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnNewQuestion = new javax.swing.JMenuItem();
        mnViewQuestion = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 540));
        setMinimumSize(new java.awt.Dimension(1000, 540));
        setPreferredSize(new java.awt.Dimension(1000, 540));
        setResizable(false);

        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jToolBar1.setFloatable(false);
        jToolBar1.setBorderPainted(false);

        btnNewgame.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        btnNewgame.setForeground(new java.awt.Color(255, 255, 255));
        btnNewgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/newgame.png"))); // NOI18N
        btnNewgame.setToolTipText("");
        btnNewgame.setBorderPainted(false);
        btnNewgame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewgame.setFocusable(false);
        btnNewgame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNewgame.setMaximumSize(new java.awt.Dimension(117, 57));
        btnNewgame.setMinimumSize(new java.awt.Dimension(117, 57));
        btnNewgame.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNewgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewgameActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNewgame);

        btnPause.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnPause.setForeground(new java.awt.Color(255, 255, 255));
        btnPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pause.png"))); // NOI18N
        btnPause.setBorderPainted(false);
        btnPause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPause.setFocusable(false);
        btnPause.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPause.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPause);

        btnResume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/resume.png"))); // NOI18N
        btnResume.setBorderPainted(false);
        btnResume.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResume.setFocusable(false);
        btnResume.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResume.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnResume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnResume);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(181, 96, 166));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/time2.png"))); // NOI18N
        jLabel3.setLabelFor(this);
        jLabel3.setText("00:00");
        jToolBar1.add(jLabel3);

        btnOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/option.png"))); // NOI18N
        btnOption.setFocusable(false);
        btnOption.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOption.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionActionPerformed(evt);
            }
        });
        jToolBar1.add(btnOption);

        btnHighScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hightsocre.png"))); // NOI18N
        btnHighScore.setFocusable(false);
        btnHighScore.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHighScore.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHighScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHighScoreActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHighScore);

        jPanel1.setOpaque(false);

        jLabel2.setText("Question");
        jPanel1.add(jLabel2);

        btnMusic.setText("Play music");
        btnMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicActionPerformed(evt);
            }
        });
        jPanel1.add(btnMusic);

        jButton1.setText("Stop");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        txtHintAcross.setEditable(false);
        txtHintAcross.setBackground(new java.awt.Color(240, 240, 240));
        txtHintAcross.setColumns(20);
        txtHintAcross.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtHintAcross.setRows(5);
        txtHintAcross.setBorder(null);
        jScrollPane2.setViewportView(txtHintAcross);

        txtHintDown.setEditable(false);
        txtHintDown.setBackground(new java.awt.Color(240, 240, 240));
        txtHintDown.setColumns(20);
        txtHintDown.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtHintDown.setRows(5);
        txtHintDown.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane3.setViewportView(txtHintDown);

        jButton3.setText("Get Point");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jToolBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jButton2.setForeground(new java.awt.Color(0, 102, 255));
        jButton2.setText("< Hide");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton2);

        btnColorGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/000-165-224.png"))); // NOI18N
        btnColorGreen.setFocusable(false);
        btnColorGreen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnColorGreen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnColorGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorGreenActionPerformed(evt);
            }
        });
        jToolBar2.add(btnColorGreen);

        btnChangeColor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/181-096-166.png"))); // NOI18N
        btnChangeColor2.setFocusable(false);
        btnChangeColor2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChangeColor2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChangeColor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeColor2ActionPerformed(evt);
            }
        });
        jToolBar2.add(btnChangeColor2);

        btnChangeColor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/246-83-20.png"))); // NOI18N
        btnChangeColor3.setFocusable(false);
        btnChangeColor3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChangeColor3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChangeColor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeColor3ActionPerformed(evt);
            }
        });
        jToolBar2.add(btnChangeColor3);

        btnChangeColor4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/255-187-000.png"))); // NOI18N
        btnChangeColor4.setFocusable(false);
        btnChangeColor4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChangeColor4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChangeColor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeColor4ActionPerformed(evt);
            }
        });
        jToolBar2.add(btnChangeColor4);

        btnChangeColor5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/124-187-000.png"))); // NOI18N
        btnChangeColor5.setFocusable(false);
        btnChangeColor5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChangeColor5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChangeColor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeColor5ActionPerformed(evt);
            }
        });
        jToolBar2.add(btnChangeColor5);

        jLabel1.setText("Time:");
        jToolBar2.add(jLabel1);

        jMenuBar1.setBorder(null);

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("New Question");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Question");

        mnNewQuestion.setText("New Question");
        mnNewQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNewQuestionActionPerformed(evt);
            }
        });
        jMenu2.add(mnNewQuestion);

        mnViewQuestion.setText("View Question");
        mnViewQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnViewQuestionActionPerformed(evt);
            }
        });
        jMenu2.add(mnViewQuestion);

        jMenuItem4.setText("Delete question");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        menuAbout.setText("About");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        jMenu3.add(menuAbout);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//        NewJInternalFrame fnq = new NewJInternalFrame();
//        dtpMain.add(fnq);
//        fnq.show();
        dlgLogin cp = new dlgLogin(this, true);
        cp.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed
    Questions q = new Questions();
    pnPlay pnP;
    Color c = new Color(0,165,224);
    private void btnNewgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewgameActionPerformed
//        pnMain.setSize(200,200);
//        pnMain.setLayout(new GridLayout(6, 6));
//      
//       
//        for (int i = 0; i < 6; i++) {
//               for (int j = 0; j < 6; j++) {
//               JButton jb = new JButton();
//                jb.setSize(20, 20);
//                jb.setText("A");
//                pnMain.add(jb);
//            }
//        }
//        pnMain.removeAll();
//        pnMain.repaint();
//        String s="*;*;*;*;A;A;A;A;*;*;*;*;*;*;A;A;A;A;*;*;*;*;*;*;A;A;A;A;*;*;*;*;*;*;A;A;A;A;*;*;*;*;*;*;A;A;";
//        pnPlay pnP = new  pnPlay(s,6);
//        pnMain.setSize(400, 400);
//     //   pnP.setSize(400, 400);
//        pnMain.add(pnP);
//        pnP.setVisible(true);
//        
//        pack();     
        //  pnMain.removeAll();
        pnMain.removeAll();
//        JButton jbb = new JButton();
//        jbb.setText("Acbc");
//        pnMain.add(jbb);
//
//        jbb.setVisible(true);

        Question ques = q.getQuestionByID("normal-66-005");
        String s = ques.getQuestionCode();
        pnP = new pnPlay();
        pnP.setWords(s);
        pnP.SetColor(c);
        pnP.setKeywords(ques.getQuestionKeyAcross() + ques.getQuestionKeyDown());
        pnP.setSizexy(ques.getQuestionSize());
        txtHintAcross.setText(ques.getQuestionHintAcross());
        txtHintDown.setText(ques.getQuestionHintDown());
        pnMain.add(pnP);

        //   pnP.setSize(300, 300);
        pnP.setVisible(true);
        pnP.Draw();
        pack();

    }//GEN-LAST:event_btnNewgameActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        dlgAbout cp = new dlgAbout(this, true);
        cp.setVisible(true);
    }//GEN-LAST:event_menuAboutActionPerformed

    private void mnNewQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNewQuestionActionPerformed
        dlgNewQuestionFinal cp = new dlgNewQuestionFinal(this, true);
        cp.setVisible(true);
    }//GEN-LAST:event_mnNewQuestionActionPerformed

    private void btnHighScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHighScoreActionPerformed
        dlgHighScore cp = new dlgHighScore(this, true);
        cp.setVisible(true);
    }//GEN-LAST:event_btnHighScoreActionPerformed

    private void mnViewQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnViewQuestionActionPerformed
        dlgViewQuestion cp = new dlgViewQuestion(this, true);
        cp.setVisible(true);
    }//GEN-LAST:event_mnViewQuestionActionPerformed

    private void btnOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionActionPerformed
        dlgOption cp = new dlgOption(this, true);
        cp.setVisible(true);
    }//GEN-LAST:event_btnOptionActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        btnResume.setVisible(true);
        btnPause.setVisible(false);
        dlgLogin cp = new dlgLogin(this, true);
        cp.setVisible(true);
    }//GEN-LAST:event_btnPauseActionPerformed
    MP3 mp3 = new MP3("data/sona.mp3");
    private void btnMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicActionPerformed

        mp3.play();
    }//GEN-LAST:event_btnMusicActionPerformed

    private void btnResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumeActionPerformed
        btnPause.setVisible(true);
        btnResume.setVisible(false);
    }//GEN-LAST:event_btnResumeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mp3.close();

    }//GEN-LAST:event_jButton1ActionPerformed
    boolean show = true;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (show) {
            jPanel4.setVisible(false);
            jButton2.setText("> Show");
            show = !show;
        } else {
            jPanel4.setVisible(true);
            jButton2.setText("< Hide");
            show = !show;
        }
        //  this.setSize(WIDTH-100, WIDTH);
    }//GEN-LAST:event_jButton2ActionPerformed

    //change color rbg(0,165,224)
    private void btnColorGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorGreenActionPerformed
        pnMain.removeAll();
        pnMain.repaint();
        c = new Color(0, 165, 224);
        pnP.SetColor(c);
        pnMain.add(pnP);
        pnP.setVisible(true);
        pnP.DrawAgaint(pnP.getCode());
        pack();

    }//GEN-LAST:event_btnColorGreenActionPerformed

    //181-96-166
    private void btnChangeColor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeColor2ActionPerformed
        pnMain.removeAll();
        pnMain.repaint();
        c = new Color(181, 96, 166);
        pnP.SetColor(c);
        pnMain.add(pnP);
        pnP.setVisible(true);
        pnP.DrawAgaint(pnP.getCode());
        pack();
    }//GEN-LAST:event_btnChangeColor2ActionPerformed
    //246-83-20
    private void btnChangeColor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeColor3ActionPerformed
        pnMain.removeAll();
        pnMain.repaint();
        c = new Color(246, 83, 20);
        pnP.SetColor(c);
        pnMain.add(pnP);
        pnP.setVisible(true);
        pnP.DrawAgaint(pnP.getCode());
        pack();
    }//GEN-LAST:event_btnChangeColor3ActionPerformed

    //255-187-0
    private void btnChangeColor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeColor4ActionPerformed
        pnMain.removeAll();
        pnMain.repaint();
        c = new Color(255, 187, 0);
        pnP.SetColor(c);
        pnMain.add(pnP);
        pnP.setVisible(true);
        pnP.DrawAgaint(pnP.getCode());
        pack();
    }//GEN-LAST:event_btnChangeColor4ActionPerformed

    //124 187 0
    private void btnChangeColor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeColor5ActionPerformed
        pnMain.removeAll();
        pnMain.repaint();
        c = new Color(124, 187, 0);
        pnP.SetColor(c);
        pnMain.add(pnP);
        pnP.setVisible(true);
        pnP.DrawAgaint(pnP.getCode());
        pack();
    }//GEN-LAST:event_btnChangeColor5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(rootPane, pnP.getPoint());
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeColor2;
    private javax.swing.JButton btnChangeColor3;
    private javax.swing.JButton btnChangeColor4;
    private javax.swing.JButton btnChangeColor5;
    private javax.swing.JButton btnColorGreen;
    private javax.swing.JButton btnHighScore;
    private javax.swing.JButton btnMusic;
    private javax.swing.JButton btnNewgame;
    private javax.swing.JButton btnOption;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnResume;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuItem mnNewQuestion;
    private javax.swing.JMenuItem mnViewQuestion;
    private javax.swing.JPanel pnMain;
    private javax.swing.JTextArea txtHintAcross;
    private javax.swing.JTextArea txtHintDown;
    // End of variables declaration//GEN-END:variables
}
