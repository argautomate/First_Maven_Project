package Gestures;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RClick {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program Starting");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://deluxe-menu.com/popup-mode-sample.html");
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement image = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));

        Actions action = new Actions(driver);
        action.contextClick(image).perform();
        //driver.quit();

    }
}
