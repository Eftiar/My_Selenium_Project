package test.Cases;
import org.testng.annotations.Test;
import test.pages.TripPage;

public class  TripSearchAutomation extends Base {

    @Test
    public void TripSearch() throws InterruptedException {

        TripPage.button(driver).click();
        Thread.sleep(8000);
        TripPage.element1(driver).click();
        TripPage.element1(driver).sendKeys("Switzerland");
        Thread.sleep(5000);
        TripPage.searchResult(driver).click();
        TripPage.selectCheckInDate(driver).click();
        TripPage.selectCheckOutDate(driver).click();
        TripPage.childSelect(driver).click();
        TripPage.childAgeSelect(driver).click();
        TripPage.childAgeYear(driver).click();
        TripPage.childConfirmSelect(driver).click();
        Thread.sleep(5000);

      /*  WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[5]/div/div/div[2]/div[6]/div[2]/div[4]/div/label"));
        js.executeScript("arguments[0].scrollIntoView();", element);

       */
       // TripPage.checkBox(driver).click();

        //System.out.println(TripPage.getTitle(driver).getText());

    }

}