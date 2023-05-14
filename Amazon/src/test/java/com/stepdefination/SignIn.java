package com.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import reusable.*;

public class SignIn {
WebDriver driver;
     private Filter fil;
    @Given("User navigate the home page")
        public void homePage(){

       BrowserInvo.launchApp();
    }
    @Given("User in Amazon page")
    public void homeePage(){
        BrowserInvo.launchApp();
        LogIn.logInPage();

    }


    @When("User enter the username and password in SignIn page")
    public void EnterTheUsername() {
        LogIn logInpag=new LogIn();
        driver=logInpag.logInPage();





    }


    @Then("To navigate product search page")
    public void ProductSearchPage() {
    }

    @When("User click the SignOut button")
    public void SignOutButton() {
        SingOut sign=new SingOut();
        driver= sign.signnOut();




    }

    @Then("To navigate SignIn page")
    public void toNavigateSignInPage() {
    }

    @Given("User search And finalize the product")
    public void finalizeTheProduct() {
        BrowserInvo.launchApp();
        LogIn.logInPage();

    }

    @When("User product to be add using add to cart click button")
    public void addToCartClickButton() {
        AddCart add=new AddCart();
        driver=add.addCart();



    }

    @Then("User product to be added")
    public void userProductToBeAdded() {
    }

    @Given("User search the product")
    public void userSearchTheProduct() {
        BrowserInvo.launchApp();
        LogIn.logInPage();


    }

    @When("User choose criteria in filter column using click and checkbox")
    public void filterColumn() {
        Sort sortt=new Sort();
        driver= Sort.sortOut();

    }

    @Then("Navigate the page based on their requirement")
    public void navigateThePageBasedOnTheirRequirement() {
    }

    @Given("User searchh the product")
    public void searchhTheProduct() {
        BrowserInvo.launchApp();
        LogIn.logInPage();


    }

    @When("user click sort button for their criteria")
    public void forTheirCriteria() throws InterruptedException {

        Filter filt=new Filter();
        filt.Pendr().Dep().FlashButton().Customer().DataStorage().OneStarClick().MacCheck();
    }

    @Then("Navigate sorting order based on criteria")
    public void basedOnCriteria() {

    }

    @Given("User in remove cart page of amazon application")
    public void removeCartPageOfAmazon() {


    }

    @When("User click the delete button of remove cart page")
    public void removeCartPage() {

    }

    @Then("User product to be removed")
    public void toBeRemoved() {


    }
}