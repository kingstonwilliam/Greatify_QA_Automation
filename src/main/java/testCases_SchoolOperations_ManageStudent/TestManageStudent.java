package testCases_SchoolOperations_ManageStudent;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFunction;
import pageObject_SchoolOperation_ManageStudentt.ManageSchoolStudentObject;

public class TestManageStudent extends CommonFunction{
     @Test(priority=(0))
	public void ClickManageStudent() throws InterruptedException {
    	 
		PageFactory.initElements(driver, ManageSchoolStudentObject.class);
		Thread.sleep(2000);
		ManageSchoolStudentObject.ClickManageSchoolStudent.click();
	  
     }
}
