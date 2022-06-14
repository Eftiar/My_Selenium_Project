package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TripSearchPage {

    WebDriver driver;
    By button = By.linkText("Hotels");
    By element1 = By.cssSelector("div.weiIG:nth-child(1) > form:nth-child(2) > input:nth-child(1)");
    By searchResult = By.xpath("//div[@class='dPHgr']//div[@class='WlYyy diXIH bQCoY'][contains(text(),'Europe')]");
    By selectCheckInDate = By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div > div > div.kAgrN > div > div.fZVmW.q.c > div:nth-child(2) > div.nZEkx.notranslate > div:nth-child(1) > div:nth-child(3)");
    By selectCheckOutDate = By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div > div > div.eLjPa > div > div.fZVmW.q.c > div:nth-child(1) > div.nZEkx.notranslate > div:nth-child(2) > div:nth-child(5)");
    By childSelect = By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div.ccWaH.S4.z > div:nth-child(3) > div.fiDyZ._m.c.q.B1.Z.R2 > button:nth-child(3) > span");
    By childAgeSelect = By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div.cJbNW.Mf.Z._V > div > div > button");
    By childAgeYear = By.xpath("//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/div[7]/div/div/div/div[2]/button[3]/span");
    By childConfirmSelect = By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div.chkmV.Mf > button");
    By checkBox = By.cssSelector("#component_13 > div > div.dSlNe.bhcPI > div:nth-child(6) > div.czbRE > div:nth-child(4) > div > label > div > span.eLkFw > span");
    By getTitle = By.cssSelector("#property_264882");

    public TripSearchPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickHotels(){
        driver.findElement(button).click();
    }

    public void searchText(){
        driver.findElement(element1).sendKeys("Switzerland");
    }

    public void searchResultClick(){
        driver.findElement(searchResult).click();
    }

    public void selectCheckIn(){
        driver.findElement(selectCheckInDate).click();
    }

    public void selectCheckOut(){
        driver.findElement(selectCheckOutDate).click();
    }

    public void childSelection(){
        driver.findElement(childSelect).click();
    }

    public void childAgeSelection(){
        driver.findElement(childAgeSelect).click();
    }

    public void childAgeYearSelection(){
        driver.findElement(childAgeYear).click();
    }

    public void childConfirmSelection(){
        driver.findElement(childConfirmSelect).click();
    }

    public void checkBoxSelection(){
        driver.findElement(checkBox).click();
    }

    public void getTitleFromSearch(){
        WebElement title = driver.findElement(getTitle);
        System.out.println(title.getText());
    }

}
