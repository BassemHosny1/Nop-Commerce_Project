package StepDefs;

import Pages.Hooks;
import Pages.P01_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class D06_homeSlidersStepDef {
    P01_HomePage Slider = new P01_HomePage();

    @Given("Click on the first slider in the home page")
    public void Click_on_the_first_slider_in_the_home_page() {
        WebDriverWait wait = new WebDriverWait(Hooks.MyDriver, Duration.ofMillis(5000));
        wait.until(attributeContains(Slider.First_Slider(), "display", "none"));
        Slider.First_Slider().click();
    }

    @Then("The url should be changed to new url containing the first slider")
    public void The_url_should_be_changed_to_new_url_containing_the_first_slider() {
        String ActualURL = Hooks.MyDriver.getCurrentUrl();
        String ExpectedURL = "https://demo.nopcommerce.com/samsung-galaxy-s22-ultra";
        SoftAssert slide1 = new SoftAssert();
        slide1.assertEquals(ActualURL, ExpectedURL);
        slide1.assertAll();
    }

    @Given("Click on the second slider in the home page")
    public void Click_on_the_second_slider_in_the_home_page() {
        WebDriverWait wait = new WebDriverWait(Hooks.MyDriver, Duration.ofMillis(3000));
        wait.until(attributeContains(Slider.Second_Slider(), "display", "none"));
        Slider.Second_Slider().click();
    }

    @Then("The url should be changed to new url containing the second slider")
    public void The_url_should_be_changed_to_new_url_containing_the_second_slider() {
        String ActualURL = Hooks.MyDriver.getCurrentUrl();
        String ExpectedURL = "https://demo.nopcommerce.com/iphone-14-pro";
        SoftAssert slide1 = new SoftAssert();
        slide1.assertEquals(ActualURL, ExpectedURL);
        slide1.assertAll();
    }

}
