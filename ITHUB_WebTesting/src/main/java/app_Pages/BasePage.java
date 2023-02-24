package app_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	public WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;

	}

	public void navigate(String url) {
		driver.get(url);
	}

	public void clickonElement(By by) {

		driver.findElement(by).click();
	}

	public void sendKeys(By by, String input) {

		driver.findElement(by).sendKeys(input);
	}

	public String getElementText(By by) {

		return driver.findElement(by).getText().trim();
	}

}
