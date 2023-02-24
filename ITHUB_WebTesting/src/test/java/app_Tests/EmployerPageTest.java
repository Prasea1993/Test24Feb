package app_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import app_Pages.EmployerPage;
import app_Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EmployerPageTest {

	HomePage homePage;
	EmployerPage empPage;
	WebDriver driver;

	@Test
	public void homepageTest() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		homePage = new HomePage(driver);
		homePage.navigateToITHub();

		empPage = homePage.navigateToEmployerPage();

		String expectedResult = "Your Perfect Recruitment Partner\n" + "OUR CAPABILITIES";
		empPage.validateEmployerPageHeader(expectedResult);

	}
	
	@AfterMethod
	public void terminate() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
