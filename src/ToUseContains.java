import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseContains {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.instagram.com/");
//        driver.findElement(By.xpath("//input[contains(@aria-label,'username')]")).sendKeys("1234567891");
//        driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("9876543210");
//        driver.findElement(By.xpath("//div[text()='Log in']")).click();



        driver.findElement(By.xpath("//span[contains(text(),'Instagram from Meta')]"));
        System.out.println("Instagram from Meta");
    }
}
