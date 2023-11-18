package Tekrarlar._4;

import org.openqa.selenium.By;
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

        //Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //Click on  Simple Note Taker under Micro Apps
        driver.findElement(By.xpath("//a[@id='simple-note-taker']")).click();
        //Write 'note 1' in the title
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("note 1 ");
        //Add "all is well" in the note section
        driver.findElement(By.xpath("//textarea[@minlength='1']")).sendKeys("all is well");
        //Click on Add
        driver.findElement(By.xpath("//button[@id='add-note']")).click();
        //Click on Edit
        driver.findElement(By.xpath("//button[@class='edit-note-in-list']")).click();
        Thread.sleep(2000);
        //Add ' :) ' next to the text
        driver.findElement(By.xpath("//textarea[@minlength='1']")).sendKeys(" :)");
        Thread.sleep(2000);
        //Click on Add
        driver.findElement(By.xpath("//button[@id='add-note']")).click();
        //Click on show
        driver.findElement(By.xpath("//button[@id='show-notes']")).click();
        //Test the visibility of the notes
        WebElement element = driver.findElement(By.xpath("//p[@class='title-note-in-list']"));

        if (element.isDisplayed()) {
            System.out.println("Test is PASSED");
        } else {
            System.out.println("Test is FAİLED");
        }

        Thread.sleep(2000);
        driver.quit();

    }
}
