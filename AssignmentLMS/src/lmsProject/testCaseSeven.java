package lmsProject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Test
public class testCaseSeven {
	 WebDriver driver;
	    WebDriverWait wait;

	    @BeforeTest
	    public void beforeTest() {
	    	driver = new FirefoxDriver();
	    	wait = new WebDriverWait(driver, 10);
	    	
	    	//Open browser
	    	driver.get("https://alchemy.hguy.co/lms");
	    }

	    @Test
	    public void coursesCount() {
	    	WebElement allCoursesLink = driver.findElement(By.linkText("All Courses"));
	    	allCoursesLink.click();
	    	wait.until(ExpectedConditions.titleContains("All Courses"));
	    	List<WebElement> courses = driver.findElements(By.className("ld_course_grid"));
	    	Reporter.log("Number of Courses: " + courses.size());
	    	
	    	//Assertion
	    	Assert.assertEquals(courses.size(), 3);
	    }

	    @AfterTest
	    public void afterTest() {
	    	//Close browser
	    	driver.close();
	    }
	}