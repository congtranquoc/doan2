/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.SQLiteConfig;
import java.sql.Statement;
import utils.ExceptionUtils;
/**
 *
 * @author admin
 */
public class SQLiteManager {
    private static String dbUrl = "jdbc:sqlite:EmpManagement.db";
    private static SQLiteManager instance;
    private static Connection conn;
    
    private SQLiteManager() {
        try {
            SQLiteConfig config = new SQLiteConfig();
            config.setJournalMode(SQLiteConfig.JournalMode.WAL);
//            config.setBusyTimeout(5000);
            conn = DriverManager.getConnection(dbUrl);
            Statement stm = conn.createStatement();
            if(conn != null){
                System.out.println("db.SQLiteManager.main() connect sql");
            } else {
                throw new ExceptionUtils("SQL could not connect");
            }
        } catch (ExceptionUtils e) {
            System.out.println("db.SQLiteManager.main() " + e.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static SQLiteManager getIntance() {
        if(instance == null){
            return new SQLiteManager();
        }
        return instance;
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public void createStament() throws SQLException{
        conn.createStatement();
    }
    public void closeConnection(){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws SQLException {
        
    }
}
