
package event;

import MVC.models.ModelEmployees;

public interface EventEmployeesListener {
    void getAllEmployees();
    void deleteEmployee(int id);
    void addEmployee(ModelEmployees emp);
    void updateEmployee(ModelEmployees emp);
}
