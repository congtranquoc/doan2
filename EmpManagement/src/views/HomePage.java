/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import components.Header;
import form.MainForm;
import components.Menu;
import event.EventMenuSelected;
import event.EventShowPopupMenu;
import form.HomeForm;
import icon.GoogleMaterialDesignIcons;
import icon.IconFontSwing;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import utils.swing.MenuItem;
import utils.swing.PopupMenu;

/**
 *
 * @author admin
 */
public class HomePage extends javax.swing.JFrame {

    private MigLayout layout;
    private Menu menu;
    private Header header;
    private MainForm main;
    private Animator animator;
    public HomePage() {
        initComponents();
        //Set Underdecorated. 
        setBackground(new Color(0,0,0,0));
        init();
    }

    private void init(){
        layout = new MigLayout("fill", "0[]0[100%, fill]0", "0[fill, top]0");
        background.setLayout(layout);
        menu = new Menu();
        header = new Header();
        main = new MainForm();
        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int menuIndex, int subMenuIndex) {
                System.out.println("Menu Index : " + menuIndex + " SubMenu Index " + subMenuIndex);
                if (menuIndex == 0) {
                    if (subMenuIndex == 0) {
                        main.showForm(new HomeForm());
                    } else if (subMenuIndex == 1) {
//                        main.showForm(new Form1());
                    }
                }
            }
        });
        menu.addEventShowPopupMenu((Component com) -> {
            MenuItem item = (MenuItem) com;
            PopupMenu popup = new PopupMenu(this, item.getWidth(), item.getEventSelected(), item.getMenu().getSubMenu());
            int x = this.getX()+ 52;
            int y = this.getY() + com.getY() + 86;
            popup.setLocation(x, y);
            popup.setVisible(true);
            
        });
        menu.initMenuItem();
        background.add(menu, "w 230!, spany 2");
        background.add(header, "h 50!, wrap");
        background.add(main, "w 100%, h 100%");
        TimingTarget target = new TimingTarget() {
            @Override
            public void timingEvent(float frac) {
                double widtth;
                if(menu.isShowMenu()){
                    widtth = 60 + (170*(1f-frac));
                } else {
                    widtth = 60 + (170 * frac);
                }
                
                layout.setComponentConstraints(menu, "w " + widtth + "!, spany2");
                menu.revalidate();
            }

            @Override
            public void begin() {
                System.out.println(".begin()");
            }

            @Override
            public void end() {
               menu.setShowMenu(!menu.isShowMenu());
               menu.setEnableMenu(true);
            }

            @Override
            public void repeat() {
                System.out.println(".repeat()");
            }
        };
        animator = new Animator(500, target);
        animator.setResolution(0);
        animator.setDeceleration(0.5f);
        animator.setAcceleration(0.5f);
        header.addMenuEvent((ActionEvent ae) -> {
            if (!animator.isRunning()) {
                animator.start();
            }
            menu.setEnableMenu(false);
            if (menu.isShowMenu()) {
                menu.hideAllMenu();
            }
        });
//init google icon
        IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
        //Start with this form
        main.showForm(new HomeForm());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(245, 245, 245));
        background.setOpaque(true);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1330, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane background;
    // End of variables declaration//GEN-END:variables
}
