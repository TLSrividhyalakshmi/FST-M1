package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class headerimage_2 {
    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        driver.get("https://alchemy.hguy.co/crm/themes/default/images/company_logo.png?v=cK7kLsY0ftg72ZVHTYUT_g");
        String urlheaderimg = driver.getCurrentUrl();
        System.out.println(urlheaderimg);
        driver.close();


    }
}
