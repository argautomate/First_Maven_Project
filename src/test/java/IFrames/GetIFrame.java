package IFrames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GetIFrame {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program Starting");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver, 10);

        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        System.out.println(frames.size());
        for(WebElement frame: frames)
        {
            System.out.println("Frame attribute is: " + frame.getAttribute("id"));

        }


        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(2);
        //driver.switchTo().frame()
        driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
        System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());

        driver.switchTo().defaultContent(); // To get out of the frame and get into the main page.
        for(WebElement frame: frames)       //Will not work with pop-ups
        {
            System.out.println("Again Frame attribute is: " + frame.getAttribute("id"));
        }

        //driver.quit();

    }
}
