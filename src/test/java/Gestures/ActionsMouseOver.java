package Gestures;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ActionsMouseOver {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program Starting");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.name("q")).sendKeys("way2automation.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='g']//div//div[@class='rc']//h3[@class='LC20lb DKV0Md'][contains(text(),'Way2Automation')]"))).click();

        WebElement menu = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));

        Actions action = new Actions(driver);
        action.moveToElement(menu).perform();
        driver.findElement(By.xpath("//a[contains(text(),'Practice site 1')]")).click();
        //driver.quit();
}
    }
