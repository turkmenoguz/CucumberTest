package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    public  static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!---TEST BASLIYOR---!!!!!!!!!!!!!!!!!!!!");
            System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-popup-blocking");
            options.addArguments("incognito");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}











