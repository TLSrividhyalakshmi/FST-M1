package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage_4 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        WebElement UserName = driver.findElement(By.xpath("//input[@id = 'user_name']"));
        WebElement password = driver.findElement(By.xpath("//input[@id = 'username_password']"));

        UserName.sendKeys("admin");
       password.sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id = 'bigbutton']")).click();
        driver.close();
    }
}