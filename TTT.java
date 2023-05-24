
/**
 *
 * @author Navneet Sharma
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

        
public class TTT extends javax.swing.JFrame {

    private String startGame = "X";
    private int xcount = 0;
    private int ocount = 0;
    boolean checker;
    
    
    public TTT() {
        initComponents();
    }

    private void gamescore()
    {
        PlayerX.setText(String.valueOf(xcount));
        PlayerO.setText(String.valueOf(ocount));
    }
    
    private void choosing_player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    
    private void Gamewinning()
    {
       String btn1 = jButton1.getText();
       String btn2 = jButton2.getText();
       String btn3 = jButton3.getText();
       String btn4 = jButton4.getText();
       String btn5 = jButton5.getText();
       String btn6 = jButton6.getText();
       String btn7 = jButton7.getText();
       String btn8 = jButton8.getText();
       String btn9 = jButton9.getText();
     
       
       if (btn1 == ("X") && btn2 == ("X") && btn3 == ("X") )
       {
           JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                
           jButton1.setBackground(Color.cyan);
           jButton2.setBackground(Color.cyan);   
           jButton3.setBackground(Color.cyan);
           xcount++;
           gamescore();
       }
       
       if (btn4 == ("X") && btn5 == ("X") && btn6 == ("X") )
       {
           JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                
           jButton4.setBackground(Color.cyan);
           jButton5.setBackground(Color.cyan);   
           jButton6.setBackground(Color.cyan);
           xcount++;
           gamescore();
       }
          
        if (btn7 == ("X") && btn8 == ("X") && btn9 == ("X") )
       {
           JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                
           jButton7.setBackground(Color.cyan);
           jButton8.setBackground(Color.cyan);   
           jButton9.setBackground(Color.cyan);
           xcount++;
           gamescore();
       }
 
        if (btn1 == ("X") && btn4== ("X") && btn7 == ("X") )
       {
           JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                
           jButton1.setBackground(Color.green);
           jButton4.setBackground(Color.green);   
           jButton7.setBackground(Color.green);
           xcount++;
           gamescore();
       }
    
        if (btn2 == ("X") && btn5 == ("X") && btn8 == ("X") )
       {
           JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                
           jButton2.setBackground(Color.green);
           jButton5.setBackground(Color.green);   
           jButton8.setBackground(Color.green);
           xcount++;
           gamescore();
       }
    
        if (btn3 == ("X") && btn6 == ("X") && btn9 == ("X") )
       {
           JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                
           jButton3.setBackground(Color.green);
           jButton6.setBackground(Color.green);   
           jButton9.setBackground(Color.green);
           xcount++;
           gamescore();
       }
         
        if (btn1 == ("X") && btn5 == ("X") && btn9 == ("X") )
       {
           JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                
           jButton1.setBackground(Color.yellow);
           jButton5.setBackground(Color.yellow);   
           jButton9.setBackground(Color.yellow);
           xcount++;
           gamescore();
       }
    
        if (btn3 == ("X") && btn5 == ("X") && btn7 == ("X") )
       {
           JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                
           jButton3.setBackground(Color.yellow);
           jButton5.setBackground(Color.yellow);   
           jButton7.setBackground(Color.yellow);
           xcount++;
           gamescore();
       }
        
        if (btn1 == ("O") && btn2 == ("O") && btn3 == ("O") )
       {
           JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                
           jButton1.setBackground(Color.magenta);
           jButton2.setBackground(Color.magenta);   
           jButton3.setBackground(Color.magenta);
           ocount++;
           gamescore();
       }
        
        if (btn4 == ("O") && btn5 == ("O") && btn6 == ("O") )
       {
           JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                
           jButton4.setBackground(Color.magenta);
           jButton5.setBackground(Color.magenta);   
           jButton6.setBackground(Color.magenta);
           ocount++;
           gamescore();
       }
        
        if (btn7 == ("O") && btn8 == ("O") && btn9 == ("O") )
       {
           JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                
           jButton7.setBackground(Color.magenta);
           jButton8.setBackground(Color.magenta);   
           jButton9.setBackground(Color.magenta);
           ocount++;
           gamescore();
       }
        
        if (btn1 == ("O") && btn4 == ("O") && btn7 == ("O") )
       {
           JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                
           jButton1.setBackground(Color.pink);
           jButton4.setBackground(Color.pink);   
           jButton7.setBackground(Color.pink);
           ocount++;
           gamescore();
       }
        
        if (btn2 == ("O") && btn5 == ("O") && btn8 == ("O") )
       {
           JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                
           jButton2.setBackground(Color.pink);
           jButton5.setBackground(Color.pink);   
           jButton8.setBackground(Color.pink);
           ocount++;
           gamescore();
       }
        
        if (btn3 == ("O") && btn6 == ("O") && btn9 == ("O") )
       {
           JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                
           jButton3.setBackground(Color.pink);
           jButton6.setBackground(Color.pink);   
           jButton9.setBackground(Color.pink);
           ocount++;
           gamescore();
       }
        
        if (btn1 == ("O") && btn5 == ("O") && btn9 == ("O") )
       {
           JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                
           jButton1.setBackground(Color.BLUE);
           jButton5.setBackground(Color.BLUE);   
           jButton9.setBackground(Color.BLUE);
           ocount++;
           gamescore();
       }
        
        if (btn3 == ("O") && btn5 == ("O") && btn7 == ("O") )
       {
           JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                
           jButton3.setBackground(Color.BLUE);
           jButton5.setBackground(Color.BLUE);   
           jButton7.setBackground(Color.BLUE);
           ocount++;
           gamescore();
       }
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        NewGame = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PlayerX = new javax.swing.JLabel();
        PlayerO = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(153, 153, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(153, 153, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel11.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 310, 110));

        NewGame.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        NewGame.setText("New Game");
        NewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameActionPerformed(evt);
            }
        });
        jPanel11.add(NewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 120));

        Reset.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel11.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 310, 110));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 650, 260));

        jPanel12.setBackground(new java.awt.Color(153, 153, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 76)); // NOI18N
        jLabel3.setText("Player O:");
        jPanel12.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 76)); // NOI18N
        jLabel4.setText("Player X:");
        jPanel12.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        PlayerX.setFont(new java.awt.Font("Tahoma", 1, 76)); // NOI18N
        PlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerX.setText("0");
        PlayerX.setOpaque(true);
        jPanel12.add(PlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 260, 80));

        PlayerO.setFont(new java.awt.Font("Tahoma", 1, 76)); // NOI18N
        PlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerO.setText("0");
        PlayerO.setOpaque(true);
        jPanel12.add(PlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 260, 80));

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 240));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 670, 540));

        jPanel10.setBackground(new java.awt.Color(153, 153, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 210, 160));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 210, 160));

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 210, 160));

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 210, 160));

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 210, 160));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 210, 160));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 210, 160));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 210, 160));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 210, 160));

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 670, 540));

        jPanel13.setBackground(new java.awt.Color(153, 153, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 76)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tic Tac Toe Game");
        jPanel13.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1350, 120));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        jButton8.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choosing_player();
        Gamewinning();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        jButton9.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choosing_player();
        Gamewinning();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        jButton3.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choosing_player();
        Gamewinning();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        jButton2.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choosing_player();
        Gamewinning();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
        jButton7.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choosing_player();
        Gamewinning();
    }//GEN-LAST:event_jButton7ActionPerformed
    
  
private JFrame frame;
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // Working of Exit Button:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Are You Sure, You Want To Quit The Game?","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION  )== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
  
    }//GEN-LAST:event_ExitActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        jButton6.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choosing_player();
        Gamewinning();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        jButton4.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choosing_player();
        Gamewinning();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void NewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameActionPerformed
        // New Game:
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        PlayerX.setText("0");
        PlayerO.setText("0");        

        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
       
    }//GEN-LAST:event_NewGameActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // Workin of Reset Button:
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);

        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_ResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jButton1.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choosing_player();
        Gamewinning();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        jButton5.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        choosing_player();
        Gamewinning();
    }//GEN-LAST:event_jButton5ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TTT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton NewGame;
    private javax.swing.JLabel PlayerO;
    private javax.swing.JLabel PlayerX;
    private javax.swing.JButton Reset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
