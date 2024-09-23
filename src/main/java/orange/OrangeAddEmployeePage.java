package orange;

import org.openqa.selenium.By;
import pages.BasePage;

public class OrangeAddEmployeePage extends BasePage {

    private By firstNameInput = By.name("firstName");
    private By middleNameInput = By.name("middleName");
    private By lastNameInput = By.name("lastName");
    private By employeeID = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input");


    public OrangeAddEmployeePage() {
        super(driver);
    }

    public void addNewUserInformation(String firstName, String middleName, String lastName, String employeeId){
        type(firstName,firstNameInput);
        type(middleName,middleNameInput);
        type(lastName,lastNameInput);
        type(employeeId,employeeID);
    }



}
