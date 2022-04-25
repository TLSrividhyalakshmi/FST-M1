package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class tabletraversing8 {
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
        WebElement accIcon = driver.findElement(By.id("moduleTab_9_Accounts"));
        accIcon.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='list view table-responsive']")));
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='list view table-responsive']/tbody/tr"));
        System.out.println("Number of rows are: " + rows.size());
        WebElement Name  = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[1]/td[3]"));
        System.out.println("Name 1:" + Name.getText());
        WebElement Name3  = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[3]/td[3]"));
        System.out.println("Name 3:" + Name3.getText());
        WebElement Name5  = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[5]/td[3]"));
        System.out.println("Name 5:" + Name5.getText());
        WebElement Name7  = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[7]/td[3]"));
        System.out.println("Name 7:" + Name7.getText());
        WebElement Name9  = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[9]/td[3]"));
        System.out.println("Name 9:" + Name9.getText());
        driver.close();
    }

}

