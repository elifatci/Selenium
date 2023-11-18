package Tekrarlar._4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

        // Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        // Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        if (homePage.isDisplayed()) {
            System.out.println("HomePage test is PASSED");
        } else {
            System.out.println("HomePage test is FAİLED");
        }
        // Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        // Verify 'New User Signup!' is visible
        WebElement newUser = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
        if (newUser.isDisplayed()) {
            System.out.println("New user test is PASSED");
        } else {
            System.out.println("New user test is FAİLED");
        }
        // Enter name and email address
        WebElement nameElement = driver.findElement(By.xpath("//input[@type='text']"));
        nameElement.sendKeys("Elif");
        WebElement emailElement = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        emailElement.sendKeys("ee@gg.com");
        // Click 'Signup' button
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        // Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccount = driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
        if (enterAccount.isDisplayed()) {
            System.out.println("EnterAccount test is PASSED");
        } else {
            System.out.println("EnterAccount test is FAİLED");
        }
        // Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("//label[@for='id_gender2']")).click();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Elif");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("11");
        driver.findElement(By.xpath("//option[@value='24']")).click();
        driver.findElement(By.xpath("(//option[@value='9'])[2]")).click();
        driver.findElement(By.xpath("//option[@value='1991']")).click();
        // Select checkbox 'Sign up for our newsletter!'
        WebElement select1 = driver.findElement(By.xpath("(//div[@class='checkbox'])[1]"));
        select1.click();
        // Select checkbox 'Receive special offers from our partners!'
        WebElement select2 = driver.findElement(By.xpath("(//div[@class='checkbox'])[2]"));
        select2.click();

        Thread.sleep(2000);
        // Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        driver.findElement(By.xpath("//input[@data-qa='first_name']")).sendKeys("Elif");
        driver.findElement(By.xpath("//input[@data-qa='last_name']")).sendKeys("EA");
        driver.findElement(By.xpath("//input[@data-qa='company']")).sendKeys("wise");
        driver.findElement(By.xpath("//input[@data-qa='address']")).sendKeys("istanbul");
        driver.findElement(By.xpath("//input[@data-qa='address2']")).sendKeys("istanbul");
        driver.findElement(By.xpath("//option[@value='Canada']")).click();
        driver.findElement(By.xpath("//input[@data-qa='state']")).sendKeys("Turkey");
        driver.findElement(By.xpath("//input[@data-qa='city']")).sendKeys("istanbul");
        driver.findElement(By.xpath("//input[@data-qa='zipcode']")).sendKeys("34000");
        driver.findElement(By.xpath("//input[@data-qa='mobile_number']")).sendKeys("11111000001");

        Thread.sleep(2000);
        // Click 'Create Account button'
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
        // Verify that 'ACCOUNT CREATED!' is visible
        WebElement accountCreated = driver.findElement(By.xpath("//b[text()='Account Created!']"));
        if (accountCreated.isDisplayed()) {
            System.out.println("AccountCreated test is PASSED");
        } else {
            System.out.println("AccountCreated test is FAİLED");
        }
        // Click 'Continue' button
        WebElement elementContinue = driver.findElement(By.xpath("//a[text()='Continue']"));
        elementContinue.click();
        // Verify that 'Logged in as username' is visible
        WebElement logged = driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
        if (logged.isDisplayed()) {
            System.out.println("Logged test is PASSED");
        } else {
            System.out.println("Logged test is FAİLED");
        }
        // Click 'Delete Account' button
        driver.findElement(By.xpath("//a[text()=' Delete Account']")).click();
        // Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        try {
            WebElement accountDeleted = driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
            System.out.println("AccountDeleted test is PASSED");
        } catch (Exception e) {
            System.out.println("AccountDeleted test is FAİLED");
        }
        driver.findElement(By.xpath("//a[text()='Continue']")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
