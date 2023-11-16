package Tekrarlar._1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class T5 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testotomasyonu.com");

        List<WebElement> brands = driver.findElements(By.xpath("//a[@class='brandbox']"));

        Thread.sleep(2000);
        int expectedResult = 6;
        int actualResult = brands.size();
        if (expectedResult == actualResult) {
            System.out.println("Test is PASSED");

        } else {
            System.out.println("Test is FAİLED");
        }

        boolean selected = false;

        for (WebElement each : brands) {
            if (each.isSelected()) {
                selected = true;
                break;
            }
        }
        if (selected == true) {
            System.out.println("SelectedTest PASSED");
        } else {
            System.out.println("SelectedTest FAİLED");
        }


        driver.quit();


    }
}
