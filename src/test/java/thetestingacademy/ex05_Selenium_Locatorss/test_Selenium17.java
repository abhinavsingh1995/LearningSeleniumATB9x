package thetestingacademy.ex05_Selenium_Locatorss;

import io.qameta.allure.Description;
import io.qameta.allure.testng.Tags;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_Selenium17 {

    @Description("Goto app.vwo.com and check negative login scenario")
    @Test
    public void test_Selenium01() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(edgeOptions);
        //open the katalon-demo site
        driver.get("https://app.vwo.com/");
        //maximize the window
//        driver.manage().window().maximize();

        //1.Find the Email input box and enter the email
//        <input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi" wfd-id="id0">
       WebElement email =  driver.findElement(By.id("login-username"));
       email.sendKeys("Abhinav");

        //2.Find the password input box and enter the password
//        <input type="password" class="text-input W(100%)" name="password" id="login-password" data-qa="jobodapuxe" wfd-id="id1">
        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("Abhinav");

        //3.Find the Submit button and click on it
        WebElement submitBtn = driver.findElement(By.id("js-login-btn"));
        submitBtn.click();


        //4. Verify the Error
        Thread.sleep(5000);
        //<div class="notification-box-description"  data-qa="rixawilomi">Your email, password, IP address or location did not match</div>
        WebElement errorMsg = driver.findElement(By.id("js-notification-box-msg"));
        Assert.assertEquals(errorMsg.getText(),"Your email, password, IP address or location did not match");
        driver.quit();
    }


}
