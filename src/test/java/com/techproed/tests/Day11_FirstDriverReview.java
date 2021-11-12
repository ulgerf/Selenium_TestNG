package com.techproed.tests;

import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day11_FirstDriverReview {

    @Test
    public void amazonTitle(){
        Driver.getDriver().get("https://www.amazon.com/");
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));
    }
    @Test
    public void firstConfigReaderTestClass(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        Assert.assertEquals(Driver.getDriver().getTitle(),ConfigReader.getProperty("app_title"));

    }
}
