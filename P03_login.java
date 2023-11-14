package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Watchable;

public class P03_login {
    public WebElement email() {
        WebElement mail = Hooks.MyDriver.findElement(By.id("Email"));
        return mail;
    }

    public WebElement password() {
        WebElement pass = Hooks.MyDriver.findElement(By.name("Password"));
        return pass;
    }

    public WebElement button() {
        WebElement logbutt = Hooks.MyDriver.findElement(By.className("login-button"));
        return logbutt;
    }


}
