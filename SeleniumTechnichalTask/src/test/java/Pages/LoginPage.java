package Pages;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(className="logout")
	WebElement SignoutBtn;
	
	@FindBy(xpath="//a[@title='Women']")
	WebElement woman;
	
	@FindBy(xpath="//a[@title='Blouses']")
	WebElement blouse;
	
	@FindBy(xpath="//a[@title='View']")
	WebElement view;
	
	@FindBy(xpath="//select[@id='group_1']")
	WebElement Size;
	
	@FindBy(id="color_8")
	WebElement Color;
	
	@FindBy(xpath="//button[@name='Submit']")
	WebElement SubmitBtn;
	
	public HomePage Logout() throws Exception {
		SignoutBtn.click();
		return new HomePage(driver);
	}
	
	public AddtocartPage SelectBlouseAndChangeDetails() throws Exception {
		Actions action = new Actions(driver);
		action.moveToElement(woman).build().perform();
		action.moveToElement(blouse).click().build().perform();
		Thread.sleep(30);
		action.moveToElement(view).click().build().perform();
		Select select = new Select(Size);
		select.selectByVisibleText("M");
		Color.click();
		SubmitBtn.click();
		return new AddtocartPage(driver);
	}
	
	
}
