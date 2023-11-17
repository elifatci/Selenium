package Tekrarlar._3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class T3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // https://testotomasyonu.com/relativeLocators sayfasina gidin
        driver.get("https://testotomasyonu.com/relativeLocators");
        // Lenova Yoga Slim elementini locate edin
        WebElement lenova = driver.findElement(By.xpath("//img[@id='pic15_thumb']"));
        // webelemntin HTML kodunda src tag'inin
        // "testotomasyonu.com/uploads/product" icerdigini test edin
        String expectedTag = "testotomasyonu.com/uploads/product";
        String actualTag = lenova.getAttribute("src");

        if (actualTag.contains(expectedTag)) {
            System.out.println("Lenova Yoga Slim Tag testi PASSED");
        } else {
            System.out.println("Lenova Yoga Slim Tag testi FAİLED");
        }
        System.out.println("-------------------------------------------------");
        // Lenova Yoga webelementi ve relative locator kullanarak
        // Canon EOS kamerayi locate edin

        WebElement CanonEOS = driver.findElement(RelativeLocator.with(By.id("pic9_thumb")).above(lenova));

        // Canon EOS kameranin src attribute'inde 1688267364 numarasinin bulundugunu test edin
        String expectedAttribute = "1688267364";
        String actualAttribute = CanonEOS.getAttribute("src");
        if (actualAttribute.contains(expectedAttribute)) {
            System.out.println("Canon EOS attribute testi PASSED");
        } else {
            System.out.println("Canon EOS attribute testi FAİLED");
        }
        System.out.println("-------------------------------------------------");

        // Samsung Galaxy M14 telefonun id attribute'nun degerinin "pic11_thumb" oldugunu test edin
        WebElement samsungGalaxy = driver.findElement(RelativeLocator.with(By.id("pic11_thumb")).toLeftOf(lenova));
        String expectedİd = "pic11_thumb";
        String actualİd = samsungGalaxy.getAttribute("id");
        if (expectedİd.equals(actualİd)) {
            System.out.println("Samsung Galaxy M14 id testi PASSED");
        } else {
            System.out.println("Samsung Galaxy M14 id testi FAİLED");
        }

        driver.quit();

    }
}
