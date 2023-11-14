package StepDefs;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_HomePage register = new P01_HomePage();
    P02_register Click = new P02_register();
    P04_Assertion compare = new P04_Assertion();

    @Given("user go to register page")
    public void user_go_to_register_page() {
        Hooks.OpenBrowser();
        Hooks.MyDriver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        register.registerlink().click();
    }

    @When("user select gender type")
    public void user_select_gender_type() {
        Click.gender().click();
    }

    @And("user enter first name and last name")
    public void user_enter_first_name_and_last_name() {
        Click.Name1().sendKeys("automation");
        Click.Name2().sendKeys("tester");
    }

    @And("user enter date of birth")
    public void user_enter_date_of_birth() {
        Select sel = new Select(Click.birth_Day());
        sel.selectByIndex(2);
        Select sel0 = new Select(Click.birth_Month());
        sel0.selectByIndex(4);
        Select sel1 = new Select(Click.birth_Year());
        sel1.selectByValue("1990");
    }

    @And("user enter email field")
    public void user_enter_email_field() {
        Click.Email().sendKeys("test@gone.com");
    }

    @And("user enter company name")
    public void user_enter_company_name() {
        Click.Company().sendKeys("Automation");
    }

    @And("user fills Password fields")
    public void user_fills_Password_fields() {
        Click.Password1().sendKeys("P@ssw0rd");
        Click.Password2().sendKeys("P@ssw0rd");
    }

    @And("user clicks on register button")
    public void user_clicks_on_register_button() {
        Click.Register().click();
    }

    @Then("success message is displayed")
    public void success_message_is_displayed() {
        SoftAssert Done = new SoftAssert();
        boolean Z = compare.Success_Mess().isDisplayed();
        Done.assertTrue(Z);
        String color = "rgba(76, 177, 124, 1)";
        compare.Color().getCssValue("green");
        Done.assertEquals(color, false);
        Done.assertAll();
    }


}
