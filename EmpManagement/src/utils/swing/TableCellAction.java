package utils.swing;

import components.ActionPanel;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import MVC.models.ModelAction;

public class TableCellAction extends DefaultCellEditor {

    private ModelAction data;

    public TableCellAction() {
        super(new JCheckBox());
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        data = (ModelAction) value;
        ActionPanel cell = new ActionPanel(data);
        cell.setBackground(new Color(239, 244, 255));

        return cell;
    }

    //Trả về giá trị khi button edit và del dc kích hoạt
    @Override
    public Object getCellEditorValue() {
        return data;
    }

}
