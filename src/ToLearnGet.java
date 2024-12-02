import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGet {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);

        if (title.equals("Google")) {
            System.out.println("user navigated to google welcome page");
        }else {
            System.out.println("user failed to navigated");
        }
    }
}
