/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DisasterVictimRegistry;

import Business.DisasterRegistry.DisasterVictim;
import Business.Employee.Employee;
import Business.Organization.DisasterVictimOrganization;
import Business.Organization.Organization;
import Business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

/**
 *
 * @author mamta
 */
public class CreateVictimJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateVictimJPanel
     */
    JPanel userProcessContainer;
    DisasterVictimOrganization organization;
    public File file;
    //DisasterVictim disasterVictim = new DisasterVictim();
    //DisasterRegistryWorkRequest drwr = new DisasterRegistryWorkRequest();
    public CreateVictimJPanel(JPanel userProcessContainer, DisasterVictimOrganization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        populateVictimCombo();
    }

    public void populateVictimCombo() {
        victimCombo.removeAllItems();
        victimCombo.addItem("Victim");
        victimCombo.addItem("Missing Person");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        nameTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        imgTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        imgBtn = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contactTxt = new javax.swing.JTextField();
        nationalityTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        victimCombo = new javax.swing.JComboBox();
        genderBtn = new javax.swing.JRadioButton();
        genderBtn1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        jLabel1.setText("Name:");

        jLabel2.setText("Age:");

        gender.setText("Gender:");

        jLabel4.setText("Photo:");

        ageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtActionPerformed(evt);
            }
        });

        imgTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgTxtActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        imgBtn.setText("Upload Image");
        imgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgBtnActionPerformed(evt);
            }
        });

        jButton1.setText("< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nationality:");

        jLabel5.setText("Address:");

        jLabel6.setText("Contact:");

        contactTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTxtActionPerformed(evt);
            }
        });

        nationalityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationalityTxtActionPerformed(evt);
            }
        });

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });

        victimCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        victimCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                victimComboActionPerformed(evt);
            }
        });

        genderGroup.add(genderBtn);
        genderBtn.setText("Male");

        genderGroup.add(genderBtn1);
        genderBtn1.setText("Female");

        jLabel7.setText("Victim Type:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("CREATE VICTIM REGISTRY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(gender)
                                    .addComponent(jLabel7))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nationalityTxt)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(genderBtn)
                                            .addGap(42, 42, 42)
                                            .addComponent(genderBtn1))
                                        .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                        .addComponent(ageTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                        .addComponent(imgBtn)
                                        .addComponent(imgTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                        .addComponent(contactTxt)
                                        .addComponent(addressTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                        .addComponent(victimCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jButton1)
                                .addGap(91, 91, 91)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(genderBtn)
                    .addComponent(genderBtn1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nationalityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(victimCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(imgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(imgBtn)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(152, 152, 152))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void ageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxtActionPerformed

    private void imgTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imgTxtActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        //WorkQueue wq = organization.getWorkQueue();
        String gender="";
        if(genderGroup.getSelection().equals(genderBtn.getModel())){
            gender= "Male";
        }else if (genderGroup.getSelection().equals(genderBtn1.getModel())){
            gender= "Female";
        }
        long contact = Long.parseLong(contactTxt.getText());
        String address = addressTxt.getText();
        String nationality = nationalityTxt.getText();
        String type = victimCombo.getSelectedItem().toString();
        
        //System.out.println(gender);
        organization.getDisasterVictimDirectory().createVictimRegistry(nameTxt.getText(),Integer.parseInt(ageTxt.getText()),gender,contact,address,nationality,file,type);
        
       // wq.getWorkRequestList().add(disasterVictim);
               
    }//GEN-LAST:event_saveBtnActionPerformed

    private void imgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            file = chooser.getSelectedFile();
            String fileText = file.getAbsolutePath();
            imgTxt.setText(fileText);         
            try {
                BufferedImage img = ImageIO.read(new File(file.getAbsolutePath()));
                ImageIcon image=new ImageIcon(scaleImage(232, 165, img));//get the image from file chooser and scale it to match JLabel size
                
                lbl.setIcon(image);
            } catch (Exception ex) {}
    }                                        
   
    public static BufferedImage scaleImage(int width, int height, BufferedImage img) throws Exception {
            BufferedImage bufferImage = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
            Graphics2D grahpicImage = (Graphics2D) bufferImage.createGraphics();
            grahpicImage.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            grahpicImage.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
            grahpicImage.drawImage(img, 0, 0, width, height, null);
            grahpicImage.dispose();
            return bufferImage;
    }//GEN-LAST:event_imgBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void contactTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTxtActionPerformed

    private void nationalityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalityTxtActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void victimComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_victimComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_victimComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JTextField contactTxt;
    private javax.swing.JLabel gender;
    private javax.swing.JRadioButton genderBtn;
    private javax.swing.JRadioButton genderBtn1;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JButton imgBtn;
    private javax.swing.JTextField imgTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField nationalityTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox victimCombo;
    // End of variables declaration//GEN-END:variables
}
