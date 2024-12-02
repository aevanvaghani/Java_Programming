import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetAttributes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");
        String GetAtt = driver.findElement(By.name("q")).getAttribute("placeholder");
        System.out.println(GetAtt);
    }
}
