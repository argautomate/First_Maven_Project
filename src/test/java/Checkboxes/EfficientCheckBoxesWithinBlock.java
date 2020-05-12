//$x('/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[1]')
// Type the above in browser console to reduce the absolute xpath length
//$x('//div[4]/input[1]') Delete to the point you get a unique input
package Checkboxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class EfficientCheckBoxesWithinBlock {

    public static WebDriver driver;
    public static boolean ElementPresent(By by) {
        //Method1
        try {
            driver.findElement(by);
            return true;
        } catch (Exception t) {
            return false;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program Starting");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");

        WebElement block = driver.findElement(By.xpath("//table/tbody/tr/td/div[4]"));
        List<WebElement> checkboxes = block.findElements(By.name("sports"));
        System.out.println("Count of Checkboxes is: " + checkboxes.size());

        for(WebElement checkbox:checkboxes)
        {
            checkbox.click();
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
