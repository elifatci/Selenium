package Tekrarlar._3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class T4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html
        //adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        //2 ) Berlin’i 3 farkli relative locator ile locate edin
        WebElement Portland = driver.findElement(By.xpath("//img[@id='pid4_thumb']"));
        WebElement Movember = driver.findElement(By.xpath("//img[@id='pid12_thumb']"));
        WebElement Warsaw = driver.findElement(By.xpath("//img[@id='pid1_thumb']"));
        //3 ) Relative locator’larin dogru calistigini test edin
        try {
            WebElement Berlin = driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).below(Portland).above(Movember).below(Warsaw));
            System.out.println("Test is PASSED");
        } catch (Exception e) {
            System.out.println("Test is FAİLED");
        }

        driver.quit();


    }
}
