/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import components.Header;
import form.MainForm;
import components.Menu;
import event.EventMenuSelected;
import form.HomeForm;
import icon.GoogleMaterialDesignIcons;
import icon.IconFontSwing;
import java.awt.Component;
import java.awt.event.ActionEvent;
import models.LoginModel;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import utils.swing.MenuItem;
import utils.swing.PopupMenu;

public class HomePage extends javax.swing.JFrame {

    private MigLayout layout;
    private Menu menu;
    private Header header;
    private MainForm main;
    private Animator animator;
    private LoginModel login;

    public HomePage(LoginModel login) {
        this.login = login;
        initComponents();
        init();
    }

    private void init() {
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
            int x = this.getX() + 52;
            int y = this.getY() + com.getY() + 86;
            popup.setLocation(x, y);
            popup.setVisible(true);

        });
        menu.initMenuItem();
        background.add(menu, "w 230!, spany 2");    // Span Y 2cell
        background.add(header, "h 50!, wrap");
        background.add(main, "w 100%, h 100%");
        TimingTarget target = new TimingTarget() {
            @Override
            public void timingEvent(float frac) {
                double widtth;
                if (menu.isShowMenu()) {
                    widtth = 60 + (170 * (1f - frac));
                } else {
                    widtth = 60 + (170 * frac);
                }

                System.out.println("views.HomePage.init() menu" + menu.getWidth());
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
        
        header.setTxtUserName(login.getUsername());
        header.setTxtRole("Admin SYS");
        //init google icon
        IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
        //Start with this form
        main.showForm(new HomeForm());
        System.out.println("views.HomePage.init() menu" + menu.getWidth());
    }

//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane background;
    // End of variables declaration//GEN-END:variables
}
