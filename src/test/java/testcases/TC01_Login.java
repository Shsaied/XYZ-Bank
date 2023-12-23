package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_Login;
import pages.P02_CustomerPage;
import pages.P03_AccountPage;
import testcases.TestBase;

import java.util.concurrent.TimeUnit;


public class TC01_Login extends TestBase {

        //Todo Define parameters values
    String customer="Hermoine Granger";

    @Test(priority = 1, description ="User login successfully")
    public void loginSuccessfully_P() throws InterruptedException {
     new P01_Login(driver).clickOnCustomerButton();
     new P02_CustomerPage(driver).selectCustomerName(customer);
     new P02_CustomerPage(driver).clickLoginButton();
        Assert.assertEquals(new P03_AccountPage(driver).getCustomername(),customer);
      Thread.sleep(3000);


    }

}
