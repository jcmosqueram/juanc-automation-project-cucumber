package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.ProductsPage;


public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();


    @Given("the user is on the Login page")
    public void displayLoginPage(){
        loginPage.loadWebpage();
    }

    @When("the user enter valid credentials")
    public void typeCredentials(){
        loginPage.setUserCredentials("standard_user","secret_sauce");
        loginPage.clickLoginButton();
    }

    @Then("the user should be taken to the products page")
    public void userIsOnProductsPage() {
        Assert.assertEquals(productsPage.getTitle(),"Products");
    }
}
