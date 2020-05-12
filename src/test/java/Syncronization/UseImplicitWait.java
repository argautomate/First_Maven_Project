//Use ImplicitWait for presence of element issue
//Implementation in Chrome
package Syncronization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UseImplicitWait {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http:\\gmail.com");

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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.name("password")).sendKeys("se1en1um");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
        driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();

    }
}
