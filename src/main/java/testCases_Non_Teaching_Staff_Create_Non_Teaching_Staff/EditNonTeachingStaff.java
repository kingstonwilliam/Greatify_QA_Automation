package testCases_Non_Teaching_Staff_Create_Non_Teaching_Staff;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject_Non_Teaching_Staffs_Create_Non_Teaching_Staff.EditNonTeachingEmp;
import commonFunction.CommonFunction;

public class EditNonTeachingStaff extends CommonFunction {
	@Test (priority = (0),dataProvider ="NonTeachingEmpEdit" )
public void ClickEditNonTeachingStaff(String datas) throws InterruptedException {
	String user[]=datas.split(",");
	 PageFactory.initElements(driver, EditNonTeachingEmp.class);
	 Thread.sleep(2000);
	 EditNonTeachingEmp.ClickNonTeachingStaffBtn.click();
	 Thread.sleep(2000);
	 EditNonTeachingEmp.ClickEmpProfile.click();
	 Thread.sleep(2000);
	 EditNonTeachingEmp.ClickEditBtn.click();
	 Thread.sleep(2000);
	
	 EditNonTeachingEmp.EditName.clear();
	 EditNonTeachingEmp.EditName.sendKeys(user[0]);
	 EditNonTeachingEmp.EditEmail.clear();
	 EditNonTeachingEmp.EditEmail.sendKeys(user[1]);
	 EditNonTeachingEmp.EditBloodGroup.click();
	 EditNonTeachingEmp.ContinueBtn.click();
	 Thread.sleep(2000);
	 EditNonTeachingEmp.SubmitBtn.click();
	 Thread.sleep(2000);
	 EditNonTeachingEmp.SuccessMsg.click();
	 
}
@DataProvider(name = "NonTeachingEmpEdit")
public String[] ReadTeacherEditDetail() throws IOException, ParseException {
	JSONParser jsonparser = new JSONParser();
	FileReader reader = new FileReader(".\\Jasonfile\\CreateNonTeachingEmployee.json");
	Object obj = jsonparser.parse(reader);
	JSONObject dashBoardloginObj = (JSONObject) obj;
	JSONArray EmployeeWorkingTimeArray = (JSONArray) dashBoardloginObj.get("NonTachingEmployee");
	String arr[] = new String[EmployeeWorkingTimeArray.size()];
	for (int i = 0; i < EmployeeWorkingTimeArray.size(); i++) {
		JSONObject empedit = (JSONObject) EmployeeWorkingTimeArray.get(i);
		String Name = (String) empedit.get("Name");
		String EmailAddress = (String) empedit.get("EmailAddress");
		String BloodGroup = (String) empedit.get("BloodGroup");
		arr[i] = Name + "," + EmailAddress  +","+BloodGroup;
	}
		return arr;
}

}
