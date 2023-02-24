package app_Tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import app_Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTest {

	HomePage homePage;
	private static By allLinks = By.xpath("//nav[@id='site-navigation']//ul[@class='menu']/li/a");
	WebDriver driver;

	@Test
	public void homepageTest() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		homePage = new HomePage(driver);

		homePage.navigateToITHub();

		List<WebElement> elements = driver.findElements(allLinks);

		ArrayList<String> expected = new ArrayList<String>();
		expected.add("About Us");
		expected.add("Services");
		expected.add("Career Advice");
		expected.add("Jobs");
		expected.add("IT Training");
		expected.add("Short Courses");
		expected.add("Events");
		expected.add("Media");
		expected.add("Contact Us");

		ArrayList<String> actual = new ArrayList<String>();

		for (WebElement element : elements) {

			actual.add(element.getText().trim());
		}

		if (expected.equals(actual)) {
			System.out.println("Passed");
		}

		else {
			System.out.println("Failed");
		}

	}
	
	@AfterMethod
	public void terminate() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
