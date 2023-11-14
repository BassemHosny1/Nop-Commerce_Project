package StepDefs;

import Pages.Hooks;
import Pages.P01_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import javax.lang.model.element.VariableElement;

public class D03_currenciesStepDef {
    P01_HomePage Curren = new P01_HomePage();

    @Given("user Select Euro currency from the dropdown list")
    public void user_Select_Euro_currency_from_the_dropdown_list() {
        Select sel = new Select(Curren.Currencies());
        sel.selectByIndex(2);
    }

    @Then("Euro Currency is Shown on four products")
    public void Euro_Currency_is_Shown_on_four_products() {
        for (int i = 0; i <= 4; i++) {
            boolean euro = Curren.find_elements().get(i).getText().contains("€");
            SoftAssert assertion = new SoftAssert();
            assertion.assertTrue(euro);
            assertion.assertAll();
        }
    }

}
