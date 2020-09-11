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
public class testCaseSix {
WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
            
        //Open the browser
        driver.get("https://alchemy.hguy.co/lms");
    }
    
    public void testCase6() throws InterruptedException {
        //This test case will pass
    	driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div/div[3]/div/nav/div/ul/li[5]/a")).click();
        String title1 = driver.getTitle();
        System.out.println("The navigated page Title is: " + title1);
        AssertJUnit.assertEquals(title1, "My Account – Alchemy LMS");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[2]/div[2]/div[2]/div[2]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("root");
        driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("pa$$w0rd");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
        String AfterLoginName = driver.findElement(By.xpath("/html/body/div[2]/div/ul[2]/li[2]/a/span")).getText();
       AssertJUnit.assertEquals("root", AfterLoginName);
       Reporter.log("User is logged in Successfully and his name is-" + AfterLoginName);
        
    }
        @AfterTest
        public void afterMethod() {
            //Close the browser
            driver.close();
    }
}
