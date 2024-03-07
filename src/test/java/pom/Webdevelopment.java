package pom;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Excel;

public class Webdevelopment  extends BasePage{
	
	public Webdevelopment(WebDriver driver) {
		super(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	JavascriptExecutor js=(JavascriptExecutor) driver;

	@FindBy(xpath="//div[@class='cds-checkboxAndRadio-labelText']//span[text()='Data Science']")
	WebElement scroll;
	
	@FindBy(xpath="(//div[@class='cds-checkboxAndRadio-labelText']//span[text()='English'])[1]")
	WebElement English;

	@FindBy(xpath="//span[@class='cds-checkboxAndRadio-labelContent css-tvqrra']//span[text()='Graduate Certificates']")
	WebElement Scroll1;
	
	@FindBy(xpath="//span[text()='Beginner']")
	WebElement Level;
	
	@FindBy(xpath="(//h3[@class='cds-CommonCard-title css-6ecy9b'])[1]")
	WebElement course1;
	
	@FindBy(xpath="//h1[@class='cds-119 cds-Typography-base css-1xy8ceb cds-121']")
	WebElement title1;
	
	@FindBy(xpath="(//div[@class='css-lt1dx1']//div[@class='css-guxf6x'])[2]")
	WebElement rating1;
	
	@FindBy(xpath="(//div//div[@class='cds-119 cds-Typography-base css-h1jogs cds-121'])[8]")
	WebElement duration1;
	
	@FindBy(xpath="(//h3[@class='cds-CommonCard-title css-6ecy9b'])[2]")
	WebElement course2;
	 
	@FindBy(xpath="//h1[@class='cds-119 cds-Typography-base css-1xy8ceb cds-121']")
	WebElement title2;
	
	@FindBy(xpath="(//div[@class='css-lt1dx1']//div[@class='css-guxf6x'])[2]")
	WebElement rating2;
	
	@FindBy(xpath="(//div//div[@class='cds-119 cds-Typography-base css-h1jogs cds-121'])[8]")
	WebElement duration2;
	 
	 
	
	

	public void scroll() {
		js.executeScript(("arguments[0].scrollIntoView();"),scroll);
	}

	public void clickEnglish() {
		English.click();
	}
	
	public void scroll1() {
		js.executeScript(("arguments[0].scrollIntoView();"), Scroll1);
	}
	
	public void clickLevel() {
		js.executeScript(("arguments[0].click();"), Level);
	}

	 
	public void clickCourse1() {
		js.executeScript(("arguments[0].click();"), course1);
	}
	public void clickCourse2() {
		js.executeScript(("arguments[0].click();"), course2);
	}
	public void getCourse1() throws IOException {
	String parentWindow = driver.getWindowHandle();
	Set<String> handles =  driver.getWindowHandles();
	   for(String windowHandle  : handles)
	       {
//		   int row=0;
	       if(!windowHandle.equals(parentWindow))
	          {
	          driver.switchTo().window(windowHandle);

	          System.out.println(title1.getText());
	          System.out.println(rating1.getText());
	          System.out.println(duration1.getText());
	          Excel.write("sheet1", 1, 1, title1.getText());
	          Excel.write("sheet1", 3, 1, rating1.getText());
	          Excel.write("sheet1", 5, 1, duration1.getText());

	         driver.close(); //closing child window
	         driver.switchTo().window(parentWindow); //cntrl to parent window
	          }
	 
		}
	}
	public void getCourse2() throws IOException {
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);

		          System.out.println(title2.getText());
		          System.out.println(rating2.getText());
		          System.out.println(duration2.getText());

		          Excel.write("sheet1", 1, 2, title2.getText());
		          Excel.write("sheet1", 3, 2, rating2.getText());
		          Excel.write("sheet1", 5, 2, duration2.getText());

		         driver.close(); //closing child window
		         driver.switchTo().window(parentWindow); //cntrl to parent window
		          }
		 
			}
		}
	
	 

}
