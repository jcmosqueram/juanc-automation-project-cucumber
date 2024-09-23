package orange;

import org.openqa.selenium.By;

public class OrangeLoginDetailsPage extends OrangeBasePage {

    private By loginDetailsButton = By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");
    private By addUserNameInput = By.xpath("//input[@class='oxd-input oxd-input--active oxd-input--error']");
    private By addPassWordInput = By.name("");
    private By confirmPasswordInput = By.name("");
    private By saveButton = By.id("");

    public OrangeLoginDetailsPage() {
        super(driver);
    }


    public void confirmPassword(String username,String password,String confirmPassword){
        click(loginDetailsButton);
        type(username,addUserNameInput);
        type(password,addPassWordInput);
        type(confirmPassword,confirmPasswordInput);
        click(saveButton);
    }

}
