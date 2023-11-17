package Tekrarlar._3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //testotomasyonu.com anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");
        //electronics linkine tiklayin
        driver.findElement(By.xpath("(//a[text()='Electronics'])[3]")).click();

        //kenarda bulunan fiyat filtresinde
        // min 10 max 200 yazarak filtreleme yapin
        //arama sonucunda urun bulunabildigini test edin ve sayfayi kapatin

        WebElement min = driver.findElement(By.xpath("//input[@name='min']"));
        WebElement max = driver.findElement(By.xpath("//input[@name='max']"));

        min.clear();
        min.sendKeys("10");
        max.clear();
        max.sendKeys("200");
        WebElement find = driver.findElement(By.xpath("//div[@class='mx-3 my-2']"));
        Thread.sleep(5000);
        find.click();


        WebElement result = driver.findElement(By.xpath("//span[@class='product-count-text']"));

        String str = result.getText().replaceAll("\\D", "");
        int actualResult = Integer.parseInt(str);

        if (actualResult > 0) {
            System.out.println("urun bulunabilirlik testi PASSED");
        } else {
            System.out.println("urun bulunabilirlik testi FAİLED");
        }

        Thread.sleep(2000);
        driver.quit();

    }
}
