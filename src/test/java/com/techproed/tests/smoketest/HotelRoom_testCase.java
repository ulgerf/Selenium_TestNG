package com.techproed.tests.smoketest;

import com.techproed.pages.DefaultPage;
import com.techproed.pages.HotelRoomsPage;
import com.techproed.pages.LoginPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HotelRoom_testCase {

       HotelRoomsPage hotelRoomsPage;
         DefaultPage defaultPage;
         LoginPage loginPage;
    @BeforeMethod
    public void setUp(){

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigReader.getProperty("app_url_login"));
        // get username and password from ExcelData
        loginPage= new LoginPage();
        loginPage.username.sendKeys(ConfigReader.getProperty("manager_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("manager_password"));
        loginPage.loginButton.click();
        defaultPage=new DefaultPage();
        Assert.assertTrue(defaultPage.addUserButton.isDisplayed());
    }
    @Test
    public void Hotel1(){
        hotelRoomsPage =new HotelRoomsPage();

        defaultPage.hotelRoomsTab.click();
        Select select = new Select(defaultPage.selectHotelTyp);
        select.selectByIndex(1);




    }
}
