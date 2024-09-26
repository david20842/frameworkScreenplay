import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestEdge {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "/usr/local/bin/msedgedriver");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}

