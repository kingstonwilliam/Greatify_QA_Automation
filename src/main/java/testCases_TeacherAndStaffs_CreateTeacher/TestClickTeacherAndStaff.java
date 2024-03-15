package testCases_TeacherAndStaffs_CreateTeacher;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject_TeacherAndStaffs_CreateTeacher.ClickTeacherObject;
import commonFunction.CommonFunction;

@Test
public class TestClickTeacherAndStaff extends CommonFunction{
	public void ClickTeacherBtn() throws InterruptedException {
		PageFactory.initElements(driver, ClickTeacherObject.class);
		Thread.sleep(8000);
		ClickTeacherObject.ClickTeacherAndStaff.click();
	}
}
