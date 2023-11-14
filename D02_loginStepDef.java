package StepDefs;

import Pages.Hooks;
import Pages.P01_HomePage;
import Pages.P03_login;
import Pages.P04_Assertion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P01_HomePage log = new P01_HomePage();
    P03_login loc = new P03_login();
    P04_Assertion asser = new P04_Assertion();

    @Given("user go to login page")
    public void user_go_to_login_page() {
        Hooks.OpenBrowser();
        log.LoginLink().click();
    }

    @When("^user login with valid email (.*) and password (.*)$")
    public void user_login_with_valid_email_and_password(String email, String Password) {
        loc.email().sendKeys(email);
        loc.password().sendKeys(Password);
    }

    @And("user click on login button")
    public void user_click_on_login_button() {
        loc.button().click();
    }

    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {
        String ExpectedUrl = "https://demo.nopcommerce.com/";
        String ActualUrl = Hooks.MyDriver.getCurrentUrl();
        boolean Z = asser.successlog().isDisplayed();
        SoftAssert assertion = new SoftAssert();
        assertion.assertEquals(ActualUrl, ExpectedUrl);
        assertion.assertTrue(Z);
        assertion.assertAll();
    }

    @When("^user login with invalid email (.*) and invalid password (.*)$")
    public void user_login_with_invalid_email_and_invalid_password(String email, String password) {
        loc.email().sendKeys(email);
        loc.password().sendKeys(password);
    }

    @Then("user could not login to the system")
    public void user_could_not_login_to_the_system() {
        boolean X = asser.unsuccesslog().isDisplayed();
        SoftAssert Assert = new SoftAssert();
        Assert.assertTrue(X);
        String actualColour = "rgba(228, 67, 75, 1)";
        String expected = asser.unsuccesslog().getCssValue("Color");
        Assert.assertEquals(actualColour, expected);
        Assert.assertAll();
    }
}
