package app_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ContactPage extends BasePage {

	public ContactPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	private static By contactHeaer=By.xpath("//h2[@class='main-heading']");
	
	
	public void validateEmployerPageHeader(String expectedResult) {
		
		Assert.assertEquals(getElementText(contactHeaer), expectedResult);
		
	} 
	

}
