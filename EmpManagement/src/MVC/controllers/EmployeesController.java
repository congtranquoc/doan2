
package MVC.controllers;

import MVC.models.LoginModel;
import MVC.models.ModelEmployees;
import MVC.views.EmployeesTableComponent;
import MVC.views.HomePage;
import MVC.views.forms.HomeForm;
import dao.EmployeesDAO;
import dialog.MessageDialog;
import event.EventEmployeesListener;
import event.EventTableAction;
import java.util.List;

public class EmployeesController implements EventEmployeesListener{
    
    private ModelEmployees employees;
    private List<ModelEmployees> list;
    private EmployeesDAO dao;
    private EmployeesTableComponent view;

    public EmployeesController(EmployeesTableComponent view, EmployeesDAO dao){
        this.view = view;
        this.dao = dao;
    }

    @Override
    public void getAllEmployees() {
        EventTableAction event = new EventTableAction() {
            @Override
            public void delete(ModelEmployees model) {
               showMessage("del");
            }

            @Override
            public void update(ModelEmployees model) {
               showMessage("update");
            }
        };
        list = dao.getAllEmployees();
        for(ModelEmployees emp : list){
            view.addRow(emp.toRowTable(event));
        }
    }

    @Override
    public void deleteEmployee(int id) {
        dao.deleteEmployees(id);
    }

    @Override
    public void addEmployee(ModelEmployees emp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateEmployee(ModelEmployees emp) {
        dao.updateEmployees(emp);
    }
    
    public void showView(){
        view.show();
    }
    
    private void showMessage(String message) {
        MessageDialog obj = new MessageDialog(HomePage.getFrames()[0], true);
        obj.showMessage(message);
//        return obj.isOk();
    }
}
