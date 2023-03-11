/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import event.EventTableAction;
import java.text.DecimalFormat;
import javax.swing.Icon;

/**
 *
 * @author admin
 */
public class ModelEmployees {

    Icon icon;
    String fname;
    String lname;
    double salary;
    double bonus;
    String phone;
    String email;
    String address;
    int partID;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPartID() {
        return partID;
    }

    public void setPartID(int partID) {
        this.partID = partID;
    }
    
    

    public ModelEmployees(Icon icon, String fname, String lname, double salary, double bonus, String phone, String email, String address) {
        this.icon = icon;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.bonus = bonus;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public ModelEmployees(){
    
    }

    public Object[] toRowTable(EventTableAction event) {
        DecimalFormat df = new DecimalFormat("$#, ##0.00");
        return new Object[]{new ModelProfile(icon, fname), phone, email, address, new ModelAction(this, event)};
    }
}
