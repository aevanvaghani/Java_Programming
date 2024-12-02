import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ToLearnTagName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");
        List<WebElement>  alllinks = driver.findElements(By.tagName("a"));
        System.out.println(alllinks.size());
//        System.out.println(alllinks);  address print
    }
}
