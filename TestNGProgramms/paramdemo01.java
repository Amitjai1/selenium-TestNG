package TestNGProgramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramdemo01 
{
	public WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void SelectBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_March2022\\Binary\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://kite.zerodha.com");
			String expecteTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
			String ActualTitle = driver.getTitle();
			Assert.assertEquals(ActualTitle, expecteTitle);
			WebElement KiteLogo = driver.findElement(By.xpath("//img[contains(@src,'kite-logo.svg')]"));
			Assert.assertTrue(KiteLogo.isDisplayed());
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_March2022\\Binary\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://www.facebook.com");
			String expTitle = "Facebook – log in or sign up";
			String ActuTitle = driver.getTitle();
			Assert.assertEquals(ActuTitle, ActuTitle);
		}
	}
}
