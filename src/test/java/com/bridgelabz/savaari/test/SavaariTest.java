/**
 * purpose : To create test cases for different feature of Savaari
 * Author : Samiksha Shende
 * Date : 10/06/2021
 */

package com.bridgelabz.savaari.test;

import com.bridgelabz.savaari.base.Base;
import com.bridgelabz.savaari.pages.Home;
import com.bridgelabz.savaari.utility.Utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class SavaariTest extends Base {
    Home home;
    static ExtentTest test;
    static ExtentReports report;

    //method to run before class to generate extent report
    @BeforeClass
    public static void startTest() {
        report = new ExtentReports("C:\\Users\\kalam\\IdeaProjects\\SavaariAutomation\\src\\main\\resources\\ExtentReport\\" + "ExtentReportResults.html");
        test = report.startTest("Bookswagon Extent Report");
    }

    @Test
    public void fillFormForETicket() throws AWTException, IOException {
        home = new Home(webdriver);
        try {
            home.fillForm();
            test.log(LogStatus.PASS, test.addScreenCapture(Utility.screenshot("Form Fill SuccessFully")));
        } catch (AWTException e) {
            e.printStackTrace();
            test.log(LogStatus.FAIL, test.addScreenCapture(Utility.screenshot("loginPage")));
        }
    }

    //method to run after class to generate extent report
    @AfterClass
    public static void endTest() {
        report.endTest(test);
        report.flush();
    }

}
