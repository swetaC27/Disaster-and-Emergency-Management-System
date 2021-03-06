/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HousingAdmin;

import Business.Housing.Housing;
import Business.Organization.HousingOrganization;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sweta Chowdhury
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    
    private JPanel userProcessContainer;
//    private Organization organization;
    private HousingOrganization organization;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer, HousingOrganization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        
        populateTable();
    }    
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        model.setRowCount(0);
                 
        for(Housing house : organization.getHousingDirectory().getHousingList()) {
            Object[] row = new Object[model.getColumnCount()];
            row[0] = house;
            row[1] = house.getHouseCapacity();
            
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
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addJButton1 = new javax.swing.JButton();
        backJButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE ORGANIZATION WORKAREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 41));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("MANAGE ORGANIZATION WORKAREA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 41));

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Capacity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(organizationJTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 710, 160));

        addJButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        addJButton1.setText("ADD ORGANIZATION");
        addJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(addJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 250, 40));

        backJButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backJButton1.setText("<<BACK");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 170, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButton1ActionPerformed
        ManageShelterJPanel manageShelterJPanel = new ManageShelterJPanel(userProcessContainer,organization);
        userProcessContainer.add("manageOrgJPanel", manageShelterJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addJButton1ActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton1;
    private javax.swing.JButton backJButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
