package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_Login {
    //Todo declare web driver
    WebDriver driver;

    //Todo constructor
    public P01_Login(WebDriver driver) {
        this.driver = driver;
    }

    //Todo define Locators
    private final By customerLoginButton = By.xpath("(//button[@class=\"btn btn-primary btn-lg\"])[1]");


    //Todo define Methods
    public P01_Login clickOnCustomerButton() {
        driver.findElement(this.customerLoginButton).click();
        return this;
    }

}


