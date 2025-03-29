package thetestingacademy.ex01_SeleniumBasic;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void test_Selenium01(){

        //open URL and print title
//        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("https://app.vwo.com/");
//        System.out.println(driver.getTitle());
//        driver.close();

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/");
        System.out.println(driver.getTitle());
        driver.quit();


    }

}
