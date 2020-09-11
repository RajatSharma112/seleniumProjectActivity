package lmsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class testCaseFour {
WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
            
        //Open the browser
        driver.get("https://alchemy.hguy.co/lms");
    }
    
    @Test
    public void testCase4() {
        //This test case will pass
    	String secondCourseTitle= driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3")).getText();
        System.out.println("Second Course title is: " + secondCourseTitle);
        Assert.assertEquals(secondCourseTitle, "Email Marketing Strategies");
        Reporter.log("Second Course Title is-" + secondCourseTitle);
    }
        @AfterTest
        public void afterMethod() {
            //Close the browser
            driver.close();
    }
}
