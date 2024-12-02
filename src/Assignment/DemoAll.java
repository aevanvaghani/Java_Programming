package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class DemoAll {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.linkText("Facebook")).click();

//        step 1  capture window ids
        Set<String> allWindowIds = driver.getWindowHandles();

//        step 2  navigate through all windows
        for (String id: allWindowIds){
            driver.switchTo().window(id);
            String url = driver.getCurrentUrl();
            if (url.contains("facebook")) {
                break;
            }
        }
        driver.findElement(By.xpath("//span[text()='Create new account']")).click();

        Set<String> allWindowIds2 = driver.getWindowHandles();

        for (String id: allWindowIds2){
            driver.switchTo().window(id);
            String url = driver.getCurrentUrl();
            if (url.contains("reg")) {
                break;
            }
        }
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("avian");
    }
}
