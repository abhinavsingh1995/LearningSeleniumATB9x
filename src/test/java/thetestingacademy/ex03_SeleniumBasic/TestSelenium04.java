package thetestingacademy.ex03_SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium04 {

    //Objective goto katalon-demo-cura.herokuapp.com
    //Verify if the title exits
    @Test
    public void test_Selenium01() throws Exception {

        WebDriver driver = new EdgeDriver();
        //open the katalon-demo site
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        //maximize the window
        driver.manage().window().maximize();

        //Now get the page source and verify if giver text is available
        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("CURA Healthcare Service is visble");
            Assert.assertTrue(true);
        } else {
            throw new Exception("CURA Healthcare Service not visible");
        }

        driver.close();


    }
}
