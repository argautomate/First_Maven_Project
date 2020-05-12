package Gestures;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program Starting");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement draggable1 = driver.findElement(By.id("draggable"));
        //WebElement droppable = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);
        //action.dragAndDrop(draggable, droppable).perform();
        action.dragAndDropBy(draggable1, 400, 400).perform();
        //driver.quit();

    }
}
