package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import orange.OrangeAddEmployeePage;
import orange.OrangeLoginDetailsPage;
import orange.OrangePimPage;
import orange.OrangeLoginPage;



public class OrangeSteps {

    OrangeLoginPage login = new OrangeLoginPage();
    OrangePimPage addInfo = new OrangePimPage();
    OrangeAddEmployeePage addEmployee = new OrangeAddEmployeePage();
    OrangeLoginDetailsPage details = new OrangeLoginDetailsPage();


    @Given("the system administrator is logged with valid credentials")
    public void Login(){
      login.loadWebpage();
      login.addWait();
      login.setUserCredentials("Admin","admin123");
      login.clickLoginButton();
    }

    @When("the system administrator creates a new user")
    public void createNewUser(){
      addInfo.clickPimMenu();
      addInfo.clickAddNewEmployee();
      addEmployee.addNewUserInformation("Juan","Camilo","Mosquera","4324569888");
      //details.confirmPassword("jmosquera","1234567l","1234567l");
    }













}

