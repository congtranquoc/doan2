package MVC.views.forms;

import MVC.controllers.EmployeesController;
import icon.GoogleMaterialDesignIcons;
import icon.IconFontSwing;
import java.awt.Color;
import javax.swing.Icon;
import MVC.models.ModelCard;
import MVC.models.ModelNoticeBoard;
import dao.EmployeesDAO;
import dao.EmployeesImpl;

public class HomeForm extends javax.swing.JPanel {

    private EmployeesDAO dao;
    private EmployeesController empController;

    public HomeForm() {
        initComponents();
        empTable.fixTable(scrollEmp);
        setOpaque(false);
        initData();
    }

    private void initData() {
        dao = new EmployeesImpl();
        empController = new EmployeesController(empTable, dao);
        empController.getAllEmployees();
        initCardData();
        initNoticeBoard();   
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
        jPanel1 = new javax.swing.JPanel();
        noticeBoard = new MVC.views.forms.NoticeBoard();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnEmp = new javax.swing.JPanel();
        lbOfTableEmp = new javax.swing.JLabel();
        scrollEmp = new javax.swing.JScrollPane();
        empTable = new MVC.views.EmployeesTableComponent();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1058, 800));

        cardGroup.setBackground(new java.awt.Color(223, 130, 95));
        cardGroup.setColorGradient(new java.awt.Color(223, 177, 91));
        cardGroup.setMinimumSize(new java.awt.Dimension(100, 114));

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Dashboard / Home");

        cardTeam.setBackground(new java.awt.Color(248, 149, 111));
        cardTeam.setColorGradient(new java.awt.Color(223, 130, 95));
        cardTeam.setPreferredSize(new java.awt.Dimension(200, 114));

        cardPart.setBackground(new java.awt.Color(223, 177, 91));
        cardPart.setColorGradient(new java.awt.Color(248, 149, 111));

        cardEmp.setBackground(new java.awt.Color(112, 102, 149));
        cardEmp.setColorGradient(new java.awt.Color(248, 149, 111));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("Notice Board");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel3.setText("Simple notice layout text");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noticeBoard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(noticeBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
        );

        pnEmp.setBackground(new java.awt.Color(255, 255, 255));

        lbOfTableEmp.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbOfTableEmp.setText("Employees");
        lbOfTableEmp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Phone", "Email", "Address", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollEmp.setViewportView(empTable);
        if (empTable.getColumnModel().getColumnCount() > 0) {
            empTable.getColumnModel().getColumn(0).setPreferredWidth(150);
        }

        javax.swing.GroupLayout pnEmpLayout = new javax.swing.GroupLayout(pnEmp);
        pnEmp.setLayout(pnEmpLayout);
        pnEmpLayout.setHorizontalGroup(
            pnEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbOfTableEmp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(scrollEmp)
        );
        pnEmpLayout.setVerticalGroup(
            pnEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbOfTableEmp)
                .addGap(0, 0, 0)
                .addComponent(scrollEmp))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cardGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cardTeam, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cardPart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(cardEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    //Add data demo -(Next time, Notice board will be get from SQLite
    private void initNoticeBoard() {
//        noticeBoard.addDate("2022-03-09");
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(94, 49, 238), "COVID-19 Cases Surge in Europe", "2022-03-09 10:45:00", "Europe is experiencing a surge in COVID-19 cases, with several countries reporting record numbers of daily infections and hospitalizations."));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(218, 49, 238), "Biden Unveils $1.9 Trillion Infrastructure Plan", "2023-03-10 15:30:00", "President Biden has announced a $1.9 trillion infrastructure plan that includes investments in transportation, broadband, and clean energy."));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(32, 171, 43), "Scientists Discover New Species of Bird", "2023-03-11 08:00:00", "Researchers in South America have discovered a new species of bird that has never been seen before."));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(50, 93, 215), "Elon Musk Becomes World's Richest Person", "2022-01-12 12:15:00", "Tesla CEO Elon Musk has surpassed Amazon's Jeff Bezos as the world's richest person, with a net worth of over $200 billion."));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(27, 188, 204), "NASA Launches New Spacecraft to Study Venus ", "2022-05-16 07:45:00", "NASA has launched a new spacecraft called VERITAS to study the surface and atmosphere of Venus, the first mission to the planet in over 30 years"));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(238, 46, 57), "Prince William Visits Flooded Areas in UK", "2023-02-18 14:20:00", "Prince William has visited areas of the UK that have been affected by recent floods, offering support to those impacted and thanking emergency responders for their efforts."));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(238, 46, 57), "Tokyo Olympics Set to Begin in July", "2021-06-15 09:00:00", "After a one-year delay due to the COVID-19 pandemic, the 2021 Tokyo Olympics are set to begin on July 23 with a scaled-down opening ceremony."));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(238, 46, 57), "Amazon Announces Expansion into Healthcare", "2023-03-09 13:10:00", "Amazon has announced plans to expand its healthcare offerings, including pharmacy services and telemedicine, as part of its ongoing push into the healthcare industry."));
        noticeBoard.scrollToTop();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.Card cardEmp;
    private components.Card cardGroup;
    private components.Card cardPart;
    private components.Card cardTeam;
    private MVC.views.EmployeesTableComponent empTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbOfTableEmp;
    private MVC.views.forms.NoticeBoard noticeBoard;
    private javax.swing.JPanel pnEmp;
    private javax.swing.JScrollPane scrollEmp;
    // End of variables declaration//GEN-END:variables
}
