package Gestures;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JquerySlider {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program Starting");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/resources/demos/slider/default.html");
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement MainSlider = driver.findElement(By.id("slider"));
        int width = MainSlider.getSize().width/2;

        WebElement slider = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/span[1]"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider, width,0).perform();

        //driver.quit();

    }
}
