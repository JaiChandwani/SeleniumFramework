package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class baseTest {
    //    getting webDriver,properties,fileReader..
    public static WebDriver driver;
    public static Properties prop = new Properties();
    public static Properties loc = new Properties();
    public static Properties data = new Properties();
    public static FileReader fr;
    public static FileReader fr1;
    public static FileReader fr2;

    // SetUP Runs in starting of the test case.
    @BeforeMethod
    public void setUp() throws IOException {
//        Setting-up browser.
        fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\config.properties");
        fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\locators.properties");
        fr2= new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\data.properties");
        prop.load(fr);
        loc.load(fr1);
        data.load(fr2);
        if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
//                Setting window width to maximum.
            driver.manage().window().maximize();
//                Adding URL.
            driver.get(prop.getProperty("testURL"));
        } else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
//                Setting window width to maximum.
            driver.manage().window().maximize();
//                Adding URL.
            driver.get(prop.getProperty("testURL"));
        }
        else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
//                Setting window width to maximum.
            driver.manage().window().maximize();
//                Adding URL.
            driver.get(prop.getProperty("testURL"));
        }
    }

    @AfterMethod
    //tearDown Runs ends the test.
    public void tearDown() {
        driver.close();
    }
}
