package testCases_TeacherAndStaffs_CreateTeacher;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject_TeacherAndStaffs_CreateTeacher.ClickTeacherObject;
import commonFunction.CommonFunction;

public class TestClickTeacherBtn extends CommonFunction{
	@Test
	public void ClickTeacher() throws InterruptedException {
		PageFactory.initElements(driver, ClickTeacherObject.class);
		Thread.sleep(2000);
		ClickTeacherObject.ClickTeachers.click();
		
	}
 
}
