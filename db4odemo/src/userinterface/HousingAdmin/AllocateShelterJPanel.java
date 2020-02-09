/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HousingAdmin;
import Business.Housing.Housing;
import Business.Housing.HousingDirectory;
import Business.Organization.HousingOrganization;
import Business.Organization.Organization;
import Business.Organization.HousingOrganization;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sweta Chowdhury
 */
public class AllocateShelterJPanel extends javax.swing.JPanel {

    
    private JPanel userProcessContainer;
    private HousingOrganization housingOrganization;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public AllocateShelterJPanel(JPanel userProcessContainer, HousingOrganization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.housingOrganization = organization;
        
        populateCombo();
    }

    
    public void populateCombo() {
        shelterNamesJComboBox.removeAllItems();
        
        for(Housing housing : housingOrganization.getHousingDirectory().getHousingList()) {
            shelterNamesJComboBox.addItem(housing.getHouseName());
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
        addJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        shelterNamesJComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("ALLOCATE HOUSING WORKAREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, 41));

        addJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        addJButton.setText("ALLOCATE HOUSING");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 250, 40));

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backJButton.setText("<<BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 170, 40));

        shelterNamesJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(shelterNamesJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 160, -1));

        jLabel2.setText("Housing Organization : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 150, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        /*OrganizationType type = (OrganizationType) shelterStatusJComboBox.getSelectedItem();
        directory.createOrganization(type);
        populateTable();*/
    }//GEN-LAST:event_addJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> shelterNamesJComboBox;
    // End of variables declaration//GEN-END:variables
}