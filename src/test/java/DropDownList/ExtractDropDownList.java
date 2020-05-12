//Select class is accurate for selecting drop down values unlike sendKeys
//WebElement can be used in 2 ways shown
//WebElement	findElement(By by) : //Find the first WebElement using the given method.
//This will not work with multiple drop down lists present in the same page
package DropDownList;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExtractDropDownList {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program Starting");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        WebElement dropdown = driver.findElement(By.id("searchLanguage"));
        Select select = new Select(dropdown);

        List<WebElement> values = driver.findElements(By.tagName("option"));

        System.out.println("Drop Down List Total is: "+ values.size());
        System.out.println(values.get(7).getText()); // GetText of the 8th element at the 7th index

        for(int i =0; i< values.size();i++)
        {
            System.out.println("Drop Down Text is: "+(values.get(i).getText())); // GetText of all elements in the drop down
        }

        for(int i =0; i< values.size();i++)
        {
            System.out.println("Drop down Language is: "+(values.get(i).getAttribute("lang"))); //Get all language
        }
        driver.quit();

    }
}
