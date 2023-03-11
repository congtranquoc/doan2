
package components;

import event.EventMenu;
import event.EventMenuSelected;
import event.EventShowPopupMenu;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import models.ModelMenu;
import net.miginfocom.swing.MigLayout;
import utils.swing.MenuItem;
import utils.swing.ScrollBarCustom;
import utils.swing.animation.MenuAnimation;

/**
 *
 * @author admin
 */
public class Menu extends javax.swing.JPanel {
    
    
//    private final Animator animator;
    private EventMenuSelected event;
    private EventShowPopupMenu eventShowPopupMenu;
    private boolean enableMenu = true;
    private boolean showMenu = true;
    private final MigLayout layout;
    
    public void addEvent(EventMenuSelected event){
        this.event = event;
    }
    
    public void setEnableMenu(boolean enableMenu){
        this.enableMenu = enableMenu;
    }
    
    public void setShowMenu(boolean showMenu){
        this.showMenu = showMenu;
    }
    
    public boolean isShowMenu(){
        return showMenu;
    }

    public void addEventShowPopupMenu(EventShowPopupMenu eventShowPopupMenu) {
        this.eventShowPopupMenu = eventShowPopupMenu;
    }
    
    
    
    public Menu() {
        initComponents();
        setOpaque(false);
        sp.getViewport().setOpaque(false);
        sp.setVerticalScrollBar(new ScrollBarCustom());
        
        layout = new MigLayout("wrap, fillx, insets 0", "[fill]", "[]0[]");
        panel.setLayout(layout);
    }
    
     public void initMenuItem() {
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resource/1.png")), "Dashboard", "Home", "Buttons", "Cards", "Tabs", "Accordions", "Modals"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resource/2.png")), "Charts", "Morris", "Flot", "Line"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resource/3.png")), "Report", "Income", "Expense", "Profit"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resource/4.png")), "Message", "Sender", "Inbox", "User"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resource/5.png")), "Staff", "Sender", "Inbox", "User"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resource/6.png")), "Student", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resource/7.png")), "Library", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resource/8.png")), "Holiday", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resource/9.png")), "Calendar", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resource/10.png")), "Chat App", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resource/11.png")), "Contace", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resource/12.png")), "File Manager", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resource/13.png")), "Our Centres"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resource/14.png")), "Gallery"));
    }
    
    private void addMenu(ModelMenu menu){
        panel.add(new MenuItem(menu, getEventMenu(), event, panel.getComponentCount()), "h 40!");
    }
    
    private EventMenu getEventMenu(){
        return new EventMenu() {
            @Override
            public boolean menuPressed(Component com, boolean open) {
                if(enableMenu) {
                    if(showMenu){
                        if(open){
                            new MenuAnimation(layout, com).openMenu();
                        } else {
                            new MenuAnimation(layout, com).closeMenu();
                        }
                        return true;
                    } else {
                        System.out.println(".menuPressed() show pop up menu -  Menu is closed");
                        eventShowPopupMenu.showPopup(com);
                    }
                }
                return true;
            }
        };
    }
    
    public void hideAllMenu(){
        for (Component com : panel.getComponents()) {
            MenuItem item = (MenuItem) com;
            if (item.isOpen()) {
                new MenuAnimation(layout, com, 500).closeMenu();
                item.setOpen(false);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        profile1 = new components.Profile();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(230, 800));

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setAutoscrolls(true);
        sp.setOpaque(false);

        panel.setToolTipText("");
        panel.setOpaque(false);
        panel.setPreferredSize(new java.awt.Dimension(361, 700));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        sp.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        GradientPaint gra = new GradientPaint(0, 0, new Color(73, 0, 73), getWidth(), 0, new Color(191, 71, 72));
        
        GradientPaint gra = new GradientPaint(0, 0, new Color(77, 68, 111), getWidth(), 0, new Color(112, 102, 149));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g); 
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    private components.Profile profile1;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
