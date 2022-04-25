package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class copyright_text3 {
    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        String text = driver.findElement(By.id("admin_options")).getText();
        System.out.println("copyright text is: " + text);
        driver.close();

    }
    }
