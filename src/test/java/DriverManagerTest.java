import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverManagerTest {
    @Test
    public void choreOpener(){
        WebDriverManager.chromedriver().setup();
        WebDriver chrome= new ChromeDriver();
        chrome.get("https://facebook.com");

    }
}
