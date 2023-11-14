package StepDefs;

import Pages.Hooks;
import Pages.P01_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P01_HomePage locate = new P01_HomePage();

    @Given("user opens Home Page")
    public void user_opens_Home_Page() {
        Hooks.OpenBrowser();
    }

    @When("user clicks on facebook link")
    public void user_clicks_on_facebook_link() {
        locate.Facebook().click();
    }

    @Then("^The FaceBook Link is opened in new tab With Url (.*)$")
    public void The_FaceBook_Link_is_opened_in_new_tab_With_Url(String ExpectedUrl) throws InterruptedException {

        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.MyDriver.getWindowHandles());
        String ActualUrl = Hooks.MyDriver.switchTo().window(Tabs.get(1)).getCurrentUrl();
        SoftAssert assertion = new SoftAssert();
        assertion.assertEquals(ActualUrl, ExpectedUrl);
        assertion.assertAll();
        Hooks.MyDriver.close();
    }

    @When("user opens twitter link")
    public void user_opens_twitter_link() {
        locate.Twitter().click();
    }

    @Then("^The Twitter Link is opened in new tab With Url (.*)$")
    public void The_Twitter_Link_is_opened_in_new_tab_With_Url(String ExpectedUrl) throws InterruptedException {

        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.MyDriver.getWindowHandles());
        String ActualUrl = Hooks.MyDriver.switchTo().window(Tabs.get(1)).getCurrentUrl();
        SoftAssert assertion = new SoftAssert();
        assertion.assertEquals(ActualUrl, ExpectedUrl);
        assertion.assertAll();
        Hooks.MyDriver.close();
    }

    @When("user opens rss link")
    public void user_opens_rss_link() {
        locate.Rss().click();
    }

    @Then("^The Rss Link is opened in new window With Url (.*)$")
    public void The_Rss_Link_is_opened_in_window_tab_With_Url(String ExpectedUrl) {
        String ActualUrl = Hooks.MyDriver.getCurrentUrl();
        SoftAssert assertion = new SoftAssert();
        assertion.assertEquals(ActualUrl, ExpectedUrl);
        assertion.assertAll();
        Hooks.MyDriver.close();
    }

    @When("user opens youtube link")
    public void user_opens_youtube_link() {
        locate.Youtube().click();
    }

    @Then("^The Youtube Link is opened in new tab With Url (.*)$")
    public void The_Youtube_Link_is_opened_in_new_tab_With_Url(String ExpectedUrl) throws InterruptedException {

        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.MyDriver.getWindowHandles());
        String ActualUrl = Hooks.MyDriver.switchTo().window(Tabs.get(1)).getCurrentUrl();
        SoftAssert assertion = new SoftAssert();
        assertion.assertEquals(ActualUrl, ExpectedUrl);
        assertion.assertAll();
        Hooks.MyDriver.close();
    }


}
