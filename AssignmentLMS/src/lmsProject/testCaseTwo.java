package lmsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class testCaseTwo {
WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
            
        //Open the browser
        driver.get("https://alchemy.hguy.co/lms");
    }
    
    @Test
    public void testCase2() {
        //This test case will pass
    	String Header= driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[1]/div[2]/section/div[2]/div[2]/div[2]/div/div/div/div/div[1]/h1")).getText();
        System.out.println("Header is: " + Header);
        Assert.assertEquals(Header, "Learn from Industry Experts");
        Reporter.log("The header of the page is-" + Header);
    }
        @AfterTest
        public void afterMethod() {
            //Close the browser
            driver.close();
    }
}
