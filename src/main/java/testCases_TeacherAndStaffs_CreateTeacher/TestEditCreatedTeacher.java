package testCases_TeacherAndStaffs_CreateTeacher;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject_TeacherAndStaffs_CreateTeacher.EditCreatedTeacherObject;
import commonFunction.CommonFunction;

public class TestEditCreatedTeacher extends CommonFunction{
	@Test(priority=(0),dataProvider = "TeacherEdit")
public void EditTeacherProfile(String datas) throws InterruptedException {
	PageFactory.initElements(driver, EditCreatedTeacherObject.class);
	String user[]= datas.split(",");
	Thread.sleep(2000);
	EditCreatedTeacherObject.ClickId.click();
	Thread.sleep(2000);
	EditCreatedTeacherObject.ClickEdit.click();
	Thread.sleep(2000);
	EditCreatedTeacherObject.ClickName.clear();
	Thread.sleep(2000);
	EditCreatedTeacherObject.ClickName.sendKeys(user[0]);
	Thread.sleep(2000);
	EditCreatedTeacherObject.ClickEmail.clear();
	EditCreatedTeacherObject.ClickEmail.sendKeys(user[1]);
	
	EditCreatedTeacherObject.ClickContinue.click();
	Thread.sleep(2000);
	EditCreatedTeacherObject.ClickSubmitBtn.click();
	Thread.sleep(2000);
	EditCreatedTeacherObject.ClickSuccessBtn.click();
}
@DataProvider(name = "TeacherEdit")
public String[] ReadTeacherEditDetail() throws IOException, ParseException {
	JSONParser jsonparser = new JSONParser();
	FileReader reader = new FileReader(".\\Jasonfile\\TeacherEdit.json");
	Object obj = jsonparser.parse(reader);
	JSONObject dashBoardloginObj = (JSONObject) obj;
	JSONArray EmployeeWorkingTimeArray = (JSONArray) dashBoardloginObj.get("TeacherEdit");
	String arr[] = new String[EmployeeWorkingTimeArray.size()];
	for (int i = 0; i < EmployeeWorkingTimeArray.size(); i++) {
		JSONObject empedit = (JSONObject) EmployeeWorkingTimeArray.get(i);
		String name = (String) empedit.get("name");
		String email = (String) empedit.get("email");
		

		arr[i] = name + "," + email;
	}
	return arr;
}
}
