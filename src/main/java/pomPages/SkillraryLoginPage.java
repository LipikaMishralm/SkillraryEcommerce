package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {

	//Declaration part---------
	
	//address of gears webelement
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	//address of skillary demo app
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	//address of search text field
	@FindBy(name = "q")
	private WebElement searchTF;
	
	//address of search icon
	@FindBy(xpath = "//input[@value='go']")
	private WebElement searchicon;
	
	//initialization part-------------
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization part------
	//for the methods we have developed in declaration part
	
	public void gearsButton() {
		gearsbtn.click();
	}
	
	public void skillraryDemoApplication() {
		skillrarydemoapp.click();
	}
	
	public void searchTextBox(String name) {
		searchTF.sendKeys(name);
	}
	
	public void searchIcon() {
		searchicon.click();
	}
}
