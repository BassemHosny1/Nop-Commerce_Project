package Pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {
    public static ChromeDriver MyDriver;

    @Before
    public static void OpenBrowser() {
        MyDriver = new ChromeDriver();
        MyDriver.get("https://demo.nopcommerce.com/");
        MyDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
    }

    @After
    public static void CloseBrowser() {
        MyDriver.quit();
    }

}


