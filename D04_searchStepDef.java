package StepDefs;

import Pages.Hooks;
import Pages.P01_HomePage;
import Pages.P04_Assertion;
import com.sun.deploy.util.JVMParameters;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static com.sun.deploy.util.JVMParameters.*;

public class D04_searchStepDef {
    P01_HomePage search = new P01_HomePage();
    P04_Assertion searching = new P04_Assertion();

    @Given("user go to home page")
    public void user_go_to_home_page() {
        Hooks.OpenBrowser();
    }

    @When("^user search using product name (.*)$")
    public void user_search_using_product_name(String product_name) {
        search.Search().sendKeys(product_name);
    }

    @When("^user search a product with SKU (.*)$")
    public void user_search_a_product_with_SKU(String SKU) {
        search.Search().sendKeys(SKU);
    }

    @And("user click on the product in search result")
    public void user_click_on_the_product_in_search_result() {
        search.searchresult().click();
    }

    @And("user clicks on search button")
    public void user_clicks_on_search_button() {
        search.searchbutton().click();
    }

    @Then("^url search shows relevant results contains (.*)$")
    public void url_contains_search_shows_relevant_results(String product) {
        String ActualUrl = Hooks.MyDriver.getCurrentUrl();
        String ExpectedUrl = "https://demo.nopcommerce.com/search?q";
        SoftAssert assertion = new SoftAssert();
        assertion.assertEquals(ActualUrl, ExpectedUrl);
        for (int i = 0; i < searching.see_res().size(); i++) {
            boolean correctly = searching.see_res().get(i).getText().toLowerCase().contains(product);
            assertion.assertTrue(correctly);
            assertion.assertAll();
        }
    }


    @Then("^SKU in product page contains (.*) in search box$")
    public void SKU_in_product_page_contains_SKU_in_search_box() {
        boolean X = searching.SKU();
        SoftAssert assertion = new SoftAssert();
        assertion.assertTrue(X);
        assertion.assertAll();
    }


}
