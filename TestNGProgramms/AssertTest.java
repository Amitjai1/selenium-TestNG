package TestNGProgramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {
	public WebDriver driver;
  @Test
  public void chromeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_March2022\\Binary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com");
		String expecteTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		String ActualTitle = driver.getTitle();
		SoftAssert sassert = new SoftAssert();
		sassert.assertEquals(ActualTitle, expecteTitle);
		WebElement KiteLogo = driver.findElement(By.xpath("//img[contains(@src,'kite-logo.svg')]"));
		sassert.assertTrue(KiteLogo.isDisplayed());
		System.out.println(KiteLogo.isDisplayed());
		//it will pass all the method always give assertAll method(it will not give the Exception)
		sassert.assertAll();
  }
  @Test
  public void edgeTest()
  {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_March2022\\Binary\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		String expTitle = "Facebook – log in or sign up";
		String ActuTitle = driver.getTitle();
		Assert.assertEquals(ActuTitle, ActuTitle);
  }
}
