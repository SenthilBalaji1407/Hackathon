package pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;
import utilities.Excel;

public class Formfilling extends BasePage {

	public Formfilling(WebDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}
JavascriptExecutor js=(JavascriptExecutor) driver;
@FindBy(xpath="//div[@class='css-6192kf']")
WebElement ScrollForm;

@FindBy(xpath="//input[@id='FirstName']")
WebElement FirstName;

@FindBy(xpath="//h2[text()='Get in touch with our sales team']")
WebElement ScrollFormdown;

@FindBy(id="LastName")
WebElement LastName;

@FindBy(id="Email")
WebElement Email;

@FindBy(id="Phone")
WebElement Phone;

@FindBy(id="Institution_Type__c")
WebElement Institution;

@FindBy(id="Company")
WebElement Company;

@FindBy(xpath="//h2[@class='cds-119 css-1cqrdzk cds-121']")
WebElement StudentScroll;

@FindBy(id="Title")
WebElement Title;

@FindBy(id="Department")
WebElement Department;

@FindBy(id="What_the_lead_asked_for_on_the_website__c")
WebElement Website;

@FindBy(id="Country")
WebElement Country;

@FindBy(id="State")
WebElement State;

@FindBy(id="Country")
WebElement ScrollSubmit;

@FindBy(xpath="//button[text()='Submit']")
WebElement Submit;

@FindBy(id="ValidMsgEmail")
WebElement Errormsg;


//public void scrollform(){
//	
//	js.executeScript("arguments[0].scrollIntoView", ScrollForm);
//	
//}

public void firstname() throws IOException, InterruptedException{
	FirstName.sendKeys(Excel.getCellData("Sheet1", 2, 0));
}

public void scrolldown() {
	js.executeScript("arguments[0].scrollIntoView();", ScrollFormdown);
}

public void lastname() throws IOException {
	LastName.sendKeys(Excel.getCellData("Sheet1", 3, 0));
}

public void email() throws IOException {
	Email.sendKeys(Excel.getCellData("Sheet1", 4, 0));
}

public void phone() throws IOException {
	Phone.sendKeys(Excel.getCellData("Sheet1", 5, 0));
}

public void institutiontype() {
	Select s=new Select(Institution);
	s.selectByIndex(1);
}

public void company() throws IOException {
	Company.sendKeys(Excel.getCellData("Sheet1", 6, 0));
}


public void student() {
	js.executeScript("arguments[0].scrollIntoView();",StudentScroll);
}

public void title() {
	Select s1=new Select(Title);
	s1.selectByValue("Student");
	Select s2=new Select(Department);
	s2.selectByValue("Other");
}

public void department() {
	Select s2=new Select(Department);
	s2.selectByValue("Other");
}

public void website() {
	Select s3=new Select(Website);
	s3.selectByValue("Learner Support");
}

public void country() {
	Select ss3=new Select(Country);
	ss3.selectByValue("India");
}

public void state() {
	Select ss4=new Select(State);
	ss4.selectByValue("Tamil Nadu");
}

public void scrollsubmit() {
	js.executeScript("arguments[0].scrollIntoView();", ScrollSubmit);
}

public void  submit() throws InterruptedException {
	js.executeScript("arguments[0].click();", Submit);
//	Thread.sleep(10000);
}


public void scrollup() throws InterruptedException {
	js.executeScript("arguments[0].scrollIntoView();", ScrollFormdown);
}
public void error() throws IOException {
	System.out.println(Errormsg.getText());
	String data=Errormsg.getText();
	Excel.write("Sheet1", 7, 1, data);
}
}
