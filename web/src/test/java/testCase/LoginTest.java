package testCase;
import base.baseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends baseTest {
    @Test
    public static void login() throws InterruptedException {
        driver.findElement(By.xpath(loc.getProperty("UserName"))).sendKeys(data.getProperty("UserName"));
        Thread.sleep(2000);
        driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys(data.getProperty("password"));
        Thread.sleep(2000);
        driver.findElement(By.xpath(loc.getProperty("Login"))).click();

    }
}

