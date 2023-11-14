package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.className;

public class P05_WishList {
    public static WebElement WishButt() {
        WebElement butt = Hooks.MyDriver.findElement(By.id("id=\"add-to-wishlist-button-18\""));
        return butt;
    }

    public WebElement Qty() {
        WebElement qty = Hooks.MyDriver.findElement(className("wishlist-qty"));
        return qty;
    }
}
