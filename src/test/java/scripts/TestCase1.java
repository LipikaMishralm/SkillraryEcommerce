package scripts;

import org.testng.annotations.Test;

import generic_Libraries.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass{

	@Test
	public void tc1() {
		
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoApplication();
		utilities.switchingtabs(driver);
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilities.mouseOver(driver, sd.getCourseTab());
		sd.seleniumTrainingTab();
		AddtocartPage atc=new AddtocartPage(driver);
		utilities.doubleClick(driver, atc.getPlusIcon());
		atc.addToCartButton();
		utilities.alertPopup(driver);
		
	}
}
