package form;

import icon.GoogleMaterialDesignIcons;
import icon.IconFontSwing;
import java.awt.Color;
import javax.swing.Icon;
import models.ModelCard;

public class HomeForm extends javax.swing.JPanel {

    public HomeForm() {
        initComponents();
        setOpaque(false);
        initData();
    }

    private void initData() {
        initCardData();
    }

    private void initCardData() {
        Icon icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.GROUP, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        cardGroup.setData(new ModelCard("GROUPS", 20, 80, icon));

        icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.PEOPLE, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        cardTeam.setData(new ModelCard("TEAMS", 160, 70, icon));

        icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.PARTY_MODE, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        cardPart.setData(new ModelCard("PARTS", 1540, 80, icon));

        icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.PERSON, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        cardEmp.setData(new ModelCard("EMPLOYEES", 55500, 80, icon));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardGroup = new components.Card();
        jLabel1 = new javax.swing.JLabel();
        cardTeam = new components.Card();
        cardPart = new components.Card();
        cardEmp = new components.Card();

        cardGroup.setColorGradient(new java.awt.Color(211, 28, 215));

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Dashboard / Home");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cardGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cardTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cardPart, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cardEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardPart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.Card cardEmp;
    private components.Card cardGroup;
    private components.Card cardPart;
    private components.Card cardTeam;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
