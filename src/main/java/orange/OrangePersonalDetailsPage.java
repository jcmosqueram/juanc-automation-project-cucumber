package orange;

import org.openqa.selenium.By;

public class OrangePersonalDetailsPage extends OrangeBasePage{

    private final By personalDetailsTitle = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/h6");


    public OrangePersonalDetailsPage() {
        super(driver);
    }

    public String getTitleText(){
        return driver.findElement(personalDetailsTitle).getText();
    }

}
