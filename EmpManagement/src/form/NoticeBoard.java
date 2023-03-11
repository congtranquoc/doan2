package form;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import models.ModelNoticeBoard;
import net.miginfocom.swing.MigLayout;
import utils.swing.ScrollBarCustom;

public class NoticeBoard extends javax.swing.JPanel {

    public NoticeBoard() {
        initComponents();
        setBackground(Color.WHITE);
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        jPanel1.setLayout(new MigLayout("nogrid, fillx"));
    }

    void addNoticeBoard(ModelNoticeBoard notice) {
        JLabel title = new JLabel(notice.getTitle());
        title.setFont(new Font("sansserif", 1, 14));
        title.setForeground(notice.getTitleColor());
        jPanel1.add(title);
        JLabel time = new JLabel(notice.getTime());
        time.setForeground(new Color(180, 180, 180));
        jPanel1.add(time, "gap 10, wrap");
        JTextPane txt = new JTextPane();
        txt.setBackground(new Color(0, 0, 0, 0));
        txt.setForeground(new Color(120, 120, 120));
        txt.setSelectionColor(new Color(150, 150, 150));
        txt.setBorder(null);
        txt.setOpaque(false);
        txt.setEditable(false);
        txt.setText(notice.getDesc());
        
        jPanel1.add(txt, "w 100::90%, wrap");
    }

    void addDate(String date) {
        JLabel lbDate = new JLabel(date);
        lbDate.setBorder(new EmptyBorder(5, 5, 5, 5));
        lbDate.setFont(new Font("sansserif", 1, 13));
        lbDate.setForeground(new Color(80, 80, 80));
        jPanel1.add(lbDate, "wrap");
    }

    public void scrollToTop() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                jScrollPane1.getVerticalScrollBar().setValue(0);
            }

        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(400, 800));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
