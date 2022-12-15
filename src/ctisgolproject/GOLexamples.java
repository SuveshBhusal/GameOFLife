package ctisgolproject;

public class GOLexamples extends javax.swing.JFrame {
    public static int cT = 0; //callThis
    public GOLexamples() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonExample1 = new javax.swing.JRadioButton();
        buttonExample2 = new javax.swing.JRadioButton();
        buttonExample3 = new javax.swing.JRadioButton();
        buttonRunExample = new javax.swing.JButton();
        backbuttonEX = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup3.add(buttonExample1);
        buttonExample1.setText("Example 1");

        buttonGroup3.add(buttonExample2);
        buttonExample2.setText("Example 2");

        buttonGroup3.add(buttonExample3);
        buttonExample3.setText("Example 3");

        buttonRunExample.setText("Run");
        buttonRunExample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRunExampleActionPerformed(evt);
            }
        });

        backbuttonEX.setText("Back");
        backbuttonEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonEXActionPerformed(evt);
            }
        });

        jLabel1.setText("Here are some premade examples to show what kind of simulations can be makes using the GOL rules");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(buttonExample1)
                        .addGap(104, 104, 104)
                        .addComponent(buttonExample2)
                        .addGap(124, 124, 124)
                        .addComponent(buttonExample3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backbuttonEX)
                            .addComponent(buttonRunExample))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonExample1)
                    .addComponent(buttonExample2)
                    .addComponent(buttonExample3))
                .addGap(53, 53, 53)
                .addComponent(buttonRunExample)
                .addGap(78, 78, 78)
                .addComponent(backbuttonEX)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRunExampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRunExampleActionPerformed
        if (buttonExample1.isSelected()){
            cT = 1;
        } else if (buttonExample2.isSelected()){
            cT = 2;
        } else if (buttonExample3.isSelected()){
            cT = 3;
        } else{
            cT = 1;
        }
        new GOLDrawer().setVisible(true);
    }//GEN-LAST:event_buttonRunExampleActionPerformed

    private void backbuttonEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonEXActionPerformed
        // TODO add your handling code here:
         dispose();
         
        GOLGUI gui=new GOLGUI();
        gui.setVisible(true);
    }//GEN-LAST:event_backbuttonEXActionPerformed

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
            java.util.logging.Logger.getLogger(GOLexamples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GOLexamples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GOLexamples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GOLexamples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GOLexamples().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbuttonEX;
    private javax.swing.JRadioButton buttonExample1;
    private javax.swing.JRadioButton buttonExample2;
    private javax.swing.JRadioButton buttonExample3;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton buttonRunExample;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
