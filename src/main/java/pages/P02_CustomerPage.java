package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P02_CustomerPage {
    //Todo declare web driver
    WebDriver driver;

    //Todo constructor
    public P02_CustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    //Todo define Locators
    private final By customerListName = By.id("userSelect");
    private final By loginButton=By.xpath("//button[@class=\"btn btn-default\"]");

    //Todo define Methods
    public P02_CustomerPage selectCustomerName(String customer) {
        WebElement customername= driver.findElement(this.customerListName);
        Select selectCustomer=new Select(customername);
        selectCustomer.selectByVisibleText(customer);
        return this;
    }
    public P02_CustomerPage clickLoginButton(){
        driver .findElement(this.loginButton).click();
        return this;
    }
}
