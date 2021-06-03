package Pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtocartPage {
	
WebDriver driver;
	
	public AddtocartPage(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
  
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	WebElement ProceedBtn;
	
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=order&step=1']")
	WebElement ClickOnCheckout;
	
	@FindBy(xpath="//button[@name='processAddress']")
	WebElement processAddressBtn;
	
	@FindBy(xpath="//div[@class='checker']")
	WebElement checkerBtn;
	
	@FindBy(xpath="//span[.='Proceed to checkout']")
	WebElement processCarrierBtn;
	
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span")
	WebElement processBtn;
	
	@FindBy(xpath="//a[@class='bankwire']")
	WebElement bankwireBtn;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Submit;
	
	@FindBy(xpath="//a[@class='account']")
	WebElement AccountBtn;
	
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=history']")
	WebElement HistoryBtn;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[5]")
	WebElement product;
	
	public void AddtoCart() throws InterruptedException {
		ProceedBtn.click();
		Thread.sleep(30);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(processCarrierBtn)).click();
		 processAddressBtn.click();
		 checkerBtn.click();
		 js.executeScript("window.scrollBy(0,1000)");
			 wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(processBtn)).click();
		 bankwireBtn.click();
		 Submit.click();
		 AccountBtn.click();
		 HistoryBtn.click();
	}

}
