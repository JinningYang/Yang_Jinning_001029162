/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info5100.labpp.interfa;

import edu.neu.info5100.labpp.Person;
import javax.swing.JScrollPane;

/**
 *
 * @author kathe
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private Person person; 
    public MainJFrame() {
        initComponents();
        person=new Person();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPanel = new javax.swing.JSplitPane();
        ControlJPanel = new javax.swing.JPanel();
        CreateJButton = new javax.swing.JButton();
        ViewJButton = new javax.swing.JButton();
        displayJPanel = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CreateJButton.setText("Create");
        CreateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateJButtonActionPerformed(evt);
            }
        });

        ViewJButton.setText("View");
        ViewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlJPanelLayout = new javax.swing.GroupLayout(ControlJPanel);
        ControlJPanel.setLayout(ControlJPanelLayout);
        ControlJPanelLayout.setHorizontalGroup(
            ControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ControlJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CreateJButton, ViewJButton});

        ControlJPanelLayout.setVerticalGroup(
            ControlJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlJPanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(CreateJButton)
                .addGap(54, 54, 54)
                .addComponent(ViewJButton)
                .addContainerGap(456, Short.MAX_VALUE))
        );

        ControlJPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CreateJButton, ViewJButton});

        splitPanel.setLeftComponent(ControlJPanel);
        splitPanel.setRightComponent(displayJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateJButtonActionPerformed
        // TODO add your handling code here:
        CreateJPanel createJPanel=new CreateJPanel(person);
        JScrollPane scrollpane = new JScrollPane(createJPanel);
        splitPanel.setRightComponent(scrollpane);
    }//GEN-LAST:event_CreateJButtonActionPerformed

    private void ViewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewJButtonActionPerformed
        // TODO add your handling code here:
        ViewJPanel viewJPanel=new ViewJPanel(person);
        splitPanel.setRightComponent(viewJPanel);
    }//GEN-LAST:event_ViewJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlJPanel;
    private javax.swing.JButton CreateJButton;
    private javax.swing.JButton ViewJButton;
    private javax.swing.JScrollPane displayJPanel;
    private javax.swing.JSplitPane splitPanel;
    // End of variables declaration//GEN-END:variables
}
