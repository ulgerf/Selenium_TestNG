package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DefaultPage {

    public DefaultPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addUserButton;

    @FindBy(xpath = "//span[.='Hotel Management']")
    public WebElement hotelManagementTab;

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRoomsTab;

   // FindBy(By.ByLinkText= "Hotel List")
        public WebElement hotelList;

    @FindBy(xpath = "(//span)[contains(@class,'username')]")
    public WebElement userID;


    @FindBy(id = "lkpGroups")
    public WebElement selectHotelType;

    @FindBy(id="itemsExportTypes")
    public WebElement Exceltab;

    @FindBy(id="lkpRoles")
    public WebElement selectHotelTyp;




}







