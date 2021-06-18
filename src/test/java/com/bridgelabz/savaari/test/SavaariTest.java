/**
 * purpose : To create test cases for different feature of Savaari
 * Author : Samiksha Shende
 * Date : 10/06/2021
 */

package com.bridgelabz.savaari.test;

import com.bridgelabz.savaari.base.Base;
import com.bridgelabz.savaari.pages.Home;
import com.bridgelabz.savaari.utility.TestNgListener;
import com.bridgelabz.savaari.utility.Utility;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

@Listeners(TestNgListener.class)
public class SavaariTest extends Base {
    Home home;

    @Test
    public void fillFormForETicket() throws IOException {
        home = new Home(webdriver);
        Boolean checkElement = null;
        try {
            checkElement = home.fillForm();
            test.log(LogStatus.PASS, test.addScreenCapture(Utility.screenshot("Form Fill SuccessFully")));
        } catch (AWTException e) {
            e.printStackTrace();
            test.log(LogStatus.FAIL, test.addScreenCapture(Utility.screenshot("loginPage")));
        }
        Assert.assertTrue(checkElement);
    }
}
