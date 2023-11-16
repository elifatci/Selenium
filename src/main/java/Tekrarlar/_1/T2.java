package Tekrarlar._1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https:www.testotomasyonu.com");


        String expectedTitle = "Otomasyon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("TEST of TİTLE is PASSED");
        } else {
            System.out.println("TEST of TİTLE is FAİLED");
        }


        driver.navigate().to("https://www.youtube.com");


        String expectedUrl = "tube";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("TEST of URL is PASSED");
        } else {
            System.out.println("TEST of URL is FAİLED");
        }


        driver.navigate().back();


        driver.quit();
    }
}
