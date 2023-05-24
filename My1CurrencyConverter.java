
package My1Currency__Converter;

import javax.swing.JOptionPane;

/**
 *
 * @author Navneet Sharma
 */
public class My1CurrencyConverter extends javax.swing.JFrame {
       
    String[] currUnit = {
"units",
"Indian Rupee INR",
"US Dollar USD",
"Canadian Dollar CAD",
"Brazilian Real BRL",
"Nigerian Naira NGN",
"Kenya Shilling KES",
"Indonesian Rupiah IDR",
"Philippine Peso PHP",
"Pakistan Rupee PKR" 
    };
    
double Indian_Rupee = 102.786;             //initialization - pound
double US_Dollar = 1.2574;
double Canadian_Dollar = 1.7025;
double Brazilian_Real = 6.2703;
double Nigerian_Naira = 579.11;
double Kenya_Shilling = 171.005;
double Indonesian_Rupiah = 18491.1765;
double Philippine_Peso = 69.7587;
double Pakistani_Rupee = 356.8104;


    /**
     * Creates new form My1CurrencyConverter
     */
    public My1CurrencyConverter() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstcountry = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Text1 = new javax.swing.JTextField();
        Text2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstcurrencyunit = new javax.swing.JLabel();
        secondcurrencyunit = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        secondcountry = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(246, 242, 242));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 32)); // NOI18N
        jLabel1.setText("Currency Converter");

        firstcountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Currency (Country)...", "India", "USA", "Canada", "Brazil", "Nigeria", "Kenya", "Indonesia", "Philippine", "Pakistan" }));
        firstcountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstcountryItemStateChanged(evt);
            }
        });
        firstcountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstcountryActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text1ActionPerformed(evt);
            }
        });

        Text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("From");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("To");

        firstcurrencyunit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstcurrencyunit.setText("Units");

        secondcurrencyunit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        secondcurrencyunit.setText("Units");

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setText("Exit");
        jButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jButton3ItemStateChanged(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        secondcountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Currency (Country)...", "India", "USA", "Canada", "Brazil", "Nigeria", "Kenya", "Indonesia", "Philippine", "Pakistan" }));
        secondcountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondcountryItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(firstcurrencyunit)
                        .addComponent(secondcurrencyunit)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3))
                                .addComponent(Text2)
                                .addComponent(firstcountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Text1)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(secondcountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secondcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(firstcurrencyunit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(secondcurrencyunit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Currency Convert:
        
        if(firstcountry.getSelectedIndex() == 0 || secondcountry.getSelectedIndex() == 0 || Text1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,
                    "!!!!Please Select Both Countries and Enter the Amount.!!!!","***Error Message***",
                    JOptionPane.INFORMATION_MESSAGE 
         
                    );
            return;      
        }
        
        double amountTochange = Double.parseDouble(Text1.getText());
        double amountInpounds = 0.0;
        
        switch(firstcountry.getSelectedItem().toString())
        {
            case "India": 
            amountInpounds = amountTochange / Indian_Rupee;
            break;
            case "USA": 
            amountInpounds = amountTochange / US_Dollar;
            break;
            case "Canada": 
            amountInpounds = amountTochange / Canadian_Dollar;
            break;
            case "Brazil": 
            amountInpounds = amountTochange / Brazilian_Real;
            break;
            case "Nigeria": 
            amountInpounds = amountTochange / Nigerian_Naira;
            break;
            case "Kenya": 
            amountInpounds = amountTochange / Kenya_Shilling;
            break;
            case "Indonesia": 
            amountInpounds = amountTochange / Indonesian_Rupiah;
            break;
            case "Philippine": 
            amountInpounds = amountTochange / Philippine_Peso;
            break;
            case "Pakistan": 
            amountInpounds = amountTochange / Pakistani_Rupee;
            break;
        }
        
        double amountChanged = 0.0;
        switch(secondcountry.getSelectedItem().toString())
        {    
            case "India":
            amountChanged = amountInpounds * Indian_Rupee;
            break;
            case "USA":
            amountChanged = amountInpounds * US_Dollar;
            break;
            case "Canada":
            amountChanged = amountInpounds * Canadian_Dollar;
            break;
            case "Brazil":
            amountChanged = amountInpounds * Brazilian_Real;
            break;
            case "Nigeria":
            amountChanged = amountInpounds * Nigerian_Naira;
            break;
            case "Kenya":
            amountChanged = amountInpounds * Kenya_Shilling;
            break;
            case "Indonesia":
            amountChanged = amountInpounds * Indonesian_Rupiah;
            break;
            case "Philippine":
            amountChanged = amountInpounds * Philippine_Peso;
            break;
            case "Pakistan":
            amountChanged = amountInpounds * Pakistani_Rupee;
            break;
            default:amountChanged = amountInpounds * 0.0;
        }
        
        
        String value = String.format("%.3f",amountChanged);
        Text2.setText(value);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Reset The Process
        firstcountry.setSelectedIndex(0);
        secondcountry.setSelectedIndex(0);
        Text1.setText(null);
        Text2.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text2ActionPerformed

    private void firstcountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstcountryItemStateChanged
         // 1 unit change    
        int position=firstcountry.getSelectedIndex();
        
        firstcurrencyunit.setText(currUnit[position]);       
    }//GEN-LAST:event_firstcountryItemStateChanged

    private void secondcountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secondcountryItemStateChanged
        // 2 unit change:
        int position=secondcountry.getSelectedIndex();
        
        secondcurrencyunit.setText(currUnit[position]);
    }//GEN-LAST:event_secondcountryItemStateChanged

    private void jButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jButton3ItemStateChanged
      
    }//GEN-LAST:event_jButton3ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Working of exit button:
           System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void firstcountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstcountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstcountryActionPerformed

    private void Text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text1ActionPerformed

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
            java.util.logging.Logger.getLogger(My1CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(My1CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(My1CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(My1CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new My1CurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Text1;
    private javax.swing.JTextField Text2;
    private javax.swing.JComboBox<String> firstcountry;
    private javax.swing.JLabel firstcurrencyunit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> secondcountry;
    private javax.swing.JLabel secondcurrencyunit;
    // End of variables declaration//GEN-END:variables
}
