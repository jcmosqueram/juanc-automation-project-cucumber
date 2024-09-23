package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {


   protected static WebDriver driver;


    public BasePage(WebDriver driver){
        BasePage.driver = driver;
    }

    static {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public static void setUrl(String url){
        driver.get(url);
    }

    public static void close(){
        driver.close();
    }


}
