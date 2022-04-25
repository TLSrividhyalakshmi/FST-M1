package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class colorsgetting_5 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://alchemy.hguy.co/crm");
        WebElement UserName = driver.findElement(By.xpath("//input[@id = 'user_name']"));
        WebElement password = driver.findElement(By.xpath("//input[@id = 'username_password']"));

        UserName.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id = 'bigbutton']")).click();
       // WebElement bckgclr = driver.findElement(By.xpath("//div[@id = 'toolbar']"));
        // String color=bckgclr.getCssValue("background-color");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@role='navigation']")));
        String bgColour = driver.findElement(By.xpath("//nav[@role='navigation']")).getCssValue("background-color");
        System.out.println("Background colour is: " + bgColour);

        //driver.close();
    }
}