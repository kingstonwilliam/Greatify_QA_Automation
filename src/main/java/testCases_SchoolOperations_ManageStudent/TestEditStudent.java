package testCases_SchoolOperations_ManageStudent;

import java.awt.AWTException;
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
import pageObject_SchoolOperation_ManageStudentt.StudentEditObject;

public class TestEditStudent extends CommonFunction{
	
	@Test(priority = (0),dataProvider = "StudentEdit")
     public void StudentEdit(String datas) throws InterruptedException {
		String Users[]=datas.split(",");
		PageFactory.initElements(driver, StudentEditObject.class);
		Thread.sleep(3000);
		StudentEditObject.ClickProfileBtn.click();
    	 Thread.sleep(2000);
    	 StudentEditObject.ClickEditBtn.click();
    	 Thread.sleep(2000);
    	 StudentEditObject.ClickRollNo.click();
    	 StudentEditObject.ClickRollNo.clear();
    	 StudentEditObject.ClickRollNo.sendKeys(Users[0]);
    	 StudentEditObject.ClickAdmissionNo.click();
    	 StudentEditObject.ClickAdmissionNo.clear();
    	 StudentEditObject.ClickAdmissionNo.sendKeys(Users[1]);
    	 Thread.sleep(2000);
    	 StudentEditObject.ClickSaveOption.click();
    	 Thread.sleep(2000);
    	 StudentEditObject.ClickSuccessBtn.click();
    	 
     }
	@DataProvider(name = "StudentEdit")
	public String[] ReadStudentEditForm() throws IOException, ParseException, AWTException {

		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jasonfile\\EditStudent.json");
		Object obj = jsonparser.parse(reader);
		JSONObject dashBoardloginObj = (JSONObject) obj;
		JSONArray EmployeeWorkingTimeArray = (JSONArray) dashBoardloginObj.get("StudentEdit");
		String arr[] = new String[EmployeeWorkingTimeArray.size()];
		for (int i = 0; i < EmployeeWorkingTimeArray.size(); i++) {
			JSONObject empedit = (JSONObject) EmployeeWorkingTimeArray.get(i);
			String RollNo = (String) empedit.get("RollNo");
			String AdmissionNo = (String) empedit.get("AdmissionNo");
			arr[i] = RollNo + "," + AdmissionNo ;			
			
		}
		return arr;
	}
	
	
	
}
