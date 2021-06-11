/**
 * purpose : To create setup to run before and after test cases
 * Author : Samiksha Shende
 * Date : 10/06/2021
 */

package com.bridgelabz.savaari.base;

import com.bridgelabz.savaari.utility.Email;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver webdriver;

    //method to launch browser
    @BeforeTest
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            URL url = new URL("https://blog.savaari.com/covid-travel-pass/");
            URLConnection connection = url.openConnection();
            connection.connect();
            System.out.println("Internet is connected");
            // launch application

            webdriver.get("https://blog.savaari.com/covid-travel-pass/");
            Thread.sleep(1000);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

        //method to close the session open by driver
        @AfterTest
        public void tearDown() {
            webdriver.close();
            Email.sendEmail();
        }

}
