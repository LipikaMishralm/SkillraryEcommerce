package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	
	//declaration part-----
	
	//address of course
	@FindBy(id = "course")
	private WebElement courseTab;
	
	//address of selenium training
	@FindBy(xpath = "(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumTraining;
	
	//address of dropdown
	@FindBy(name = "addresstype")
	private WebElement coursedd;
	
	//initialization part----
	
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	//utilization part-------
	
	public WebElement getCourseTab() {
		return courseTab;
	}

	public void seleniumTrainingTab() {
		seleniumTraining.click();
	}
	
	public WebElement getCoursedd() {
		return coursedd;
	}	
}
