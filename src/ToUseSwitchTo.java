import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class ToUseSwitchTo {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.shoppersstack.com/products_page/30");
        Thread.sleep(10000);
        driver.findElement(By.name("compare")).click();

        String id = driver.getWindowHandle();
        System.out.println(id);

        Set<String> ids = driver.getWindowHandles();
        System.out.println(ids);

        for (String id1 :ids){
            driver.switchTo().window(id1);

            String url = driver.getCurrentUrl();
            if (url.contains("flipkart")){
                driver.manage().window().maximize();
            }
            System.out.println(url);
        }
    }
}
