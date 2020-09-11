package lmsProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class testCaseOne {
WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
            
        //Open the browser
        driver.get("https://alchemy.hguy.co/lms");
    }
    
    @Test
    public void testCase1() {
        //This test case will pass
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "Alchemy LMS – An LMS Application");
        Reporter.log("The title of the page is"+ title);
    }
        @AfterTest
        public void afterMethod() {
            //Close the browser
            driver.close();
    }
}
