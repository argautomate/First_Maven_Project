//is Displayed method is not checking the presence of element
//it is just checking the visibility of the element
package LocatingElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementPresent {

    public static WebDriver driver;
    public static boolean ElementPresent(String locator) {
        //Method1
        /*try {
            driver.findElement(By.xpath(locator));
            return true;
        } catch (Exception t) {
            return false;
        }
    }*/
        //Method2
        int size = driver.findElements(By.xpath(locator)).size();
        if (size == 0) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program Starting");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //System.out.println("Is Element Displayed: "+driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]/strong")).isDisplayed());
        //System.out.println("Is Element Displayed: "+driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]")).isDisplayed());
        System.out.println("Is Element Present: "+ ElementPresent("//*[@id=\"js-link-box-en\"]/strong"));
        driver.quit();
    }

}
