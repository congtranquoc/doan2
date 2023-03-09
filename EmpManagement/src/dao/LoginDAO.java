/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import models.LoginModel;

/**
 *
 * @author admin
 */
public interface LoginDAO {
    public LoginModel authenticateUser(String user, String pwd);
}
