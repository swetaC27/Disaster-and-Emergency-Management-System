/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StaffAndVolunteerAdmin;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Member.Member;
import Business.Organization.Organization;
import Business.Organization.StaffOrganization;
import Business.Role.Role;
import Business.Role.StaffAndVolunteerAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sweta Chowdhury
 */
public class ManageUsersJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private StaffOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;

    /**
     * Creates new form ManageUsersJPanel
     */
    public ManageUsersJPanel(JPanel userProcessContainer, UserAccount account, StaffOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        populateOrganizationBox();
        populateEmployeeBox(organization);
        populateRoleBox(organization);
        populateJTable();
    }

    public void populateOrganizationBox() {
        organizationJCombo.removeAllItems();
        organizationJCombo.addItem(organization);
    }

    public void populateEmployeeBox(StaffOrganization organization) {
        membersJCombo.removeAllItems();
        for (Member member : organization.getMemberDirectory().getMemberList()) {
            membersJCombo.addItem(member);
        }
    }

    public void populateRoleBox(StaffOrganization organization) {
        rolesJCombo.removeAllItems();
        for (Role role :  organization.getSupportedRole()) {
            if (role instanceof StaffAndVolunteerAdminRole) {               
            }
            else {
                rolesJCombo.addItem(role);
            }
            
        }
    }

    public void populateJTable() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();
        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount user : organization.getUserAccountDirectory().getUserAccountList()) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = user;
                row[1] = user.getRole();

                model.addRow(row);
            }
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
        userJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        rolesJCombo = new javax.swing.JComboBox();
        membersJCombo = new javax.swing.JComboBox();
        passwordField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        organizationJCombo = new javax.swing.JComboBox();
        backButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE STAFF AND VOLUNTEERS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, 41));

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Username", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 500, 240));

        jLabel3.setText("ORGANIZATION:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 170, 40));

        jLabel4.setText("EMPLOYEE:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 170, 40));

        jLabel7.setText("ROLE:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 170, 40));

        jLabel5.setText("USER NAME:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 170, 40));

        jLabel6.setText("PASSWORD:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 130, 40));

        createButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        createButton.setText("CREATE");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 210, 60));

        rolesJCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(rolesJCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 250, 40));

        membersJCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(membersJCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 250, 40));
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 250, 40));
        add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 250, 40));

        organizationJCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(organizationJCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 250, 40));

        backButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 160, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        String username = usernameField.getText();
        String password = passwordField.getText();

        boolean isValidUser = validateStrings(username);
        boolean isValidPass = validatePwd(password);

        if (isValidUser && isValidPass) {
            StaffOrganization organization = (StaffOrganization) organizationJCombo.getSelectedItem();
            Member member = (Member) membersJCombo.getSelectedItem();
            Role role = (Role) rolesJCombo.getSelectedItem();
            organization.getUserAccountDirectory().createUserAccount(username, password, null, role, enterprise.getNetworkName(), member);
            populateJTable();
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    public boolean validateStrings(String name) {
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter mandatory value", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        Pattern pattern = Pattern.compile("[a-zA-Z ]*");
        Matcher matcher = pattern.matcher(name);
        if (!matcher.matches()) {

            JOptionPane.showMessageDialog(null, "Please Enter valid string value", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean validatePwd(String name) {
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Password", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox membersJCombo;
    private javax.swing.JComboBox organizationJCombo;
    private javax.swing.JTextField passwordField;
    private javax.swing.JComboBox rolesJCombo;
    private javax.swing.JTable userJTable;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
