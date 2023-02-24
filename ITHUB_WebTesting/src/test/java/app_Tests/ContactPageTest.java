package app_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import app_Pages.ContactPage;
import app_Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactPageTest {

	HomePage homePage;
	ContactPage cntPage;
	WebDriver driver;

	@Test
	public void homepageTest() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		homePage = new HomePage(driver);
		homePage.navigateToITHub();

		cntPage = homePage.navigateToContactPage();

		String expectedResult = "Contact us";
		cntPage.validateEmployerPageHeader(expectedResult);

	}
	
	@AfterMethod(alwaysRun=true)
	public void terminate() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
