package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_register {
    public WebElement gender() {
        WebElement G = Hooks.MyDriver.findElement(By.id("gender-male"));
        return G;
    }

    public WebElement Name1() {
        WebElement N1 = Hooks.MyDriver.findElement(By.name("FirstName"));
        return N1;
    }

    public WebElement Name2() {
        WebElement N2 = Hooks.MyDriver.findElement(By.name("LastName"));
        return N2;
    }

    public WebElement birth_Day() {
        WebElement day = Hooks.MyDriver.findElement(By.name("DateOfBirthDay"));
        return day;
    }

    public WebElement birth_Month() {
        WebElement month = Hooks.MyDriver.findElement(By.name("DateOfBirthMonth"));
        return month;
    }

    public WebElement birth_Year() {
        WebElement year = Hooks.MyDriver.findElement(By.name("DateOfBirthYear"));
        return year;
    }

    public WebElement Email() {
        WebElement mail = Hooks.MyDriver.findElement(By.name("Email"));
        return mail;
    }

    public WebElement Company() {
        WebElement Comp = Hooks.MyDriver.findElement(By.id("Company"));
        return Comp;
    }

    public WebElement Password1() {
        WebElement pass1 = Hooks.MyDriver.findElement(By.name("Password"));
        return pass1;
    }

    public WebElement Password2() {
        WebElement pass2 = Hooks.MyDriver.findElement(By.id("ConfirmPassword"));
        return pass2;
    }

    public WebElement Register() {
        WebElement Reg = Hooks.MyDriver.findElement(By.name("register-button"));
        return Reg;
    }

}




