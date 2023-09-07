package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	//declaration part---------
	
	//address of selenium training
	@FindBy(xpath = "(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumTrainingField;
	
	//address of my cart
	@FindBy(id = "mycart")
	private WebElement myCartField;
	
	//address of facebook icon
	@FindBy(xpath = "(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookIcon;
	
	//initialization part---------
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization part-----
	public WebElement getSeleniumTrainingField() {
		return seleniumTrainingField;
	}

	public WebElement getMyCartField() {
		return myCartField;
	}

	public void faceBookIconField() {
		facebookIcon.click();
	}
}
