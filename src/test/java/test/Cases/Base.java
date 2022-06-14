package test.Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Base {

    static WebDriver driver = null;

    @BeforeTest
    public void Setup() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get("https://www.tripadvisor.com/");
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        System.out.println("Test run successfully");
    }
}
