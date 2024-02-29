package pom;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Excel;

public class Homepage extends BasePage{
	public Homepage(WebDriver driver) {
		super(driver);
	}
	JavascriptExecutor js=(JavascriptExecutor) driver;
	@FindBy(xpath="//*[@placeholder='What do you want to learn?']")
	WebElement search;
	
	
	
	public void clicksearch() throws IOException{
		search.click();
		search.sendKeys(Excel.getCellData("sheet1", 0, 0));
		search.sendKeys(Keys.ENTER);
	}
	











}
