package com.marine.steps;

import com.marine.core.Step;
import com.marine.pages.LoginPage;
import com.marine.constants.UrlConstant;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class LoginStep extends Step {

    LoginPage loginPage = new LoginPage();

    @Given("browser is opening login page")
    public void browserIsOpeningLoginPage() {
        driver.manage().window().maximize();
        driver.get(UrlConstant.LOGIN_URL);
    }

    @And("username {} and password {}")
    public void usernameAndPassword(String arg0, String arg1) {
        loginPage.input(arg0, arg1);
    }

    @When("sign in button clicked")
    public void signInButtonClicked() {
        loginPage.clickButtonLogin();
    }

    @Then("redirected to homepage")
    public void redirectedToHomepage() {
        assertTrue(waitUntil(() -> loginPage.isDisplayedHomepage()));
    }

    @Given("user state logged in with {} and {}")
    public void userStateLoggedInWithAnd(String username, String password) {
        browserIsOpeningLoginPage();
        usernameAndPassword(username, password);
        signInButtonClicked();
        redirectedToHomepage();
    }
}
