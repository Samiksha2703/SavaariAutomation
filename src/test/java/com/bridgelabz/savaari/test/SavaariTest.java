/**
 * purpose : To create test cases for different feature of Savaari
 * Author : Samiksha Shende
 * Date : 10/06/2021
 */

package com.bridgelabz.savaari.test;

import com.bridgelabz.savaari.base.Base;
import com.bridgelabz.savaari.pages.Home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class SavaariTest extends Base {
    Home home;

    @Test
    public void fillFormForETicket() throws AWTException {
        home = new Home(webdriver);
        home.fillForm();
        WebElement checkPortal = webdriver.findElement(By.xpath("//span[text()='PUNE POLICE -']"));
        Boolean check = checkPortal.isDisplayed();
        Assert.assertTrue(check);
    }
}
