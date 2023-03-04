package controllers;

import dao.AccountImpl;
import javax.swing.SwingUtilities;
import models.account;
import views.HomePage;
import views.Login;

/**
 *
 * @author admin
 */
public class LoginController {

    private account ac;
    private Login view;

    public LoginController(Login view) {
        this.ac = new account();
        this.view = view;
    }

    public boolean exeLogin() {
        AccountImpl aci = new AccountImpl();
        return aci.authenticateUser(ac);
    }

    public boolean validateForm(String user, String pwd) {
        if (user.isBlank() || pwd.isBlank()) {
            return false;
        } else {
            ac.setUser_name(user);
            ac.setPwd(pwd);
            return true;
        }
    }

    public void control() {
        String user = view.getUsername();
        String pwd = view.getPwd();
        if (!validateForm(user, pwd)) {
            view.showError("Username or Pwd is bank");
        } else {
            if (exeLogin()) {
//                view.showError("Success");
                /* Create and display the form */
                view.dispose();
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        new HomePage().setVisible(true);
                        
                    }
                });
            } else {
                view.showError("Username or Pwd is not valid");
            }
        }
    }
}
