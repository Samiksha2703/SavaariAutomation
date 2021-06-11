/**
 * purpose : To perform different functions
 * Author : Samiksha Shende
 * Date : 10/06/2021
 */

package com.bridgelabz.savaari.utility;

import com.bridgelabz.savaari.base.Base;
import com.relevantcodes.extentreports.ExtentReports;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Utility extends Base {

    public static void uploadImage(String path) throws AWTException {
        StringSelection str = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        Robot robot = new Robot();
        robot.delay(5000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(5000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(5000);
    }

    //Method to take a screenshot
    public static String screenshot(String fileName) throws IOException {
        File file = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\kalam\\IdeaProjects\\BookswagonAutomationProgram\\src\\main\\resources\\Screenshot/"+fileName+System.currentTimeMillis()+".jpg");
        String filePath = dest.getAbsolutePath();
        FileUtils.copyFile(file, dest);
        System.out.println("Screenshot Taken for "+fileName);
        return filePath;
    }
}
