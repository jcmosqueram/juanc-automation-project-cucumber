package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orange.*;
import org.junit.Assert;


public class OrangeSteps {

    OrangeLoginPage login = new OrangeLoginPage();
    OrangePimPage addInfo = new OrangePimPage();
    OrangeAddEmployeePage addEmployee = new OrangeAddEmployeePage();
    OrangeLoginDetailsPage loginDetails = new OrangeLoginDetailsPage();
    OrangePersonalDetailsPage confirmation = new OrangePersonalDetailsPage();


    @Given("the system administrator is logged with valid credentials")
    public void Login(){
      login.loadWebpage();
      login.addImplicitlyWait();
      login.setUserCredentials("Admin","admin123");
      login.clickLoginButton();
    }

    @When("the system administrator creates a new user")
    public void createNewUser(){
      addInfo.clickPimMenu();
      addInfo.clickAddNewEmployee();
      addEmployee.addNewUserData("Mauricio","Federico","Higuita");
      addEmployee.createId("1234");
      loginDetails.clickDetailsButton();
      loginDetails.createLoginDetails("mfhiguita","12345678c","12345678c");
    }

    @Then("the system administrator should be taken to new user's personal detail page")
    public void confirmation(){
        Assert.assertEquals(confirmation.getTitleText(),"Personal Details");
    }













}

