//Select class is accurate for selecting drop down values unlike sendKeys
//WebElement can be used in 2 ways shown
package DropDownList;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SelectDropDownListValue {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //driver.findElement(By.id("searchLanguage")).sendKeys("Eesti");
        //The above statement selects Espanol instead of Eesti

        //Method1:
        //WebElement dropdown = driver.findElement(By.id("searchLanguage"));
        //Select select = new Select(dropdown);

        //Method2:
        Select select = new Select(driver.findElement(By.id("searchLanguage")));
        //select.selectByVisibleText("Eesti");
        //If we need to select a language other than Engligh make use of value field
        // The below statement selects Hindi from the drop down list
        select.selectByValue("hi");
        Thread.sleep(2000);
        driver.quit();

    }
}
