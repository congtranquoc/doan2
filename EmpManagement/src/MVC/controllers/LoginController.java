package MVC.controllers;

import dao.LoginDAO;
import event.EventLoginListener;
import javax.swing.SwingUtilities;
import MVC.models.LoginModel;
import MVC.views.HomePage;
import MVC.views.Login;
import dialog.ErrorDialog;

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
            showDialogError("Usename and Pasword are required!");
        } else {
            loginModel = dao.authenticateUser(user, pwd);
            if (loginModel == null) {
                showDialogError("Username and Password are invalid");
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
    
    private void showDialogError(String msg){
        ErrorDialog dialog = new ErrorDialog(view, true);
        dialog.showMessage(msg);
    }
    
    public void showView(){
        view.setVisible(true);
    }
}
