
package components;

import models.ModelProfile;

public class ProfilePanel extends javax.swing.JPanel {


    public ProfilePanel(ModelProfile data) {
        initComponents();
        imageEmp.setIcon(data.getIcon());
        lableEmpName.setText(data.getName());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageEmp = new utils.swing.ImageAvatar();
        lableEmpName = new javax.swing.JLabel();

        lableEmpName.setForeground(new java.awt.Color(120, 120, 120));
        lableEmpName.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lableEmpName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lableEmpName)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.swing.ImageAvatar imageEmp;
    private javax.swing.JLabel lableEmpName;
    // End of variables declaration//GEN-END:variables
}
