package LaunchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\reach\\Downloads\\Selenium_Essentials\\Chrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://way2automation.com");


    }
}
