package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExecuteInsta {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.instagram.com/");
        driver.findElement(By.xpath("//span[text()='Contact Uploading & Non-Users']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search help articles…']")).sendKeys("facebook");

    }
}
