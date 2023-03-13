
package event;

import MVC.models.ModelEmployees;

public interface EventTableAction {
    public void delete(ModelEmployees model);
    public void update(ModelEmployees model);
}
