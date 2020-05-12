//Locators
/*
1. id = identifierID
2. name = identifier
3. cssSelector =#identifierId
4. xpath =//*[@id='identifierId']
5. className=whs0nd zHQkBf
6. tagName = input
7. linkText
8. partialLinkText
 */

package LaunchBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UseWebElement {

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


    }

}
