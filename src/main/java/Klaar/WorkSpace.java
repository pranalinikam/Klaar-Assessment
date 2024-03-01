package Klaar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WorkSpace extends Utility {

    @Test(priority = 1)
    public void workSpaceSetting() {
        try {
            driver.manage().window().maximize();
            String actualHeader = "Workspace Settings";
            String expectedHeader = driver.findElement(objRepo.workspaceSettingHeader).getText();
            Assert.assertEquals(actualHeader, expectedHeader);
            findElementMethod(objRepo.workspaceName).clear();
            findElementMethod(objRepo.workspaceName).sendKeys("pranali.nikam");
            findElementMethod(objRepo.saveChangesButton).click();
            new Util().isPageRefreshed(driver);
            findElementMethod(objRepo.organisationHead).click();
            findElementMethod(objRepo.organisationClear).click();
            WebElement organisationList = driver.findElement(objRepo.organisationList);
            List<WebElement> headersList = organisationList.findElements(objRepo.headerList);
            headersList.getFirst().click();
            findElementMethod(objRepo.organisationHeadLabel).click();
            findElementMethod(objRepo.organisationHeadSaveButton).click();
            WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
            fileInput.sendKeys("C:/Users/morea/Downloads/testing.png");
            Actions builder = new Actions(driver);
            builder.moveToElement(driver.findElement(objRepo.workSpaceLogoSaveButton)).click().build().perform();
            new Util().isPageRefreshed(driver);
            findElementMethod(objRepo.deleteLogoButton).click();
            findElementMethod(objRepo.deleteConfirmButton).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(20));
            driver.manage().deleteAllCookies();
            driver.quit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
