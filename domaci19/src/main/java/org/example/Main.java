package org.example;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        Faker faker = new Faker();

        System.setProperty("webdriver.chrome.driver","C://Users//rilak//OneDrive//Desktop//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys(faker.name().fullName());

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys(faker.internet().emailAddress());

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys(faker.address().fullAddress());

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(faker.address().fullAddress());

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollTo(0, 200)");

        WebElement outputFullName = driver.findElement(By.id("name"));

        WebElement outputEmail = driver.findElement(By.id("email"));

        if(outputFullName.getText().contains(fullName.getText()) && outputEmail.getText().contains(email.getText())){
            System.out.println("User information is same as entered.");
        } else {
            System.out.println("User information is not same as entered.");
        }

        driver.close();
    }
}
