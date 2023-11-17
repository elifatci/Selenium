package Tekrarlar._3;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //1- https://testotomasyonu.com/addremove/ adresine gidin
        driver.get("https://testotomasyonu.com/addremove/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[text()='Add']")).click();
        //3- Remove butonu’nun gorunur oldugunu test edin
        WebElement removeButon = driver.findElement(By.xpath("//button[text()='Remove']"));
        if (removeButon.isDisplayed()) {
            System.out.println("Remove buton gorunurluk testi PASSED");
        } else {
            System.out.println("Remove buton gorunurluk testi FAİLED");
        }
        System.out.println("----------------------------------------------------------");
        //4- Remove tusuna basin
        removeButon.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElements = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemoveElements.isDisplayed()) {
            System.out.println("Element gorunurluk testi PASSED");
        } else {
            System.out.println("Element gorunurluk testi FAİLED");
        }
        System.out.println("----------------------------------------------------------");
        //6-remove butonun gorunur olmadigini test edin

        try {
            removeButon = driver.findElement(By.xpath("//button[text()='Remove']"));
            System.out.println("Gorunurluk testi FAİLED");
        } catch (NoSuchElementException e) {
            System.out.println("Gorunurluk testi PASSED");
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
