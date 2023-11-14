package StepDefs;

import Pages.*;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class D05_hoverCategoriesStepDef {
    P01_HomePage hove = new P01_HomePage();
    P04_Hoover hover = new P04_Hoover();
    P04_Assertion asser = new P04_Assertion();


    @Given("user need to select random one of the three main categories")
    public void user_need_to_select_random_one_of_the_three_main_categories() {
        hove.Categories().click();
    }

    @When("user should hover on the selected category")
    public void user_should_hover_on_the_selected_category() {
        Actions action = new Actions(Hooks.MyDriver);
        action.moveToElement(hover.Hover()).perform();
    }

    @And("user need to select random one of the three sub categories")
    public void user_need_to_select_random_one_of_the_three_sub_categories() {
        hover.Hover().click();
    }

    @Then("the subcategory title is equal or contains the one user get it while selecting random subcategory")
    public void the_subcategory_title_is_equal_or_contains_the_one_user_get_it_while_selecting_random_subcategory() {
        String expected = String.valueOf(asser.Title().getText().contains("Desktops"));
        String actual = asser.Title().getText().toLowerCase().trim();
        SoftAssert asser = new SoftAssert();
        asser.assertEquals(actual , expected);
        asser.assertAll();
    }
}
