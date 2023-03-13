package MVC.views;

import components.ActionPanel;
import components.ProfilePanel;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import MVC.models.ModelAction;
import MVC.models.ModelProfile;
import utils.swing.ScrollBarCustom;
import utils.swing.TableCellAction;
import utils.swing.TableHeader;

public class EmployeesTableComponent extends JTable {

    public EmployeesTableComponent() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false); // Chặn các header cột di chuyển (drag and drop)
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                if (column == 4) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }

        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if (value instanceof ModelProfile data) {
                    ProfilePanel cell = new ProfilePanel(data);
                    if (isSelected) {
                        cell.setBackground(new Color(239, 244, 255));
                    } else {
                        cell.setBackground(Color.WHITE);
                    }
                    return cell;
                } else if (value instanceof ModelAction) {
                    ModelAction data = (ModelAction) value;
                    ActionPanel cell = new ActionPanel(data);
                    if (isSelected) {
                        cell.setBackground(new Color(239, 244, 255));
                    } else {
                        cell.setBackground(Color.WHITE);
                    }
                    return cell;
                } else {
                    Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    com.setForeground(new Color(102, 102, 102));
                    if (isSelected) {
                        com.setBackground(new Color(239, 244, 255));
                    } else {
                        com.setBackground(Color.WHITE);
                    }
                    return com;
                }
            }
        });
    }

    @Override
    public TableCellEditor getCellEditor(int row, int col) {

        if (col == 4) {
            return new TableCellAction();
        } else {
            return super.getCellEditor(row, col);
        }

    }

    public void addRow(Object[] row) {
        DefaultTableModel mod = (DefaultTableModel) getModel();
        for (Object i : row) {
            System.out.println("utils.swing.CustomTable.addRow()" + i.toString());
        }

        mod.addRow(row);
    }

    public void fixTable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel jp = new JPanel();
        jp.setBackground(Color.WHITE);
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, jp);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }
    
    public void show(){
        setVisible(true);
    }
}
