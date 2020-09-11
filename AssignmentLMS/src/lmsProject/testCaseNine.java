package lmsProject;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@Test
public class testCaseNine {
WebDriver driver;

    
    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
            
        //Open the browser
        driver.get("https://alchemy.hguy.co/lms");
    }
    
    public void testCase9() throws InterruptedException {
        //This test case will pass
    	WebElement allCoursesLink = driver.findElement(By.linkText("All Courses"));
    	allCoursesLink.click();
    	driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[1]/article/a/img")).click();
    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/div/div/div/div[1]/div[3]/div/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("root");
        driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("pa$$w0rd");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/div/div/div/div[3]/div[2]/div[1]/div[1]/a/div[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div/div[3]/a/div[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[4]/div[2]/form/input[4]")).click();
        Thread.sleep(10000);
        Reporter.log("One lesson is Marked as Complete");
    }
        @AfterTest
        public void afterMethod() {
            //Close the browser
            driver.close();
    }
}
