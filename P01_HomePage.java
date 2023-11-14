package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P01_HomePage {
    public WebElement registerlink() {
        WebElement register = Hooks.MyDriver.findElement(By.className("ico-register"));
        return register;

    }

    public WebElement LoginLink() {
        WebElement login = Hooks.MyDriver.findElement(By.className("ico-login"));
        return login;
    }

    public WebElement Currencies() {
        WebElement Curren = Hooks.MyDriver.findElement(By.id("customerCurrency"));
        return Curren;
    }

    public List<WebElement> find_elements() {
        List<WebElement> Fe = Hooks.MyDriver.findElements(By.className("price"));
        return Fe;
    }

    public WebElement Search() {
        WebElement search = Hooks.MyDriver.findElement(By.name("q"));
        return search;
    }

    public WebElement searchresult() {
        WebElement results = Hooks.MyDriver.findElement(By.cssSelector("div[class=\"product-item\"] a"));
        return results;
    }

    public WebElement searchbutton() {
        WebElement Sbutton = Hooks.MyDriver.findElement(By.className("search-box-button"));
        return Sbutton;
    }

    public WebElement Categories() {
        WebElement categories = Hooks.MyDriver.findElement(By.linkText("Computers"));
        return categories;
    }

    public WebElement First_Slider() {
        WebElement firstslider = Hooks.MyDriver.findElements(By.cssSelector("a[class=\"nivo-imageLink\"]")).get(0);
        return firstslider;
    }

    public WebElement Second_Slider() {
        WebElement secondslide = Hooks.MyDriver.findElements(By.cssSelector("a[class=\"nivo-imageLink\"]")).get(1);
        return secondslide;
    }

    public WebElement Facebook() {
        WebElement face = Hooks.MyDriver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
        return face;
    }

    public WebElement Twitter() {
        WebElement twitter = Hooks.MyDriver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
        return twitter;
    }

    public WebElement Rss() {
        WebElement rss = Hooks.MyDriver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
        return rss;
    }

    public WebElement Youtube() {
        WebElement youtube = Hooks.MyDriver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
        return youtube;
    }

    public WebElement Product() {
        WebElement product = Hooks.MyDriver.findElement(By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]"));
        return product;
    }


}

