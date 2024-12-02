import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentAndIndependent {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.shoppersstack.com/");
        driver.findElement(By.xpath("//span[text()='ROADSTER']/../..//button[@id='addToCart']")).click();
//        driver.findElement(By.xpath("//span[text()='ROADSTER']/..//span[1][text()='₹']"));   dynamic change
    }
}
