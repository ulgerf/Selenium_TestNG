package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestAddressLoginPage {
    // this is page class
    // this will have only page objects main important methods

    //1. to create constructor
    //PageFactory.initElements initialize this page objects
    public TestAddressLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        //  Create page objects
        //1. Create constructor
        //PageFactory.initElements initialize this page objects

    //2. Create page objects
    //NOTE: we can locate using all 8 locators
    @FindBy(id="session_email")
    public WebElement email;

    @FindBy(xpath = "//input[@id='session_password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name ='commit']")
    public WebElement singInButton;

}
