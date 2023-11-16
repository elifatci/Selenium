package Tekrarlar._2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T1 {

    //Navigate to  https://testpages.herokuapp.com/styled/index.html
    //Click on  Calculater under Micro Apps
    //Type any number in the first input
    //Choose the minus
    //Type any number in the second input
    //Click on Calculate
    //Get the result
    //Print the result
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.id("calculatetest")).click();
        driver.findElement(By.id("number1")).sendKeys("125");
        driver.findElement(By.xpath("//option[@value='minus']")).click();
        driver.findElement(By.id("number2")).sendKeys("25");
        Thread.sleep(2000);
        driver.findElement(By.id("calculate")).click();
        WebElement result = driver.findElement(By.id("answer"));

        System.out.println("The result of minus: " + result.getText());

        WebElement number1 = driver.findElement(By.id("number1"));
        number1.clear();
        number1.sendKeys("100");

        driver.findElement(By.xpath("//option[@value='divide']")).click();
        WebElement number2 = driver.findElement(By.id("number2"));
        number2.clear();
        number2.sendKeys("5");
        Thread.sleep(3000);
        driver.findElement(By.id("calculate")).click();
        System.out.println("The result of divide: " + driver.findElement(By.id("answer")).getText());


        driver.quit();

    }
}
