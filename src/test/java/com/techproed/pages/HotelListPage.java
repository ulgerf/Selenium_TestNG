package com.techproed.pages;


 import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
    public class HotelListPage {
        public HotelListPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(id = "lkpGroups")
        public WebElement selectHotelType;

        @FindBy(xpath = "(//button[@class])[6]")
        public WebElement searchButton;

        @FindBy(id="lkpGroups")
        public WebElement hotelType;


    }
