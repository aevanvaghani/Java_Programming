import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.instagram.com/");
        driver.findElement(By.name("username")).sendKeys("aevan2011");
        driver.findElement(By.name("password")).sendKeys("aevan2011");
    }
}
