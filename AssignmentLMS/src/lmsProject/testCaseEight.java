package lmsProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@Test
public class testCaseEight {
WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
            
        //Open the browser
        driver.get("https://alchemy.hguy.co/lms");
    }
    
    public void testCase8() {
        //This test case will pass
    	driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[4]/a")).click();
        String title1 = driver.getTitle();
        System.out.println("The navigated page Title is: " + title1);
        AssertJUnit.assertEquals(title1, "Contact – Alchemy LMS");
        driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_0\"]")).sendKeys("Rajat Sharma");
        driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_1\"]")).sendKeys("testdaaas@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_3\"]")).sendKeys("Testing Selenium");
        driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_2\"]")).sendKeys("We are testing the services. Please check.");
        driver.findElement(By.xpath("//*[@id=\"wpforms-submit-8\"]")).click();
        
       String AfterSubmission = driver.findElement(By.id("wpforms-confirmation-8")).getText();
       Reporter.log("After Submission message is" + AfterSubmission);      
    }
        @AfterTest
        public void afterMethod() {
            //Close the browser
            driver.close();
    }
}
