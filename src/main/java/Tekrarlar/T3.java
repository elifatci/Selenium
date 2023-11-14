package Tekrarlar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.drive", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("phone");
        searchBox.submit();

        Thread.sleep(2000);


        driver.get("https://www.trendyol.com");
        WebElement searchBoxTrendyol = driver.findElement(By.className("V8wbcUhU"));
        searchBoxTrendyol.sendKeys("phone");
        searchBoxTrendyol.sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        driver.navigate().back();
        driver.quit();
    }
}
