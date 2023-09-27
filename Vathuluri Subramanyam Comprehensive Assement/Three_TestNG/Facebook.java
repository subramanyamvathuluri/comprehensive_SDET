package Three_testng.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook {

	 WebDriver driver;

	  @BeforeClass
	  public void testSetup()
	  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SVATHULURI\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();

	  }

	  @BeforeMethod
	  public void openBrowser()
	  {
	  driver.get("https://www.facebook.com/");
	  System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
	  }

	  @Test
	  public void signUp() throws InterruptedException
	  {
		    driver.findElement(By.name("email")).sendKeys("77629085258");
			driver.findElement(By.name("pass")).sendKeys("Subbu");
			driver.findElement(By.name("login")).click();
	  }

	  @AfterMethod
	  public void postSignUp()
	  {
		    String current_url = driver.getCurrentUrl();
			System.out.println("current url="+current_url);
			String expected_url = driver.getTitle();
			System.out.println ("expected url="+expected_url);
		  

	  }

	  @AfterClass
	  public void afterClass()
	  {
	  driver.close();
	  }

	  }