
package dao;

import MVC.models.LoginModel;

public interface LoginDAO {
    public LoginModel authenticateUser(String user, String pwd);
}
