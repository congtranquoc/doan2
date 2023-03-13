
package MVC.models;

import event.EventTableAction;

public class ModelAction {
     private ModelEmployees emp;
    private EventTableAction event;

    public ModelEmployees getEmp() {
        return emp;
    }

    public void setEmp(ModelEmployees emp) {
        this.emp = emp;
    }

    public EventTableAction getEvent() {
        return event;
    }

    public void setEvent(EventTableAction event) {
        this.event = event;
    }

    public ModelAction() {
    }

    public ModelAction(ModelEmployees emp, EventTableAction event) {
        this.emp = emp;
        this.event = event;
    }
    
    
}
