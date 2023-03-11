
package components;

import java.awt.event.ActionListener;
import javax.swing.JLabel;


public class Header extends javax.swing.JPanel {

    public Header() {
        initComponents();
    }

    public void addMenuEvent(ActionListener event){
        btnMenu.addActionListener(event);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenu = new utils.swing.CustomButton();
        pic = new utils.swing.ImageAvatar();
        txtUserName = new javax.swing.JLabel();
        txtRole = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        buttonBadges1 = new utils.swing.ButtonBadges();
        buttonBadges2 = new utils.swing.ButtonBadges();

        setBackground(new java.awt.Color(255, 255, 255));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/menu.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/images_avatar.png"))); // NOI18N

        txtUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtUserName.setText("User Name");

        txtRole.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtRole.setText("Admin");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        buttonBadges1.setForeground(new java.awt.Color(204, 0, 0));
        buttonBadges1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/message.png"))); // NOI18N
        buttonBadges1.setBadges(20);
        buttonBadges1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges1ActionPerformed(evt);
            }
        });

        buttonBadges2.setForeground(new java.awt.Color(204, 0, 0));
        buttonBadges2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/notification.png"))); // NOI18N
        buttonBadges2.setBadges(12);
        buttonBadges2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 427, Short.MAX_VALUE)
                .addComponent(buttonBadges1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonBadges2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(buttonBadges1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRole)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(buttonBadges2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuActionPerformed

    private void buttonBadges1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBadges1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBadges1ActionPerformed

    private void buttonBadges2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBadges2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBadges2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.swing.CustomButton btnMenu;
    private utils.swing.ButtonBadges buttonBadges1;
    private utils.swing.ButtonBadges buttonBadges2;
    private javax.swing.JSeparator jSeparator2;
    private utils.swing.ImageAvatar pic;
    private javax.swing.JLabel txtRole;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables

    public void setTxtRole(String text) {
        this.txtRole.setText(text);
    }

    public void setTxtUserName(String text) {
        this.txtUserName.setText(text);
    }
}
