//Use Explicit wait for error like below
//org.openqa.selenium.ElementNotInteractableException:
// Element <input class="whsOnd zHQkBf" name="password" type="password"> is not reachable by keyboard
//Not Interactable means the element is present but we need to wait until it appears
//Element should be present inside DOM
//Implementation for Firefox
package Syncronization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class UseFluentWait {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http:\\gmail.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);

        /*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);*/

        //WebElement username = driver.findElement(By.id("identifierId"));
        //WebElement username = driver.findElement(By.name("identifier"));
        //WebElement username = driver.findElement(By.cssSelector("#identifierId"));
        // WebElement username = driver.findElement(By.xpath("//*[@id='identifierId']"));
        // username.sendKeys("reach.abhijitgargote@gmail.com");

        //WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span"));
        //nextButton.click();

        driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("argautomate@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();

        //Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //driver.findElement(By.name("password")).sendKeys("se1en1um");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("se1en1um");
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password"))).sendKeys("se1en1um");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
        driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
        driver.quit();

    }
}
