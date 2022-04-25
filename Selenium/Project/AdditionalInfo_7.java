package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdditionalInfo_7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://alchemy.hguy.co/crm");
        WebElement UserName = driver.findElement(By.xpath("//input[@id = 'user_name']"));
        WebElement password = driver.findElement(By.xpath("//input[@id = 'username_password']"));

        UserName.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id = 'bigbutton']")).click();
        boolean iconPresence = driver.findElement(By.id("grouptab_0")).isDisplayed();
        boolean IconEnabled = driver.findElement(By.id("grouptab_0")).isEnabled();
        WebElement iconclick = driver.findElement(By.id("grouptab_0"));
        iconclick.click();
        WebElement leadsIcon = driver.findElement(By.id("moduleTab_9_Leads"));
        leadsIcon.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='suitepicon suitepicon-action-info']")));
        WebElement addinfo = driver.findElement(By.xpath("//span[@class='suitepicon suitepicon-action-info']"));
        addinfo.click();
        System.out.println("success");
       // WebElement phone = driver.findElement(By.xpath("//span[@class='phone'"));
        //phone.getText();
       // System.out.println("phone Number:" + phone);
        driver.close();
    }
    }
