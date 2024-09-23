package orange;

import org.openqa.selenium.By;


public class OrangeLoginPage extends OrangeBasePage {

    private By userNameInput = By.name("username");
    private By passWordInput = By.name("password");
    private By loginButton = By.xpath("//button[@type='submit']");


    public OrangeLoginPage() {
        super(driver);
    }

    public void loadWebpage(){
        setUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void setUserCredentials(String userName, String password){
        type(userName,userNameInput);
        type(password,passWordInput);
    }

    public void clickLoginButton(){
        click(loginButton);
    }


}
