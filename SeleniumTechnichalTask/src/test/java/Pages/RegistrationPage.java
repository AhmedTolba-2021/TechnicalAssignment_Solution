package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	
	WebDriver driver;
	public static Properties prop;
	
	public RegistrationPage(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		prop = new Properties();
	    FileInputStream fis = new FileInputStream ("..\\SeleniumTechnichalTask\\src\\test\\java\\Config\\config.properties");
		 prop.load(fis);
		}
	
	
	@FindBy(id="customer_firstname")
	WebElement Fname;
	
	@FindBy(id="customer_lastname")
	WebElement Lname;
	
	@FindBy(name="passwd")
	WebElement Pass;
	
	
	@FindBy(name="address1")
	WebElement Address;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(id="id_state")
	WebElement State;
	
	@FindBy(id="postcode")
	WebElement PostCode;
	
	@FindBy(id="phone_mobile")
	WebElement Phone;
	
	@FindBy(id="submitAccount")
	WebElement RegBtn;
	
	public LoginPage FillingForm() throws Exception {
		Fname.sendKeys(prop.getProperty("FirstName"));
		Lname.sendKeys(prop.getProperty("LastName"));
		Pass.sendKeys(prop.getProperty("Password"));
		Address.sendKeys(prop.getProperty("Address"));
		City.sendKeys(prop.getProperty("City"));
		Select select = new Select(State);
		select.selectByVisibleText("Iowa");
		PostCode.sendKeys(prop.getProperty("ZipCode"));
		Phone.sendKeys(prop.getProperty("Phone"));
		RegBtn.click();
		return new LoginPage(driver);
	}
	}

