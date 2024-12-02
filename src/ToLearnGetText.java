import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/login");
        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

        String ErrorMessage = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
        System.out.println(ErrorMessage);
    }
}
