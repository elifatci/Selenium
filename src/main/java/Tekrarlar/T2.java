package Tekrarlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // testotomasyonu ana sayfaya gidin
        driver.get("https:www.testotomasyonu.com");

        // title'in Otomasyon icerdigini test edin
        String expectedTitle="Otomasyon";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("TEST of TİTLE is PASSED");
        }else {
            System.out.println("TEST of TİTLE is FAİLED");
        }

        // sonra Wisequarter anasayfaya gidin
            driver.navigate().to("https://www.youtube.com");

        // Url'in wisequarter icerdigini test edin
            String expectedUrl="tube";
            String actualUrl=driver.getCurrentUrl();
            if (actualUrl.contains(expectedUrl)){
                System.out.println("TEST of URL is PASSED");
            }else{
                System.out.println("TEST of URL is FAİLED");
            }


        // tekrar testotomasyonu sayfasina donun
            driver.navigate().back();

        // sayfayi kapatin
            driver.quit();
    }
}
