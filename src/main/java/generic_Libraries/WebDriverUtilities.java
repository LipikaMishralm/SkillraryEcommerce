package generic_Libraries;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {

	//1.handeling drop down
	public void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	//2.handeling mouse over
	public void mouseOver(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	//3.handeling double click
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	//4.Handeling right click
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	//5.handeling drag and drop
	public void dragdrop(WebDriver driver,WebElement src,WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, target).perform();
	}
	
	//6.shifting control to frame
	public void switchFrame(WebDriver driver,String value) {
		driver.switchTo().frame(value);
	}
	
	//7.shifting control to normal webpage
	public void switchbackframe(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	//8.shifting control to popup
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	//9.shifting control to child window
	public void switchingtabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
	}
	
	//10.handeling scroll bar
	public void scrollBar(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("windows.scrollBy("+x+","+y+")");
	}
}