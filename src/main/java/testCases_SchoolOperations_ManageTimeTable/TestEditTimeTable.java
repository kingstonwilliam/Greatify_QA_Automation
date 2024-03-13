package testCases_SchoolOperations_ManageTimeTable;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFunction;
import pageObject_SchoolOperation_TimeTable.EditStudentTimeTable;

public class TestEditTimeTable extends CommonFunction{
	@Test(priority=(0))
         public void EditTimeTable() throws InterruptedException {
        try {	 
		PageFactory.initElements(driver,EditStudentTimeTable.class);
        	 Thread.sleep(2000);
        	 EditStudentTimeTable.ClickEditLogo.click();
        	 Thread.sleep(2000);
        	 EditStudentTimeTable.EditPeriodTimeTable1.click();
        	 Thread.sleep(2000);
        	 EditStudentTimeTable.SelectSubject1.click();
        	 EditStudentTimeTable.UpdateBtn1.click();
        	 
        	 	 
        	 
         }catch (Exception e) {
			// TODO: handle exception
        	 Thread.sleep(2000);
        	 EditStudentTimeTable.ErrorOkBtn.click();
        	 Thread.sleep(2000);
        	 EditStudentTimeTable.SelectSubject3.click();
        	 EditStudentTimeTable.UpdateBtn1.click();
		}
       
        }
	@Test(priority=(1))
	 public void EditTimeTable2() throws InterruptedException {
			PageFactory.initElements(driver,EditStudentTimeTable.class);
			Thread.sleep(2000);
		 EditStudentTimeTable.EditPeriodTimeTable2.click();
    	 Thread.sleep(2000);
    	 EditStudentTimeTable.SelectSubject2.click();
    	 EditStudentTimeTable.UpdateBtn2.click();
    	 Thread.sleep(2000);
    	 EditStudentTimeTable.UpdateTimeTable.click();
    	 Thread.sleep(2000);
    	 EditStudentTimeTable.SuccessOkBtn.click();
    	 
     }
	@Test(priority=(2))
	public void DeleteTimeTable() throws InterruptedException {
		PageFactory.initElements(driver, EditStudentTimeTable.class);
		Thread.sleep(2000);
		EditStudentTimeTable.ClickDeleteLogo.click();
		Thread.sleep(2000);
		EditStudentTimeTable.DeleteConfirmation.click();
		Thread.sleep(2000);
		EditStudentTimeTable.DeleteOkBtn.click();

	}
}
