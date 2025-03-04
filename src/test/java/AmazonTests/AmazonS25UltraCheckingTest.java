package AmazonTests;

import AmazonPages.AmazonMainPage;
import AmazonPages.S25UltraDetailPage;
import AmazonPages.SmartPhonesResultPage;
import org.testng.annotations.Test;

public class AmazonS25UltraCheckingTest extends BaseTest{

    AmazonMainPage mainPage;
    SmartPhonesResultPage smartPhonesResultPage;
    S25UltraDetailPage detailPage;

    @Test(priority = 1,description = "Checking S25 Ultra product")
    public void checkingS25UltraTest(){
        mainPage=new AmazonMainPage(getDriver());
        mainPage.navigateAmazonMainPage();
        mainPage.navigateCellPhonesPage();
        smartPhonesResultPage= new SmartPhonesResultPage(getDriver());
        smartPhonesResultPage.scrollDownPage();
        smartPhonesResultPage.clickProduct();
        detailPage= new S25UltraDetailPage(getDriver());
        softAssert.assertTrue(detailPage.displayProductNotFoundMessage().isDisplayed());
        softAssert.assertEquals("Sorry! We couldn't find that page. Try searching or go to Amazon's home page.",detailPage.getProductNotFoundErrorMessage());
    }

}
