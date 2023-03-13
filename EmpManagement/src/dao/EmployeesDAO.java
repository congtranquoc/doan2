
package dao;

import java.util.List;
import MVC.models.ModelEmployees;

public interface EmployeesDAO {
    public List<ModelEmployees> getAllEmployees();
    public boolean updateEmployees(ModelEmployees employees);
    public boolean deleteEmployees(int empId);
}
