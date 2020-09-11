package lmsProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class testCaseFive {
WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
            
        //Open the browser
        driver.get("https://alchemy.hguy.co/lms");
    }
    
    @Test
	public void testCase5() {
        //This test case will pass
    	driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div/div[3]/div/nav/div/ul/li[5]/a")).click();
        String title1 = driver.getTitle();
        System.out.println("The navigated page Title is: " + title1);
        AssertJUnit.assertEquals(title1, "My Account – Alchemy LMS");
        Reporter.log("The navigated page title is- " + title1);
    }
        @AfterTest
        public void afterMethod() {
            //Close the browser
            driver.close();
    }
}
