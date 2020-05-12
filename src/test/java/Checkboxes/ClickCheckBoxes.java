//$x('/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[1]')
// Type the above in browser console to reduce the absolute xpath length
//$x('//div[4]/input[1]') Delete to the point you get a unique input
package Checkboxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCheckBoxes {

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

        /*driver.findElement(By.xpath("//div[4]/input[1]")).click();
        driver.findElement(By.xpath("//div[4]/input[2]")).click();
        driver.findElement(By.xpath("//div[4]/input[3]")).click();
        driver.findElement(By.xpath("//div[4]/input[4]")).click();*/

        /*for(int i=1;i<5;i++)
        {
            driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
        }*/

        int i = 1;
        int count = 0;
        while(ElementPresent(By.xpath("//div[4]/input["+i+"]")))
        {
            driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
            i++;
            count++;
        }

        System.out.println("Count of Checkboxes is: " + count);
        //Thread.sleep(2000);
        //driver.quit();
    }
}
