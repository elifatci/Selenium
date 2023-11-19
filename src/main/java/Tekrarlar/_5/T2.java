package Tekrarlar._5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver,chrome,driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        if (homePage.isDisplayed()) {
            System.out.println("HomePage test is PASSED");
        } else {
            System.out.println("HomePage test is FAİLED");
        }
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        //5. Verify 'Login to your account' is visible
        WebElement loginTo = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        if (loginTo.isDisplayed()) {
            System.out.println("loginTo test is PASSED");
        } else {
            System.out.println("loginTo tets is FAİLED");
        }
        //6. Enter incorrect email address and password
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("ee@ee.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("11");
        //7. Click 'login' button
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        //8. Verify error 'Your email or password is incorrect!' is visible
        WebElement error = driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']"));
        if (error.isDisplayed()) {
            System.out.println("Error test is PASSED");
        } else {
            System.out.println("Error test is FAİLED");
        }
        Thread.sleep(2000);
        driver.quit();

    }
}
