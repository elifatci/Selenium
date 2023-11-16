package Tekrarlar._1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class T4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.trendyol.com");

        driver.navigate().refresh();

        String expectedTitle = "En Trend";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test of Title is PASSED");
        } else {
            System.out.println("Test of Title is FAİLED");

        }
        WebElement tab = driver.findElement(By.xpath("(//a[@class='item'][3])"));
        tab.sendKeys(Keys.ENTER);

        List<WebElement> product = driver.findElements(By.xpath("//button[@class='add-to-basket-button']"));


        int expectedSize = 2;
        int actualSize = product.size();
        if (actualSize == expectedSize) {
            System.out.println("Test is PASSED");
        } else {
            System.out.println("Test is FAİLED");
        }

        driver.quit();


    }
}
