import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class ToLearnSwitchTo {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.shoppersstack.com/products_page/23");
        driver.findElement(By.id("Compare")).click();
        String parentId = driver.getWindowHandle();

//        capture all windows
        Set<String> allWindowIds = driver.getWindowHandles();

//        navigate through all window
        for (String id:allWindowIds) {
            driver.switchTo().window(id);
            Thread.sleep(1000);

            String url = driver.getCurrentUrl();
            if (!url.contains("ebay")){
                driver.manage().window().maximize();
            }
            System.out.println(url);
        }
    }
}
