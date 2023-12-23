package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P03_AccountPage {
    WebDriver driver;

    public P03_AccountPage(WebDriver driver){
       this.driver=driver;
   }

    //Todo define Locators
    private  final By welcomeCustomer=By.xpath("//span[@class='fontBig ng-binding']");

    //Todo define Methods

    public String getCustomername(){
       String customerNameIs= driver.findElement(this.welcomeCustomer).getText();
        return customerNameIs;
    }

}
