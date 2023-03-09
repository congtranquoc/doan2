
package models;


public class LoginModel {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    private String username;
    private String pwd;

    public LoginModel(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }
    
    public LoginModel(){
    }
}
