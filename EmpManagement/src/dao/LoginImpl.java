package dao;

import java.sql.Connection;
import db.SQLiteManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.LoginModel;
import models.account;
import dao.LoginDAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class LoginImpl implements LoginDAO {

    private Connection conn;

    public LoginImpl() {
        conn = (Connection) SQLiteManager.getIntance().getConnection();
    }

    @Override
    public LoginModel authenticateUser(String user, String pwd) {

        String userNameBD = "";
        String pwdBD = "";
        try {
            String reqSQL = "SELECT * FROM account WHERE username = '" + user + "' AND password = '" + pwd + "';";
            System.out.println("dao.LoginImpl.authenticateUser() " + reqSQL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(reqSQL);
            if(rs.next()){
                userNameBD = rs.getString("username");
                pwdBD = rs.getString("password");
                System.out.println("dao.AccountImpl.authenticateUser()" + userNameBD + " " + pwdBD);
                return new LoginModel(userNameBD, pwdBD);
            }
            return null;
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginImpl.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
