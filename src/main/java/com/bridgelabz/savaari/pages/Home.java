/**
 * purpose : To write code for different feature of Savaari
 * Author : Samiksha Shende
 * Date : 08/06/2021
 */

package com.bridgelabz.savaari.pages;

import com.bridgelabz.savaari.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class Home {

    @FindBy(xpath = "/html/body/div[2]/div/div/main/article/div/table[1]/tbody/tr[7]/td[2]/a/strong")
    WebElement linkForMaharashtra;

    @FindBy(xpath = "//a[text()='Pune police portal.']")
    WebElement punePolicePortal;

    @FindBy(xpath = "//select[@id='CategoryReason']")
    WebElement selectDepartmentButton;

    @FindBy(xpath = "//option[@value='Other']")
    WebElement selectDepartment;

    @FindBy(xpath = "//input[@id='AirPort_PNR']")
    WebElement departmentName;

    @FindBy(xpath = "//input[@id='FullName']")
    WebElement fullName;

    @FindBy(xpath = "//input[@id='Hospital_Name']")
    WebElement officeIDNO;

    @FindBy(id = "ImageFile")
    WebElement imageFile;

    @FindBy(xpath = "//input[@id='Bonafide']")
    WebElement bonafide;

    @FindBy(xpath = "/html/body/div[2]/form/div/div/div[6]/div/input")
    WebElement officeId;

    @FindBy(xpath = "//select[@id='Sex']")
    WebElement selectSex;

    @FindBy(xpath = "//option[@value='F']")
    WebElement gender;

    @FindBy(xpath = "//input[@id='DOB']")
    WebElement calender;

    @FindBy(xpath = "//input[@id='MobileNo']")
    WebElement mobileNumber;

    @FindBy(xpath = "//input[@id='AirPort_FlightNo']")
    WebElement aadharCardNo;

    @FindBy(xpath = "//input[@id='FromDateTime']")
    WebElement fromDate;

    @FindBy(xpath = "//input[@id='ToDateTime']")
    WebElement toDate;

    @FindBy(xpath = "//select[@id='Other_FromLocation']")
    WebElement selectFromLocation;

    @FindBy(xpath = "//option[@value='Shivajinagar/SVJR']")
    WebElement fromLocation;

    @FindBy(xpath = "//select[@id='Other_ToLocation']")
    WebElement selectToLocation;

    @FindBy(xpath = "//option[@value='Pune/PA']")
    WebElement toLocation;

    @FindBy(xpath = "//textarea[@id='Hospital_Aliment']")
    WebElement extraInformation;

    @FindBy(xpath = "//input[@id='ResidenceCertificate']")
    WebElement residenceCertificate;

    @FindBy(xpath = "//input[@id='Hospital_SufferingOrAssist']")
    WebElement confirmationCheckbox;

    public Home(WebDriver driver) throws AWTException {
        PageFactory.initElements(driver, this);
    }

    public void fillForm() throws AWTException {
        linkForMaharashtra.click();
        punePolicePortal.click();
        selectDepartmentButton.click();
        selectDepartment.click();
        departmentName.sendKeys("ICICI Bank");
        fullName.sendKeys("Samiksha Shende");
        officeId.sendKeys("896547");
        officeId.sendKeys(Keys.TAB, Keys.ENTER);
        Utility.uploadImage("C:\\Users\\kalam\\Screenshot\\amazon_Search.jpg");
        officeId.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
        Utility.uploadImage("C:\\Users\\kalam\\Screenshot\\amazon_Search.jpg");
        officeId.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);
        Utility.uploadImage("C:\\Users\\kalam\\Screenshot\\amazon_Search.jpg");
        selectSex.click();
        selectSex.sendKeys(Keys.SPACE, Keys.DOWN, Keys.DOWN, Keys.ENTER);
        calender.sendKeys(Keys.SPACE, Keys.ENTER);
        mobileNumber.sendKeys("7896549857");
        aadharCardNo.sendKeys("SS789654");
        fromDate.click();
        toDate.click();
        selectFromLocation.click();
        selectFromLocation.sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
        selectToLocation.click();
        toLocation.click();
        selectToLocation.sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
        extraInformation.sendKeys("I am traveling for office meeting");
        extraInformation.sendKeys(Keys.TAB, Keys.ENTER);
        Utility.uploadImage("C:\\Users\\kalam\\Screenshot\\amazon_Search.jpg");
        if (!confirmationCheckbox.isSelected()) {
            confirmationCheckbox.click();
        }
    }
}
