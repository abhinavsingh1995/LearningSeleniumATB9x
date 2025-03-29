package thetestingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KatalonDemoCura_project {

    @Test
    public void login() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);

        //1. Open https://katalon-demo-cura.herokuapp.com/
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        //2. Locate and Click Make Appointment
        //<a id="btn-make-appointment" href="./profile.php#lo b gin" class="btn btn-dark btn-lg">Make Appointment</a>
        WebElement makeAppointmentLink = driver.findElement(By.linkText("Make Appointment"));
        makeAppointmentLink.click();

        //3. Locate Username and fill hardcoded data
        //<input type="text" class="form-control" id="txt-username" name="username" placeholder="Username" value="" autocomplete="off">
        WebElement usernameText = driver.findElement(By.id("txt-username"));
        usernameText.sendKeys("John Doe");

        //4. Locate Password and fill hardcoded data
        WebElement passwordText = driver.findElement(By.id("txt-password"));
        passwordText.sendKeys("ThisIsNotAPassword");

        //5. Locate adn Click on login
        WebElement LoginBtn = driver.findElement(By.id("btn-login"));
        LoginBtn.click();

        //Verify if it is moved to another page
        Thread.sleep(5000);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://katalon-demo-cura.herokuapp.com/#appointment");

        driver.quit();
    }
}
