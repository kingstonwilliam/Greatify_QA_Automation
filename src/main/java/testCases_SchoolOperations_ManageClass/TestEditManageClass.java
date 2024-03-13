package testCases_SchoolOperations_ManageClass;

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
import pageObject_SchoolOperation_ManageClass.EditManageClass;

public class TestEditManageClass extends CommonFunction{
	@Test(priority=(0),dataProvider="EditClass")
public void ClickEditManageClass(String datas) throws InterruptedException {
		try {
		String user[]=datas.split(",");
	PageFactory.initElements(driver,EditManageClass.class);
	Thread.sleep(3000);
	EditManageClass.ClickStandard.click();
	Thread.sleep(2000);
	EditManageClass.ClickEditClass.click();
	Thread.sleep(2000);
	EditManageClass.ClickInputClassId.clear();
	EditManageClass.ClickInputClassId.sendKeys(user[0]);
	EditManageClass.ClickSeatingCapacity.clear();
	EditManageClass.ClickSeatingCapacity.sendKeys(user[1]);
	EditManageClass.ClickContinueBtn1.click();
	Thread.sleep(2000);
	EditManageClass.ClickContinueBtn2.click();
	Thread.sleep(2000);
	EditManageClass.ClickUpdateBtn.click();
	Thread.sleep(2000);
	EditManageClass.editSuccessMsg.click();
}	
		catch (Exception e) {
			// TODO: handle exception
			EditManageClass.ClickOkBtn.click();
			Thread.sleep(2000);
			EditManageClass.CancelBtn.click();
		}
	}
@DataProvider(name = "EditClass")
public String[] ReadTeacherEditDetail() throws IOException, ParseException {
	JSONParser jsonparser = new JSONParser();
	FileReader reader = new FileReader(".\\Jasonfile\\EditManageClass.json");
	Object obj = jsonparser.parse(reader);
	JSONObject dashBoardloginObj = (JSONObject) obj;
	JSONArray EmployeeWorkingTimeArray = (JSONArray) dashBoardloginObj.get("EditManageClass");
	String arr[] = new String[EmployeeWorkingTimeArray.size()];
	for (int i = 0; i < EmployeeWorkingTimeArray.size(); i++) {
		JSONObject empedit = (JSONObject) EmployeeWorkingTimeArray.get(i);
		String ClassId = (String) empedit.get("ClassId");
		String SeatingCapacity = (String) empedit.get("SeatingCapacity");
		arr[i] = ClassId + "," + SeatingCapacity;
	}
		return arr;
}

}		
			