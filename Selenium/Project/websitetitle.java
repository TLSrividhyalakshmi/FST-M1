package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class websitetitle {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        String pagetitle = "SuiteCRM";
        if (title.equalsIgnoreCase(pagetitle))
            driver.close();
        else
            System.out.println("Error");
    }
}
