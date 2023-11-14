package StepDefs;

import Pages.Hooks;
import Pages.P01_HomePage;
import Pages.P04_Assertion;
import Pages.P05_WishList;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {
    P01_HomePage selprod = new P01_HomePage();
    P05_WishList Button = new P05_WishList();
    P04_Assertion asser = new P04_Assertion();

    @Given("User Open Browser And Go To HomePage")
    public void User_Open_Browser_And_Go_To_HomePage() {
        Hooks.OpenBrowser();
    }

    @When("User Clicks On HTC One M8 Android Product")
    public void User_Clicks_On_HTC_One_M8_Android_Product() {
        selprod.Product().click();
    }

    @And("User Clicks On Wishlist Button")
    public void User_Clicks_On_Wishlist_Button() {
        P05_WishList.WishButt().click();
    }

    @Then("Success Message With Green Background Color Is Displayed")
    public void Success_Message_With_Green_Background_Color_Is_Displayed() {
        boolean Successmessage = asser.Message().isDisplayed();
        SoftAssert assertion = new SoftAssert();
        assertion.assertTrue(Successmessage);
        String ExpectedColor = "rgba(75, 176, 122, 1)";
        String ActualColor = asser.Colour().getCssValue("green");
        assertion.assertEquals(ActualColor, ExpectedColor);
    }

    @When("User Waits UnTill Success Message becomes invisible")
    public void User_Waits_UnTill_Success_Message_becomes_invisible() {
        WebDriverWait wait = new WebDriverWait(Hooks.MyDriver, Duration.ofMillis(5000));
        wait.until(ExpectedConditions.invisibilityOf(asser.Message()));
    }

    @Then("User should get Qty value and verify it is bigger than zero")
    public void User_should_get_Qty_value_and_verify_it_is_bigger_than_zero() {
        int QTY = Integer.parseInt(Button.Qty().getAttribute("value"));
        boolean QtyNotZero = QTY > 0;
        SoftAssert assertion = new SoftAssert();
        assertion.assertTrue(QtyNotZero);
        assertion.assertAll();
    }
}
