/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import classes.GuessNumbers;
import classes.Gui;
import javax.swing.JOptionPane;

/**
 *
 * @author My
 */
public class GuessingGame extends javax.swing.JFrame {

    /**
     * Creates new form GuessingGame
     */
    public GuessingGame() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtlife = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtbestscore = new javax.swing.JLabel();
        txtscore = new javax.swing.JLabel();
        txtguesses = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtreset = new javax.swing.JLabel();
        txtguess = new javax.swing.JTextField();
        txtshowrandom = new javax.swing.JLabel();
        txthide = new javax.swing.JLabel();
        txtshow = new javax.swing.JLabel();
        btn_guess = new javax.swing.JButton();
        btn_newrandom = new javax.swing.JButton();
        txtremarks = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUESSING GAME");
        setResizable(false);

        txtlife.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtlife.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtlife.setText("Life: 10");
        txtlife.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("*** NUMBER GUESSING GAME ***");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assess/ng2.png"))); // NOI18N

        txtbestscore.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtbestscore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbestscore.setText("Best Score: 0");
        txtbestscore.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtscore.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtscore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtscore.setText("Score: 0");
        txtscore.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtguesses.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtguesses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtguesses.setText("Guesses: 0");
        txtguesses.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Enter Your Number (1...100):");

        jLabel9.setToolTipText("Reset");

