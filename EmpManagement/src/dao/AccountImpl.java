package dao;


import java.sql.Connection;
import dao.AccountDAO;
import db.SQLiteManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.account;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class AccountImpl implements AccountDAO{
    private Connection conn;
    
    public AccountImpl(){
        conn = (Connection) SQLiteManager.getIntance().getConnection();
    }
    
    
    @Override
    public boolean authenticateUser(account ac) {
        String userName = ac.getUser_name();
        String pwd = ac.getPwd();
        
        String userNameBD = "";
        String pwdBD = "";
        try {
            String reqSQL = "SELECT * FROM account WHERE username = '" + userName + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(reqSQL);
            
            while (rs.next()) {
                userNameBD = rs.getString("username");
                pwdBD = rs.getString("password");
                System.out.println("dao.AccountImpl.authenticateUser()" + userNameBD + " " + pwdBD);
            }
            
            if(userNameBD.isBlank()){
                System.out.println("dao.AccountImpl.authenticateUser() Invalid user credentials");
                return false;
            } else if (userName.equals(userNameBD) && pwd.equals(pwdBD)){
                System.out.println("dao.AccountImpl.authenticateUser() connected");
                return true;
            } else {
                System.out.println("dao.AccountImpl.authenticateUser() Invalid user credentials");
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
