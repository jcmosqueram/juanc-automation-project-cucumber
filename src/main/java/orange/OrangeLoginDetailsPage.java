package orange;

import org.openqa.selenium.By;

public class OrangeLoginDetailsPage extends OrangeBasePage {

    private final By loginDetailsButton = By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");
    private final By addUserNameInput = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]");
    private final By addPassWordInput = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
    private final By confirmPasswordInput = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]/input[1]");
    private final By saveButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");


    public OrangeLoginDetailsPage() {
        super(driver);
    }

    public void clickDetailsButton(){
        click(loginDetailsButton);
    }

    public void createLoginDetails(String username,String password,String confirmPassword){
        type(username,addUserNameInput);
        type(password,addPassWordInput);
        type(confirmPassword,confirmPasswordInput);
        click(saveButton);
    }

}
