package utilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverSetup {
    public static void main(String[] args) {
        // Setting up webriver.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Browser Window Size.
        driver.manage().window().maximize();

        // Browser URL.
        driver.get("https://www.zoho.com/crm/signup.html");

    }

}
