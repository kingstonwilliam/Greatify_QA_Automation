package testCases_SchoolOperations_ManageClass;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFunction;
import pageObject_SchoolOperation_ManageClass.ClickManageNav;

public class ClickManagClassNaV extends CommonFunction{
	@Test(priority=(0))
	public void ClickManageClssNav() throws InterruptedException {
		PageFactory.initElements(driver, ClickManageNav.class);
          Thread.sleep(2000);
         ClickManageNav.ClickNavManageClassBtn.click();
	}

}