        txtreset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assess/ng6.PNG"))); // NOI18N
        txtreset.setToolTipText("Reset");
        txtreset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtresetMouseClicked(evt);
            }
        });

        txtguess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtguess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtguessKeyTyped(evt);
            }
        });

        txtshowrandom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtshowrandom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtshowrandom.setText("?");
        txtshowrandom.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txthide.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txthide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txthide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assess/ng5.PNG"))); // NOI18N
        txthide.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txthide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txthideMouseClicked(evt);
            }
        });

        txtshow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtshow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assess/ng4.PNG"))); // NOI18N
        txtshow.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtshowMouseClicked(evt);
            }
        });

        btn_guess.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_guess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assess/ng8.PNG"))); // NOI18N
        btn_guess.setText("Guess");
        btn_guess.setToolTipText("Your Guess");
        btn_guess.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_guess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guessActionPerformed(evt);
            }
        });

        btn_newrandom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_newrandom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assess/ng7.PNG"))); // NOI18N
        btn_newrandom.setText("New Random Number");
        btn_newrandom.setToolTipText("Random Number");
        btn_newrandom.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_newrandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newrandomActionPerformed(evt);
            }
        });

        txtremarks.setBackground(new java.awt.Color(255, 0, 0));
        txtremarks.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtremarks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtremarks.setText(".......Try Your Luck......");
        txtremarks.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtscore, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtguesses, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtlife, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtremarks, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn_newrandom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtguess))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtshowrandom, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtshow, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txthide, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btn_guess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(17, 17, 17))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtreset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbestscore, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbestscore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtguesses, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlife, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtscore, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtshowrandom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthide, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtshow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtguess, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_newrandom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_guess, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtremarks, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_newrandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newrandomActionPerformed
        randomNew();
    }//GEN-LAST:event_btn_newrandomActionPerformed

    private void btn_guessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guessActionPerformed
        guess();
    }//GEN-LAST:event_btn_guessActionPerformed

    private void txtshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtshowMouseClicked
        txtshow.setEnabled(false);
        txthide.setEnabled(true);
        txtshowrandom.setText(String.valueOf(random));
    }//GEN-LAST:event_txtshowMouseClicked

    private void txthideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txthideMouseClicked
        txtshow.setEnabled(true);
        txthide.setEnabled(false);
        txtshowrandom.setText("?");
    }//GEN-LAST:event_txthideMouseClicked

    private void txtguessKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtguessKeyTyped
        Gui._integerOnly(evt);
    }//GEN-LAST:event_txtguessKeyTyped

    private void txtresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtresetMouseClicked
        Object[] options = {"YES","NO"};
        int x = JOptionPane.showOptionDialog(this,"Are you sure you want to reset (yes/no)?","MESSAGE",
                JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,null);
        if(x == JOptionPane.YES_OPTION){
            reset();
        }
        
    }//GEN-LAST:event_txtresetMouseClicked

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
                if ("WINDOWS".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuessingGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guess;
    private javax.swing.JButton btn_newrandom;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtbestscore;
    private javax.swing.JTextField txtguess;
    private javax.swing.JLabel txtguesses;
    private javax.swing.JLabel txthide;
    private javax.swing.JLabel txtlife;
    private javax.swing.JLabel txtremarks;
    private javax.swing.JLabel txtreset;
    private javax.swing.JLabel txtscore;
    private javax.swing.JLabel txtshow;
    private javax.swing.JLabel txtshowrandom;
    // End of variables declaration//GEN-END:variables
    
    
    Gui gui;
    private int random = 0,bestScore = 0,yourScore = 0,addCorrectScore = 3;
    private byte guessCount = 0,lifeCount = 10,greaterThanError = 0,lessThanError = 0;
    private void init(){
       gui = new Gui();
       Gui._centerFrame(this);
       gui.setIconFrame(this);
       
       random = GuessNumbers._randomNumber();
       txthide.setEnabled(false);
       
       bestScore = Gui.getCurrentBestScore();
       txtbestscore.setText("Best Score: "+bestScore);
       
    }
    
    private void randomNew(){
        random = GuessNumbers._randomNumber();
        txtguess.setText("");
        txtguess.requestFocus();
        txthide.setEnabled(false);
        txtshow.setEnabled(true);
        txtshowrandom.setText("?");
    }

    private void guess(){
        if(txtguess.getText().equals("")){
            Gui._message("Please enter your number!",0);
            txtguess.requestFocus();
        }
        else if(Integer.parseInt(txtguess.getText())>=101 || Integer.parseInt(txtguess.getText())< 1){
            Gui._message("Please enter number from 1-100!", 0);
            txtguess.setText("");
            txtguess.requestFocus();
        }
        else{
            int yourNumber = Integer.parseInt(txtguess.getText());
            
            if(yourNumber == random){
                Gui._message("YOU WON!!\nadditional 3 life was added", 1);
                yourScore++;
                txtscore.setText("Score: "+yourScore);
                
                lifeCount+=addCorrectScore;
                txtlife.setText("Life: "+lifeCount);
                
                updateBestScore();
                
                
                Object[] options = {"YES, I WANT NOW","NO, I'M TIRED"};
                int x = JOptionPane.showOptionDialog(this,"Want to play again (yes/no)?","MESSAGE",
                JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                if(x == JOptionPane.YES_OPTION){
                    newGame();
                }
                else{
                    System.exit(0);
                }
               
            }
            else{
                lifeCount--;
                txtlife.setText("Life: "+lifeCount);
                
                if(lifeCount<=4){
                   Gui._message("Warning! You've less no.of lifes", 0); 
                }
                
                hint(random,yourNumber);
                
                if(lifeCount==0){
                    Gui._message("You've used all your life!, \nPlease try again next time", 0);
                    
                    Object[] options = {"YES, I WANT NOW","NO, I'M TIRED"};
                    int x = JOptionPane.showOptionDialog(this,"Want to play again (yes/no)?","MESSAGE",
                    JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                    if(x == JOptionPane.YES_OPTION){
                        newGame();
                    }
                    else{
                        System.exit(0);
                    }
                    
                }
            }
            
            guessCount++;
            txtguesses.setText("Guesses: "+guessCount);
        }
    }
    
    private void hint(int _randomNum,int yourNumber){
        String mes;
        if(_randomNum > yourNumber){
            lessThanError++;
            mes = messageHint(lessThanError,(byte)1,yourNumber);
            txtremarks.setText(mes);
        }
        else{
            greaterThanError++;
            mes = messageHint(greaterThanError,(byte)0,yourNumber);
            txtremarks.setText(mes);
        }
    }
    
    private String messageHint(byte errorCount,byte errorCatcher,int numGuess){
        String message;
      
        switch(errorCatcher){
            case 1:
               String messageCat[] = {String.valueOf(numGuess) + " is less than the number!please be observant!",
                        String.valueOf(numGuess) + " is less than the number! don't you know how to compute?!",
                        String.valueOf(numGuess) + " is less than the number! Oh! Come ON!",
                        String.valueOf(numGuess) + " is less than the number! I'm tired of remainding!"};
                
                if(errorCount < 3){
                    message = String.valueOf(numGuess)+"is less than the random number!";
                }
                else{
                    int randomMes = (int) Math.round(Math.random() * 3);
                    message = messageCat[randomMes];
                }
                
                break;
            default:
                String messageCat1[] = {String.valueOf(numGuess) + " is greater than the number!please be observant!",
                        String.valueOf(numGuess) + " is greater than the number! don't you know how to compute?!",
                        String.valueOf(numGuess) + " is greater than the number! Oh! Come ON!",
                        String.valueOf(numGuess) + " is greater than the number! I'm tired of remainding!"};
                
                if(errorCount < 3){
                    message = String.valueOf(numGuess)+"is greater than the random number!";
                }
                else{
                    int randomMes = (int) Math.round(Math.random() * 3);
                    message = messageCat1[randomMes];
                }
                break;
        }
        return message;
    }
    
    private void updateBestScore(){
        if(yourScore > bestScore){
            Gui._message("Congratulations! New best score!", 1);
            Gui.setNewBestScore("bestScore["+yourScore+"]");
            bestScore = yourScore;
            txtbestscore.setText("Best Score: "+bestScore);
        }
    }
    
    private void newGame(){
        txtguess.setText("");
        txtguess.requestFocus();
        txtremarks.setText("-----------------Try your luck :)-----------------");
        txthide.setEnabled(false);
        txtshow.setEnabled(true);
        
        txtshowrandom.setText("?");
        txtguesses.setText("Guesses: 0");
        guessCount = 0;
        
        txtlife.setText("Life: 10");
        txtlife.setIcon(null);
        lifeCount = 10;
        
        greaterThanError = 0;
        lessThanError = 0;
        
        random = GuessNumbers._randomNumber();
           
    }
    
    private void reset(){
        txtguess.setText("");
        txtguess.requestFocus();
        txtremarks.setText("-----------------Try your luck :)-----------------");
        txthide.setEnabled(false);
        txtshow.setEnabled(true);
        
        txtshowrandom.setText("?");
        txtguesses.setText("Guesses: 0");
        guessCount = 0;
        
        txtlife.setText("Life: 10");
        txtlife.setIcon(null);
        lifeCount = 10;
        
        greaterThanError = 0;
        lessThanError = 0;
        
        random = GuessNumbers._randomNumber();
        
        txtscore.setText("Score: 0");
        yourScore = 0;
        
        bestScore = 0;
        Gui.setNewBestScore("bestScore["+yourScore+"]");
        txtbestscore.setText("Best Score: 0");
           
    }

}
