package app_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
	
	
	private static String url="http://ittalenthub.co.uk/";
	private static By aboutUsLink=By.linkText("About Us");
	private static By employerLink=By.linkText("Employer");
	private static By contactLink=By.xpath("//a[text()='Contact']");
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	
	public void navigateToITHub() {
		
		navigate(url);
		driver.manage().window().maximize();
	}
	
	public void clickOnABoutUs() {
		
		clickonElement(aboutUsLink);
	}
	
   public EmployerPage navigateToEmployerPage() {
		
		clickonElement(employerLink);
		return new EmployerPage(driver);
	}
   
   public ContactPage navigateToContactPage() {
		
		clickonElement(contactLink);
		return new ContactPage(driver);
	}
	

}
