package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) throws Exception {  // throws Exception to run Thread.sleep
        // to start selenium script we need:
        // setup webdriver (browser driver) and create webdriver object
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // In Selenium, everything starts from WebDriver interface
        // ChromeDriver extends RemoteWebDriver --> implements WebDriver
        driver.get("http://google.com");// to open a website

        Thread.sleep(3000);// for demo, wait 3 seconds
        //method that return page title
        //you can also see it as tab name, in the browser
        String title = driver.getTitle(); // returns <title>SOme title </title> text

        String expectedTitle = "Google";// we provide it

        System.out.println("Title is..." + title);

        if (expectedTitle.equals(title)){
            System.out.println("TESTED PASSED");
        }else {
            System.out.println("TEST FAILED");
        }


        // MUST BE AT THE END
        driver.close();// to close browser
        //browser cannot close itself
    }
}
