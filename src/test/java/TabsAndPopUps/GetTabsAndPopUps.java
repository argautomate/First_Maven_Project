package TabsAndPopUps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class GetTabsAndPopUps {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program Starting");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.reddit.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver, 10);


        Set<String> windids = driver.getWindowHandles();
        Iterator<String> iterate = windids.iterator();

        String first_window = iterate.next();
        System.out.println(first_window);
        driver.findElement(By.xpath("//a[@class='wLV79_wV-ziNiWmf3Y7OV Z_HUY3BUsGOBOtdmH94ZS _3Wg53T10KuuPmyWOMWsY2F _2nelDm85zKKmuD94NequP0']")).click();

        windids = driver.getWindowHandles();
        iterate = windids.iterator();
        String second_window = iterate.next();
        driver.switchTo().window(second_window);
        driver.findElement(By.name("//button[@class='AnimatedForm__submitButton m-success']")).click();





        //driver.quit();

    }
}
