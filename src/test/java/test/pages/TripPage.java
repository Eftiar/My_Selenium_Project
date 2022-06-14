package test.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TripPage {

    private static WebElement element = null;

    public static WebElement button(WebDriver driver){
         element = driver.findElement(By.linkText("Hotels"));
         return element;
    }

    public static WebElement element1(WebDriver driver){
        element = driver.findElement(By.cssSelector("div.weiIG:nth-child(1) > form:nth-child(2) > input:nth-child(1)"));
        return element;
    }

    public static WebElement searchResult(WebDriver driver){
        element = driver.findElement(By.xpath("//div[@class='dPHgr']//div[@class='WlYyy diXIH bQCoY'][contains(text(),'Europe')]"));
        return element;
    }

    public static WebElement selectCheckInDate(WebDriver driver){
        element = driver.findElement(By.cssSelector("div.eMrph:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2)"));
        return element;
    }

    public static WebElement selectCheckOutDate(WebDriver driver){
        element = driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div > div > div.eLjPa > div > div.fZVmW.q.c > div:nth-child(1) > div.nZEkx.notranslate > div:nth-child(2) > div:nth-child(5)"));
        return element;
    }

    public static WebElement childSelect(WebDriver driver){
        element = driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div.ccWaH.S4.z > div:nth-child(3) > div.fiDyZ._m.c.q.B1.Z.R2 > button:nth-child(3) > span"));
        return element;
    }

    public static WebElement childAgeSelect(WebDriver driver){
        element = driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div.cJbNW.Mf.Z._V > div > div > button"));
        return element;
    }

    public static WebElement childAgeYear(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/div[7]/div/div/div/div[2]/button[3]/span"));
        return element;
    }

    public static WebElement childConfirmSelect(WebDriver driver){
        element = driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div.chkmV.Mf > button"));
        return element;
    }

    public static WebElement checkBox(WebDriver driver){
        element = driver.findElement(By.cssSelector("/html/body/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[5]/div/div/div[2]/div[6]/div[2]/div[4]/div/label"));
        return element;
    }

    public static WebElement getTitle(WebDriver driver){
        element = driver.findElement(By.cssSelector("//*[@id=\"property_490927\"]"));
        return element;
    }


}
