package pages;

import org.openqa.selenium.By;


public class LoginPage extends BasePage {

    private By userNameInput = By.id("user-name");
    private By passWordInput = By.id("password");
    private By loginButton = By.id("login-button");


    public LoginPage() {
        super(driver);
    }

    public void loadWebpage(){
        setUrl("https://www.saucedemo.com/");
    }

    public void setUserCredentials(String userName, String password){
        type(userName,userNameInput);
        type(password,passWordInput);
    }

    public void clickLoginButton(){
        click(loginButton);
    }
}

