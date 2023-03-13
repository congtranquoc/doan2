
package MVC.models;

import event.EventTableAction;
import java.text.DecimalFormat;
import javax.swing.Icon;

public class ModelEmployees {

    Icon icon;
    int empID;
    String fname;
    String lname;
    double salary;
    double bonus;
    String phone;
    String email;
    int address;
    int partID;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    
    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getPartID() {
        return partID;
    }

    public void setPartID(int partID) {
        this.partID = partID;
    }
    
    

    public ModelEmployees(Icon icon,int empID, String fname, String lname, double salary, double bonus, String phone, String email, int partId, int address) {
        this.icon = icon;
        this.empID = empID;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.bonus = bonus;
        this.phone = phone;
        this.email = email;
        this.partID = partId;
        this.address = address;
    }

    public ModelEmployees(){
    
    }

    public Object[] toRowTable(EventTableAction event) {
        DecimalFormat df = new DecimalFormat("$#, ##0.00");
        return new Object[]{new ModelProfile(icon, fname, lname), phone, email, address, new ModelAction(this, event)};
    }
}
