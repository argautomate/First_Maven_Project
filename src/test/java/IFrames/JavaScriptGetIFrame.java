package IFrames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class JavaScriptGetIFrame {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program Starting");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver, 10);

        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        System.out.println(frames.size());

        driver.switchTo().frame("iframeResult");
        /*driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
        System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());*/

        //((JavascriptExecutor) driver).executeScript("myFunction()");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("myFunction()");

        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", driver.findElement(By.xpath("//*[@id=\"mySubmit\"]")));
        //driver.quit();

    }
}
