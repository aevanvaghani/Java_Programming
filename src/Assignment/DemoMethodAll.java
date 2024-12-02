package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class DemoMethodAll {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.linkText("Facebook")).click();
        switchToWindow(driver,"facebook");

        driver.findElement(By.xpath("//span[text()='Create new account']")).click();

        switchToWindow(driver,"reg");
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("avian");
    }
    public static void switchToWindow(WebDriver driver,String expurl){
        Set<String> allWindowIds = driver.getWindowHandles();
        for (String id: allWindowIds){
            driver.switchTo().window(id);
            String actual = driver.getCurrentUrl();
            if (actual.contains(expurl)) {
                break;
            }
        }
    }
}
