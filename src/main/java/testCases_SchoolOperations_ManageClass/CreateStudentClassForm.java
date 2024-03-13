package testCases_SchoolOperations_ManageClass;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonFunction.CommonFunction;
import pageObject.SchoolOnBoardDetailObject;
import pageObject_SchoolOperation_ManageClass.ClickCreateClass;

public class CreateStudentClassForm extends CommonFunction {
	@Test(priority=(0),dataProvider = "ManageCreateClass")
	public void CreateClass(String datas) throws InterruptedException {
		try {
		 String User[]=datas.split(",");
		PageFactory.initElements(driver, ClickCreateClass.class);
		Thread.sleep(3000);
		ClickCreateClass.ClickCreateClassBtn.click();
		Thread.sleep(2000);
		ClickCreateClass.SelectStandard.click();
		Thread.sleep(2000);	
		ClickCreateClass.EnterClassId.sendKeys(User[0]);
		Thread.sleep(2000);
		ClickCreateClass.EnterSeatingCap.sendKeys(User[1]);
		ClickCreateClass.ChooseClassTeacher.click();
		ClickCreateClass.ChooseStartDate.sendKeys(User[2]);
		ClickCreateClass.ChooseEndDate.sendKeys(User[3]);
		Thread.sleep(2000);
		ClickCreateClass.ClickContinue.click();
		ClickCreateClass.ClickContinue.click();
		}
		catch (Exception e) {
			// TODO: handle exception
			
		}
	}
	@Test(priority=(1))
	public void CreateClassStep2() throws InterruptedException {
		try {
		PageFactory.initElements(driver,ClickCreateClass.class);
			Thread.sleep(2000);
			ClickCreateClass.ClickSubjectTeacher1.click();
			ClickCreateClass.ClickSubjectTeacher2.click();
			ClickCreateClass.ClickSubjectTeacher3.click();
			ClickCreateClass.ClickContinueBtn.click();
		}
		catch (Exception e) {
			// TODO: handle exception
			Thread.sleep(2000);
			ClickCreateClass.OkBtn.click();
			ClickCreateClass.CancelBtn.click();
			Thread.sleep(2000);
			ClickCreateClass.ClickCancelConfirmBtn.click();
		}
			

	}
	@Test(priority=(2))
	public static void UploadCsvFile() throws InterruptedException, AWTException {
try {
	
		Thread.sleep(3000);

		PageFactory.initElements(driver, ClickCreateClass.class);
		ClickCreateClass.ClickDownloadCsvBtn.click();
		ClickCreateClass.ClickUploadFile.click();
		
		String filePath = "C:\\Users\\macappstudio\\Downloads\\StudentDetail.csv";
		StringSelection selection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ClickCreateClass.ClickSubmitBtn.click();
		Thread.sleep(2000);
		ClickCreateClass.ClickSuccessMsg.click();
//		String title= driver.getTitle();
//		String link ="https://wwwacademycom.heycampus.site/school/class_management";
//		assertEquals(title, link);
		

//SchoolOnBoardDetailObject.ClickSchoolSyllabus.click();
}
catch (Exception e) {
	
	ClickCreateClass.ClickOkBtn.click();
	Thread.sleep(1000);
	ClickCreateClass.ClickCancelBtn.click();
	ClickCreateClass.CancelConfirmationBtn.click();
}
	}
	
	@DataProvider(name = "ManageCreateClass")
	public String[] ReadTeacherEditDetail() throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jasonfile\\ManageCreateClass.json");
		Object obj = jsonparser.parse(reader);
		JSONObject dashBoardloginObj = (JSONObject) obj;
		JSONArray EmployeeWorkingTimeArray = (JSONArray) dashBoardloginObj.get("ManageClass");
		String arr[] = new String[EmployeeWorkingTimeArray.size()];
		for (int i = 0; i < EmployeeWorkingTimeArray.size(); i++) {
			JSONObject empedit = (JSONObject) EmployeeWorkingTimeArray.get(i);
			String Id = (String) empedit.get("Id");
			String SeatingCapacity = (String) empedit.get("SeatingCapacity");
			String StartDate = (String) empedit.get("StartDate");
			String EndDATE = (String) empedit.get("EndDATE");
			arr[i] = Id + "," + SeatingCapacity  +","+StartDate +","+EndDATE;
		}
			return arr;
	}


}
