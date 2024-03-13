package testCases_Non_Teaching_Staff_Create_Non_Teaching_Staff;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject_Non_Teaching_Staffs_Create_Non_Teaching_Staff.ClickNonTeachingStaff;
import commonFunction.CommonFunction;

public class ClickNonTeachingStaffBtn extends CommonFunction{
	@Test
	public void ClickNonTeachingStaff() throws InterruptedException {
	PageFactory.initElements(driver, ClickNonTeachingStaff.class);
	Thread.sleep(2000);
	ClickNonTeachingStaff.ClickNonTeachingStaffBtn.click();  
	}
}
