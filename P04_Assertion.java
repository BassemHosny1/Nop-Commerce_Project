package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.charset.Charset;
import java.util.List;

public class P04_Assertion {
    public WebElement Success_Mess() {
        WebElement SucMes = Hooks.MyDriver.findElement(By.className("result"));
        return SucMes;
    }

    public WebElement Color() {
        WebElement color = Hooks.MyDriver.findElement(By.className("result"));
        return color;
    }

    public WebElement successlog() {
        WebElement successlogin = Hooks.MyDriver.findElement(By.className("login-button"));
        return successlogin;
    }

    public WebElement unsuccesslog() {
        WebElement unsuccesslogin = Hooks.MyDriver.findElement(By.className("message-error"));
        return unsuccesslogin;
    }

    public List<WebElement> see_res() {
        List<WebElement> result = Hooks.MyDriver.findElements(By.className("search-results"));
        return result;
    }

    public boolean SKU() {
        boolean sku = Hooks.MyDriver.findElements(By.className("sku")).contains("SKU");
        return sku;
    }

    public WebElement Title() {
        WebElement title = Hooks.MyDriver.findElement(By.linkText("Desktops"));
        return title;
    }

    public WebElement Message() {
        WebElement sucMes = Hooks.MyDriver.findElement(By.cssSelector("p[class=\"content\"]"));
        return sucMes;
    }

    public WebElement Colour() {
        WebElement colour = Hooks.MyDriver.findElement(By.cssSelector("p[class=\"content\"]"));
        return colour;
    }
}
