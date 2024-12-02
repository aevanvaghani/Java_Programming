import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.vtiger.com/vtigercrm/");
//        driver.findElement(By.xpath("//input[@id='username']")).clear();
//        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("aevan");
        WebElement ClearData = driver.findElement(By.xpath("//input[@id='username']"));
        ClearData.clear();
        Thread.sleep(2000);
        ClearData.sendKeys("aevan");
    }
}
