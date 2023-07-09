package com.marine.pages;

import com.marine.core.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class LoginPage extends Page {

    By tx_username = By.id("Username");
    By tx_password = By.id("Password");
    By btn_forgot = By.linkText("Forgot Password?");
    By btn_login = By.xpath("//button[@type='submit']");

    By view_homepage = By.xpath("//h1[text()='Shipment Request']");

    public void input(String username, String password) {
        driver.findElement(tx_username).sendKeys(username);
        driver.findElement(tx_password).sendKeys(password);
    }

    public void clickForgetPassword() {
        driver.findElement(btn_forgot).click();
    }
    public void clickButtonLogin() {
        driver.findElement(btn_login).click();
    }

    public boolean isDisplayedHomepage() {
        try {
            return driver.findElement(view_homepage).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }



}
