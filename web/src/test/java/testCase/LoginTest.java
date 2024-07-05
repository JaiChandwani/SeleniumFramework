package testCase;
import base.baseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginTest extends baseTest {
    @Test
    public static void login(){

driver.findElement(By.xpath("//label[1]")).sendKeys("tani101");
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345678");
driver.findElement(By.xpath("//button[@class='btn rounded-full btn-primary text-white']")).click();
Assert.assertTrue(driver.findElement(By.xpath("//a[@class='flex justify-center md:justify-start']//*[name()='svg']")).isDisplayed());
    }
}

