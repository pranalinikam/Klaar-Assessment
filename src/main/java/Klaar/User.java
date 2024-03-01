package Klaar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class User extends Utility {

    @Test(priority = 1)
    public void userCustomFields() {
        try {
            String displayName = "Today's Date for File Test";
            findElementMethod(objRepo.userList).click();
            findElementMethod(objRepo.customFields).click();
            findElementMethod(objRepo.addFields).click();
            findElementMethod(objRepo.fieldName).sendKeys(displayName);
            findElementMethod(objRepo.fieldDataType).click();
            WebElement dataType = driver.findElement(objRepo.dataTypeDropDown);
            List<WebElement> listDataType = dataType.findElements(objRepo.listOfFieldType);
            listDataType.get(5).click();
            findElementMethod(objRepo.customFieldSubmitButton).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

            WebElement list = driver.findElement(objRepo.listOfCustomFields);
            List<WebElement> listDisplayName = list.findElements(objRepo.listOfCustomFieldName);
            int insertedElementIndex = -1;
            for (int i = 0; i < listDisplayName.size(); i++) {
                String displayNameItems = listDisplayName.get(i).getText();
                if (displayNameItems.contains(displayName)) {
                    insertedElementIndex = i;
                    Assert.assertEquals(displayNameItems, displayName);
                    break;
                }
            }
            if (insertedElementIndex != -1) {
                WebElement deleteDisplayName = list.findElement(By.xpath("//tr[" + ++insertedElementIndex + "]//td[4]//div[2]"));
                deleteDisplayName.click();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 2)
    public void customFieldsList() {
        try {
            findElementMethod(objRepo.userList).click();
            findElementMethod(objRepo.customFields).click();
            findElementMethod(objRepo.addFields).click();
            findElementMethod(objRepo.fieldName).sendKeys("Today's Date for File Test");
            findElementMethod(objRepo.fieldDataType).click();
            WebElement dataType = driver.findElement(objRepo.dataTypeDropDown);
            List<WebElement> listDataType = dataType.findElements(objRepo.listOfFieldType);
            listDataType.get(3).click();
            findElementMethod(objRepo.optionListDataType).sendKeys("24/12/09");
            findElementMethod(objRepo.anotherList).click();
            findElementMethod(objRepo.optionListDataType).sendKeys("24/11/06");
            findElementMethod(objRepo.anotherList).click();
            findElementMethod(objRepo.optionListDataType).sendKeys("24/10/09");
            findElementMethod(objRepo.customFieldSubmitButton).click();
            driver.manage().deleteAllCookies();
            driver.quit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
