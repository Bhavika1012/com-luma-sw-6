package com.luma.steps;

import com.luma.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MensTest {
    @When("^I mouse hover on Mens menu$")
    public void iMouseHoverOnMensMenu() {
    }

    @And("^I mouse hover on Bottoms menu$")
    public void iMouseHoverOnBottomsMenu() {
        new HomePage().mouseHoverToBottomMenu();
    }

    @And("^I click on Pants menu$")
    public void iClickOnPantsMenu() {
    }

    @Then("^I mouse hover on product name Cronus Yoga Pants and click on size (\\d+)$")
    public void iMouseHoverOnProductNameCronusYogaPantsAndClickOnSize(int arg0) {
    }

    @And("^I mouse hover on Cronus Yoga Pant and click on colour Black$")
    public void iMouseHoverOnCronusYogaPantAndClickOnColourBlack() {
    }

    @And("^I mouse hover on Cronus Yoga Pant and click on Add To Cart Button$")
    public void iMouseHoverOnCronusYogaPantAndClickOnAddToCartButton() {
    }

    @Then("^I should see message You added Cronus Yoga Pant to your shopping cart\\.$")
    public void iShouldSeeMessageYouAddedCronusYogaPantToYourShoppingCart() {
    }

    @Then("^I should see text Shopping cart$")
    public void iShouldSeeTextShoppingCart() {
    }

    @And("^I should see the product name Cronus Yoga Pant$")
    public void iShouldSeeTheProductNameCronusYogaPant() {
    }

    @And("^I should see product size is (\\d+)$")
    public void iShouldSeeProductSizeIs(int arg0) {
    }

    @And("^I should see product colour Black$")
    public void iShouldSeeProductColourBlack() {
    }
}
