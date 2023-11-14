package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class P04_Hoover {
    public WebElement Hover() {
        WebElement hover = Hooks.MyDriver.findElement(By.cssSelector("img[alt=\"Picture for category Desktops\"]"));
        return hover;
    }
}
