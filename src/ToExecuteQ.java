import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExecuteQ {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location = 'http://demowebshop.tricentis.com';");

        WebElement FB = driver.findElement(By.xpath("//a[text()='Facebook']"));
        FB.click();

        String FBTitle = driver.getTitle();
        System.out.println(FBTitle);

        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle); // Switch to the new window (Facebook)
                break;
            }
        }
        driver.close();
        driver.switchTo().window(originalWindow);
        driver.close();
    }
}
