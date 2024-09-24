package orange;

import org.openqa.selenium.By;

public class OrangePimPage extends OrangeBasePage{

    private final By pimMenu = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a");
    private final By addEmployeeButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");

    public OrangePimPage() {
        super(driver);
    }

    public void clickPimMenu(){
        click(pimMenu);
    }

    public void clickAddNewEmployee(){
        click(addEmployeeButton);
    }

}
