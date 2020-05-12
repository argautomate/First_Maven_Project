package Syncronization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ComposeGmailEmail {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http:\\gmail.com");
        WebDriverWait wait = new WebDriverWait(driver, 20);



        driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("argautomate@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();

        //Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.name("password")).sendKeys("se1en1um");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
        driver.manage().window().maximize();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"))).click();
        System.out.println("Clicked the compose button");

        //Brute force method using cssSelector used for To, Subject and Email Content
        driver.findElement(By.cssSelector(".oj div textarea")).sendKeys("argautomate@gmail.com");
        Thread.sleep(1000);//Not necessary
        driver.findElement(By.cssSelector(".aoD.az6 input")).sendKeys("First automated email using Selenium");
        Thread.sleep(1000);//Not necessary
        driver.findElement(By.cssSelector(".Ar.Au div")).sendKeys(",Sincerely");


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@class='gU Up']"))).click();
        System.out.println("CHECK");

        Thread.sleep(2000);//Not necessary
        driver.quit();

    }
}
