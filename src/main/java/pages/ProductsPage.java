package pages;

import org.openqa.selenium.By;


public class ProductsPage extends BasePage{

    private final By productsTitle = By.xpath("//span[@class='title']");

    public ProductsPage() {
        super(driver);
    }

     public String getTitle()  {
        return driver.findElement(productsTitle).getText();
     }
}
