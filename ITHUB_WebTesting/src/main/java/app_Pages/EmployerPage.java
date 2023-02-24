package app_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EmployerPage extends BasePage {

	public EmployerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	private static By employerHeader=By.xpath("//h2[@class='main-heading']");
	
	
	public void validateEmployerPageHeader(String expectedResult) {
		
		Assert.assertEquals(getElementText(employerHeader), expectedResult);
		
	} 
	

}
