/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.models;

import javax.swing.Icon;

/**
 *
 * @author admin
 */
public class ModelProfile {

    private Icon icon;
    private String fname;
    private String lname;

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

    public ModelProfile(Icon icon, String fname, String lname) {
        this.icon = icon;
        this.fname = fname;
        this.lname = lname;
    }

    

    public ModelProfile() {
    }

}
