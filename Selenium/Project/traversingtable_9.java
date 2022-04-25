package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class traversingtable_9 {
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='list view table-responsive']")));
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='list view table-responsive']/tbody/tr"));
        System.out.println("Number of rows are: " + rows.size());
       WebElement Name  = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[1]/td[3]"));
       WebElement User = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[1]/td[8]"));
       System.out.println("Name 1:" + Name.getText());
       System.out.println("User 1::"+User.getText());
       WebElement Name2  = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[2]/td[3]"));
       WebElement User2 = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[2]/td[8]"));
        System.out.println("Name 2:" + Name2.getText());
        System.out.println("User 2::"+User2.getText());
        WebElement Name3  = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[3]/td[3]"));
        WebElement User3 = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[3]/td[8]"));
        System.out.println("Name 3:" + Name3.getText());
        System.out.println("User 3::"+User3.getText());
        WebElement Name4  = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[4]/td[3]"));
        WebElement User4 = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[4]/td[8]"));
        System.out.println("Name 4:" + Name4.getText());
        System.out.println("User 4::"+User4.getText());
        WebElement Name5  = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[5]/td[3]"));
        WebElement User5 = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[5]/td[8]"));
        System.out.println("Name 5:" + Name5.getText());
        System.out.println("User 5::"+User5.getText());
        WebElement Name6  = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[6]/td[3]"));
        WebElement User6 = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[6]/td[8]"));
        System.out.println("Name 6:" + Name6.getText());
        System.out.println("User 6::"+User6.getText());
        WebElement Name7  = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[7]/td[3]"));
        WebElement User7 = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[7]/td[8]"));
        System.out.println("Name 7:" + Name7.getText());
        System.out.println("User 7::"+User7.getText());
        WebElement Name8  = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[8]/td[3]"));
        WebElement User8 = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[8]/td[8]"));
        System.out.println("Name 8:" + Name8.getText());
        System.out.println("User 8::"+User8.getText());
        WebElement Name9  = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[9]/td[3]"));
        WebElement User9 = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[9]/td[8]"));
        System.out.println("Name 9:" + Name9.getText());
        System.out.println("User 9::"+User9.getText());
        WebElement Name10  = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[10]/td[3]"));
        WebElement User10 = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[10]/td[8]"));
        System.out.println("Name 10:" + Name10.getText());
        System.out.println("User 10::"+User10.getText());
        driver.close();



    }
}
