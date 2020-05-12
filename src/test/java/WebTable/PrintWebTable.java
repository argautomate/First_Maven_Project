package WebTable;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PrintWebTable {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program Starting");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        //Thread.sleep(6000);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> rowNum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
        System.out.println("Total Table rows are: " + rowNum.size());

        List<WebElement> colNum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
        System.out.println("Total Table columns are: " + colNum.size());

        for(int rows=1; rows<=rowNum.size();rows++)
        {
            for(int cols=1;cols<=colNum.size(); cols++)
            {
                System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rows+"]/td["+cols+"]")).getText() + "  ");

            }

            System.out.println();
        }


        driver.quit();


    }
}
