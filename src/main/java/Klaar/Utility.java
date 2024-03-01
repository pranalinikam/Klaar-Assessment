package Klaar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.time.Duration;


public class Utility {
    ObjectRepository objRepo = new ObjectRepository();
    WebDriver driver;

    @BeforeClass
    public void driverSetting() {
        System.setProperty("webdriver.chrome.driver", "C:/rushi/projects/projects/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://dev.klaarhq.com");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2000));
        findElementMethod(objRepo.loginOption).click();
        findElementMethod(objRepo.email).sendKeys("deepa.nayak@gamma.klaar.team");
        findElementMethod(objRepo.password).sendKeys("Klaar2021");
        findElementMethod(objRepo.loginButton).click();
        findElementMethod(objRepo.settingsIcon).click();
    }

    public WebElement findElementMethod(By objby) {
        return driver.findElement(objby);
    }
}
