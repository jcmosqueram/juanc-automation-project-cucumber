package orange;

import org.openqa.selenium.By;


public class OrangeAddEmployeePage extends OrangeBasePage {

    private final By firstNameInput = By.cssSelector("input[placeholder='First Name']");
    private final By middleNameInput = By.cssSelector("input[placeholder='Middle Name']");
    private final By lastNameInput = By.cssSelector("input[placeholder='Last Name']");
    private final By employeeID = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input");

    public OrangeAddEmployeePage() {
        super(driver);
    }

    public void addNewUserData(String firstName, String middleName, String lastName){
          type(firstName,firstNameInput);
          type(middleName,middleNameInput);
          type(lastName,lastNameInput);
    }

    public void createId(String id){
        click(employeeID);
        clear(employeeID);
        type(id,employeeID);
    }


}
