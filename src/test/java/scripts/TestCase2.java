package scripts;

import org.testng.annotations.Test;
import generic_Libraries.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass{

	@Test
	public void tc2() throws Throwable  {
		
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoApplication();
		
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilities.switchingtabs(driver);
		utilities.dropDown(sd.getCoursedd(), pdata.getPropertydata("coursedd"));
		TestingPage tp=new TestingPage(driver);
		utilities.dragdrop(driver, tp.getSeleniumTrainingField(), tp.getMyCartField());
	}
}
