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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonRunExample)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonExample1)
                        .addGap(28, 28, 28)
                        .addComponent(buttonExample2)))
                .addGap(18, 18, 18)
                .addComponent(buttonExample3)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonExample1)
                    .addComponent(buttonExample2)
                    .addComponent(buttonExample3))
                .addGap(45, 45, 45)
                .addComponent(buttonRunExample)
                .addContainerGap(85, Short.MAX_VALUE))
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
    private javax.swing.JRadioButton buttonExample1;
    private javax.swing.JRadioButton buttonExample2;
    private javax.swing.JRadioButton buttonExample3;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton buttonRunExample;
    // End of variables declaration//GEN-END:variables
}
