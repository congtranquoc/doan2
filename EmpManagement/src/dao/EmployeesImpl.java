package dao;

import db.SQLiteManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import MVC.models.ModelEmployees;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.sql.PreparedStatement;

public class EmployeesImpl implements EmployeesDAO {

    private Connection conn;
    private List<ModelEmployees> listOfEmp;

    public EmployeesImpl() {
        conn = (Connection) SQLiteManager.getIntance().getConnection();
    }

    @Override
    public List<ModelEmployees> getAllEmployees() {
        listOfEmp = new ArrayList<>();
        try {
            String reqSQL = "SELECT * FROM Employee";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(reqSQL);

            while (rs.next()) {
                System.out.println("dao.EmployeesImpl.getAllEmployees()" + rs.getInt("emp_fname"));
                ModelEmployees emp = new ModelEmployees();
                emp.setIcon(new ImageIcon(
                        getClass().getResource("/resource/images_avatar.png")));
                emp.setEmpID(rs.getInt("emp_id"));
                emp.setFname(rs.getString("emp_fname"));
                emp.setLname(rs.getString("emp_lname"));
                emp.setSalary(rs.getDouble("emp_salary"));
                emp.setBonus(rs.getDouble("emp_bonus"));
                emp.setPhone(rs.getString("emp_phone"));
                emp.setEmail(rs.getString("emp_email"));
                emp.setPartID(rs.getInt("part_id"));
                emp.setAddress(rs.getInt("address_id"));

                listOfEmp.add(emp);
            }
        } catch (SQLException e) {
            Logger.getLogger(EmployeesImpl.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }

        return listOfEmp;
    }

    @Override
    public boolean updateEmployees(ModelEmployees employees) {
        String reqSQL = "UPDATE employee SET emp_fname = ?, emp_lname = ?,emp_salary = ?, emp_bonus = ?, emp_phone = ? , emp_email = ?, address_id = ? WHERE id = ?";
        try ( PreparedStatement stmt = conn.prepareStatement(reqSQL)) {
            stmt.setString(1, employees.getFname());
            stmt.setString(2, employees.getLname());
            stmt.setDouble(3, employees.getSalary());
            stmt.setDouble(4, employees.getBonus());
            stmt.setString(5, employees.getPhone());
            stmt.setString(6, employees.getEmail());
            stmt.setInt(7, employees.getAddress());
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee updated successfully");
                return true;
            } else {
                System.out.println("Employee not found");
                return false;
            }
        } catch (SQLException e) {
            Logger.getLogger(EmployeesImpl.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    @Override
    public boolean deleteEmployees(int empId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
