import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnPartialLinkText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");
//        driver.findElement(By.partialLinkText("Recently")).click();
        driver.findElement(By.partialLinkText("Jewelry")).click();
    }
}
