//We can paste executables into the root folder i.e. Maven_Project to skip entering System.setProperty("","");
package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeUsingWebDriverManager {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://way2automation.com");

    }
}
