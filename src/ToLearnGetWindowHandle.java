import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class ToLearnGetWindowHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.linkText("Facebook")).click();
        String windowId = driver.getWindowHandle();
        System.out.println(windowId);

        Set<String> windowIds = driver.getWindowHandles();
        System.out.println(windowIds);

        for (String ids:windowIds)
        {
            System.out.println(ids);
        }

    }
}
