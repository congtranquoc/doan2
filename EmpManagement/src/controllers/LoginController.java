/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import dao.AccountImpl;
import models.account;

/**
 *
 * @author admin
 */
public class LoginController {
    private account ac;
    
    public LoginController(String username, String pwd){
        ac = new account();
        ac.setUser_name(username);
        ac.setPwd(pwd);
    }
    
    public boolean exeLogin(){
        AccountImpl aci = new AccountImpl();
        return aci.authenticateUser(ac);
    }
    
}
