package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Menuchecking_6 {
    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        WebElement UserName = driver.findElement(By.xpath("//input[@id = 'user_name']"));
        WebElement password = driver.findElement(By.xpath("//input[@id = 'username_password']"));

        UserName.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id = 'bigbutton']")).click();
        boolean iconPresence = driver.findElement(By.id("grouptab_3")).isDisplayed();
        boolean IconEnabled = driver.findElement(By.id("grouptab_3")).isEnabled();

        if (iconPresence==true && IconEnabled==true)
        {
            WebElement activitiesIcon = driver.findElement(By.id("grouptab_3"));
           activitiesIcon.click();
        }
        driver.close();
    }
}
