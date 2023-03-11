
package event;

import models.ModelEmployees;

public interface EventTableAction {
    public void delete(ModelEmployees model);
    public void update(ModelEmployees model);
}
