package Tekrarlar._5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        if (homePage.isDisplayed()) {
            System.out.println("HomePage test is PASSED");
        } else {
            System.out.println("HomePage test is FAİLED");
        }
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
        //5. Verify 'Login to your account' is visible
        WebElement loginTo = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        if (loginTo.isDisplayed()) {
            System.out.println("loginTo test is PASSED");
        } else {
            System.out.println("loginTo test is FAİLED");
        }

        //6. Enter correct email address and password
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("ee@bb.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("11");

        //7. Click 'login' button
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
        //8. Verify that 'Logged in as username' is visible
        WebElement loggedin = driver.findElement(By.xpath(" //a[text()=' Logged in as ']"));
        if (loggedin.isDisplayed()) {
            System.out.println("loggedin test is PASSED");
        } else {
            System.out.println("loggedin test is FAİLED");
        }
        //9. Click 'Delete Account' button
        driver.findElement(By.xpath("( //a[@style='color:brown;'])[2]")).click();
        //10. Verify that 'ACCOUNT DELETED!' is visible
        WebElement accountDeleted = driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
        if (accountDeleted.isDisplayed()) {
            System.out.println("AccountDeleted test is PASSED");
        } else {
            System.out.println("AccountDeleted test is FAİLED");
        }

        driver.quit();
    }
}
