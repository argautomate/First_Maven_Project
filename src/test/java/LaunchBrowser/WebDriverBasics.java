//We can paste executables into the root folder i.e. Maven_Project to skip entering System.setProperty("","");
package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://way2automation.com");

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());

        driver.close(); //Closes current browser window
        driver.quit(); //Closes all browser windows in current session
    }
}
