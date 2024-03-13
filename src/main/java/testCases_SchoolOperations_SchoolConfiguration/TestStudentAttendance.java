package testCases_SchoolOperations_SchoolConfiguration;

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
import pageObject_SchoolOperation_SchoolConfiguration.TestStudentAttendanceObject;

public class TestStudentAttendance extends CommonFunction {
	@Test(priority=(0),dataProvider="AttendancePercentage")
	public void StudentAttendanceEdit(String datas) throws InterruptedException {
		try {
		String Users[]=datas.split(",");
		Thread.sleep(3000);
		PageFactory.initElements(driver, TestStudentAttendanceObject.class);
		TestStudentAttendanceObject.ClickStudentAttendancePercentage.click();
		Thread.sleep(2000);
		TestStudentAttendanceObject.ClickConfigureNow.click();
		Thread.sleep(3000);
		TestStudentAttendanceObject.PercetageInput.sendKeys(Users[0]);
		TestStudentAttendanceObject.configureNow.click();
		Thread.sleep(2000);
		TestStudentAttendanceObject.SuccessfullMsg.click();
	}
		catch (Exception e) {
			TestStudentAttendanceObject.ErrorOkMsg.click();
		}}
	@DataProvider(name="AttendancePercentage")
	public String[] ReadStudentAttendancePercentage() throws IOException, ParseException {
		JSONParser jsonparser= new JSONParser();
		FileReader reader= new FileReader(".\\Jasonfile\\EmployeeAttendance.json");
		Object obj=jsonparser.parse(reader);
		JSONObject dashBoardloginObj=(JSONObject)obj;
		JSONArray EmployeeWorkingTimeArray=(JSONArray) dashBoardloginObj.get("StudentAttendance");
		String arr[]=new String[EmployeeWorkingTimeArray.size()];	
		for(int i=0;i<EmployeeWorkingTimeArray.size();i++) {
			JSONObject empedit=(JSONObject)EmployeeWorkingTimeArray.get(i);
			String AttendancePercentange1=(String) empedit.get("AttendancePercentange1");
			String AttendancePercentange2=(String) empedit.get("AttendancePercentange2");
			
			arr[i]=AttendancePercentange1+","+AttendancePercentange2;
		}
		return arr;
	}
}
