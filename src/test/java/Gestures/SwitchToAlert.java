package Gestures;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchToAlert {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program Starting");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.xpath("//input[@name='proceed']")).click();
        Thread.sleep(2000);
        /*driver.switchTo().alert().accept();*/

        /*Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();*/

        WebDriverWait wait = new WebDriverWait(driver,10);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();


        //driver.quit();

    }
}
