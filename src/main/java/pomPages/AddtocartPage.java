package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {

	//declaration part--------------
	
	//address of addToCart
	@FindBy(xpath = "//button[text()=' Add to Cart']")
	private WebElement addToCart;
	
	//address of plus icon
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	private WebElement plusIcon;
	
	//initialization part------------
	
	public AddtocartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization part------------
	
	public void addToCartButton() {
		addToCart.click();
	}

	public WebElement getPlusIcon() {
		return plusIcon;
	}
	
}
