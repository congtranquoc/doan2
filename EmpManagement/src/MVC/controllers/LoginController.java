package MVC.controllers;

import dao.LoginDAO;
import event.EventLoginListener;
import javax.swing.SwingUtilities;
import MVC.models.LoginModel;
import MVC.views.HomePage;
import MVC.views.Login;

/**
 *
 * @author admin
 */
public class LoginController implements EventLoginListener {

    private LoginModel loginModel;
    private LoginDAO dao;
    private Login view;

    public LoginController(Login view, LoginDAO dao) {
        this.loginModel = new LoginModel();
        this.dao = dao;
        this.view = view;
        view.addEventLoginListener(this);
    }

    @Override
    public void executeLogin(String user, String pwd) {

        if (user.isBlank() || pwd.isBlank()) {
            System.out.println("controllers.LoginController.executeLogin() null" );
        } else {
            loginModel = dao.authenticateUser(user, pwd);
            if (loginModel == null) {
                System.out.println("controllers.LoginController.executeLogin() invalid");
            } else {
                System.out.println("controllers.LoginController.executeLogin() success");
                
                HomePage homeView = new HomePage(loginModel);
                 /* Create and display the form */
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        view.dispose();
                        homeView.setVisible(true);
                    }
                });
            }
        }
    }
    
    public void showView(){
        view.setVisible(true);
    }
}
