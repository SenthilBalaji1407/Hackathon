package pom;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.Excel;

public class Languagelearning extends BasePage {
	public Languagelearning(WebDriver driver) {
		super(driver);
	}
	JavascriptExecutor js=(JavascriptExecutor) driver;

	
	@FindBy(xpath="//*[@placeholder='What do you want to learn?']")
	WebElement search2;
	
	@FindBy(xpath="//div[@class='cds-checkboxAndRadio-labelText']//span[text()='Data Science']")
	WebElement languagescroll;
	
	@FindBy(xpath="(//span[text()='Show more'])[2]")
	WebElement clickshowmore;
	
	@FindBy(xpath="//div[@class='css-zweepb']")
	List<WebElement> Language;
	
	@FindBy(xpath="//div[@class='css-jyd7rb']/button")
	WebElement Close;
	
	@FindBy(xpath="//label[text()='Level']/following-sibling::div/div/label/div/span/span")
	List<WebElement> Level;
	
	
	public void clicksearch() throws IOException{
		search2.click();
		Actions a=new Actions(driver);
		a.moveToElement(search2).keyDown(Keys.CONTROL);
		a.sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		a.sendKeys(Keys.DELETE);
		search2.sendKeys(Excel.getCellData("sheet1", 1, 0));
		search2.sendKeys(Keys.ENTER);
	}

	public void scrolllan() {
		js.executeScript(("arguments[0].scrollIntoView();"), languagescroll);
	}
	
	public void clickshow()  {
		js.executeScript(("arguments[0].click();"),clickshowmore);
	}
	
	public void language() throws IOException {
		int count11=0;
		int row=1;
		for(WebElement lang:Language) {
			System.out.println(lang.getText());
			String data=lang.getText();
			Excel.write("Sheet1", row, 3, data);
			row++;
			count11++;
		}
			System.out.print("Total count = "+count11);
		}

	public void close() {
		js.executeScript("arguments[0].click()", Close);
	}

	public void printlevel() throws IOException {
		int fun=0;
		int row=1;
		for(WebElement l:Level) {
			System.out.println(l.getText());
				String data=l.getText();
				Excel.write("Sheet1", row, 4, data);
				row++;
				fun++;
				}
			System.out.println("Total count = "+fun);
		}
	
		
		

	}















