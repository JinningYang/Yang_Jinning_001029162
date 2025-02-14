/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.RestaurantAdminRole;

import Business.Restaurant.Menu;
import Business.Restaurant.RestaurantMana;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.ManageCustomerJPanel;

/**
 *
 * @author kathe
 */
public class MenuInfoJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private ArrayList<Menu>menulist;
    /**
     * Creates new form MenuInfoJPanel
     */
    public MenuInfoJPanel(JPanel userProcessContainer,RestaurantMana manager) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.menulist=manager.getManagedRestaurant().getMenuDirectory().getMenuList();
        populateTable();
    }
    public void populateTable(){
        DefaultTableModel model=(DefaultTableModel)menuJTable.getModel();
        model.setRowCount(0);
        
        for(Menu menu:menulist){
            Object[]row=new Object[3];
            row[0]=menu.getMenuId();
            row[1]=menu.getMenuName();
            row[2]=menu.getPrice();
            
            model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuJTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        createJButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        viewJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        menunameJtext = new javax.swing.JTextField();
        priceJtext = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Menu Info");

        menuJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Menu ID", "Menu Name", "Menu Price"
            }
        ));
        jScrollPane1.setViewportView(menuJTable);

        backButton.setText("<<back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        createJButton.setText("Create");
        createJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        viewJButton.setText("View");
        viewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Name:");

        jLabel4.setText("Price");

        menunameJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        menunameJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        menunameJtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menunameJtextActionPerformed(evt);
            }
        });

        priceJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        priceJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        priceJtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceJtextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(createJButton)
                                .addGap(45, 45, 45)
                                .addComponent(deleteButton)
                                .addGap(46, 46, 46)
                                .addComponent(viewJButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(menunameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(menunameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(priceJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createJButton)
                    .addComponent(deleteButton)
                    .addComponent(viewJButton))
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminWorkAreaJPanel adminWorkAreaJPanel = (AdminWorkAreaJPanel) component;
        //manageRestaurantManaJPanel.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void menunameJtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menunameJtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menunameJtextActionPerformed

    private void priceJtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceJtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceJtextActionPerformed

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButtonActionPerformed
        // TODO add your handling code here:
        String name=menunameJtext.getText();
        String price=String.valueOf(priceJtext.getText());
        
        for(Menu menu:menulist){
            if(name == null ? menu.getMenuName() == null : name.equalsIgnoreCase(menu.getMenuName())){
                JOptionPane.showMessageDialog(null, "Username Has Been Used! ");
                return;
            }
        }
        if (name== null ||name.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input the menu name!", "CREATE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Double p;
        try {
            p = Double.parseDouble(price);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid number format! ");
            return;
        }
        menulist.add(new Menu(name, p));
        populateTable();
    }//GEN-LAST:event_createJButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow=menuJTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??", "Warning", selectionButton);
            
            if (selectionResult == JOptionPane.YES_OPTION) {
                Integer MenuSelectedRow=(Integer)menuJTable.getValueAt(selectedRow,0);
                for(Menu menu:menulist){
                    if(MenuSelectedRow.equals(menu.getMenuId())){
                        menulist.remove(menu);
                        break;
                    }
                }
                
                populateTable();
            }else{
                JOptionPane.showMessageDialog(null, "Please select a Row!!");
            }
            
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow=menuJTable.getSelectedRow(),col=0;
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select at least a row.", "INFORMATION", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Integer menuSelectedRow=(Integer)menuJTable.getValueAt(selectedRow, 0);
        Menu mu=null;
        for(Menu menu:menulist){
            if(menuSelectedRow.equals(menu.getMenuId())){
                mu=menu;
                break;
            }
        }
        
        this.userProcessContainer.add("ViewMenuInfoJPanel",new ViewMenuInfoJPanel(this.userProcessContainer,this,mu));
        CardLayout cLayout = (CardLayout) this.userProcessContainer.getLayout();
        cLayout.next(userProcessContainer);
        populateTable();
       
    }//GEN-LAST:event_viewJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createJButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable menuJTable;
    private javax.swing.JTextField menunameJtext;
    private javax.swing.JTextField nameJtext;
    private javax.swing.JTextField nameJtext1;
    private javax.swing.JTextField nameJtext2;
    private javax.swing.JTextField priceJtext;
    private javax.swing.JButton viewJButton;
    // End of variables declaration//GEN-END:variables
}
