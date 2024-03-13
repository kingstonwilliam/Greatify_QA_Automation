package testCases_SchoolOperations_SchoolConfiguration;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import commonFunction.CommonFunction;
import pageObject_SchoolOperation_SchoolConfiguration.TestEmployeeLeaveObject;

public class TestEmployeeLeave extends CommonFunction{
	 String leaveType="Formal Leave";
	@Test(priority=(0),dataProvider="empLeaveReq")
public  void testEmployeeLeave(String datas) throws InterruptedException {
			Thread.sleep(3000);
	PageFactory.initElements(driver, TestEmployeeLeaveObject.class);
	Thread.sleep(2000);
	TestEmployeeLeaveObject.EmployeeLeaveBtn.click();
	Thread.sleep(2000);
	TestEmployeeLeaveObject.EmployeeLeaveAddBtn.click();
	Thread.sleep(2000);
	String users[]=datas.split(",");
	TestEmployeeLeaveObject.EmployeeLeaveType.sendKeys(users[0]);
	TestEmployeeLeaveObject.EmployeeLeaveNoOfDays.sendKeys(users[1]);
	TestEmployeeLeaveObject.EmloyeeLeaveDiscription.sendKeys(users[2]);
	TestEmployeeLeaveObject.EmployeeCreateBtn.click();
	Thread.sleep(3000);
	TestEmployeeLeaveObject.SuccessMsg.click();
	
}
	@DataProvider(name="empLeaveReq")
public String[]	employeeReadLeaveReqForm() throws IOException, ParseException{
	JSONParser jsonparser= new JSONParser();
	FileReader reader= new FileReader(".\\Jasonfile\\EmployeeLeaveReqForm.json");
	Object obj=jsonparser.parse(reader);
	JSONObject dashBoardloginObj=(JSONObject)obj;
	JSONArray LeaveReqFormArray=(JSONArray) dashBoardloginObj.get("EmployeeLeaveReq");
	String arr[]=new String[LeaveReqFormArray.size()];	
	for(int i=0;i<LeaveReqFormArray.size();i++) {
		JSONObject users=(JSONObject)LeaveReqFormArray.get(i);
		String EmpLeaveType=(String) users.get("LeaveType");
		String EmpLeaveNoOfDays=(String) users.get("NoOfDays");
		String EmpDescription=(String) users.get("LeaveDescription");
		arr[i]=EmpLeaveType+","+EmpLeaveNoOfDays+","+EmpDescription;
	}
	return arr;
}
	@Test (priority=(1))
	public void ReadTableValue() throws InterruptedException {	
		Thread.sleep(2000);
		 WebElement table = driver.findElement(By.xpath("//div[1]/div[2]/div[2]/div/div[2]/table[@id='DataTables_Table_1']"));
		
		     List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		     for (int i = 0; i < rows.size(); i++) {
		         WebElement row = rows.get(i);
		         System.out.println(row.getText());		         
		     }
	}

	@Test(priority=(3))
	public void deleteLeaveRequest() throws InterruptedException {			
			PageFactory.initElements(driver, TestEmployeeLeaveObject.class);
			Thread.sleep(2000);
			TestEmployeeLeaveObject.DeleteRequest.click();
			Thread.sleep(3000);
			TestEmployeeLeaveObject.ConfirmationMsg.click();
			Thread.sleep(2000);
			TestEmployeeLeaveObject.DeleteSucessMsg.click();
			
	}
  
	@Test (priority=(2),dataProvider="empDataEdit")
	public void editLeaveReq(String empData) throws InterruptedException, IOException 
	{	
		String empedit[]=empData.split(",");

		Thread.sleep(2000);
		PageFactory.initElements(driver, TestEmployeeLeaveObject.class);
	
		TestEmployeeLeaveObject.ClickEditLogo.click();
		Thread.sleep(2000);
		//TestEmployeeLeaveObject.EditLeaveType.click();		
	TestEmployeeLeaveObject.EditNoOfDays.click();
	TestEmployeeLeaveObject.EditNoOfDays.clear();
	TestEmployeeLeaveObject.EditNoOfDays.sendKeys(empedit[1]);
	TestEmployeeLeaveObject.Editdescription.click();
	TestEmployeeLeaveObject.Editdescription.clear();
	TestEmployeeLeaveObject.Editdescription.sendKeys(empedit[2]);
	TestEmployeeLeaveObject.EditUpdateBtn.click();
	Thread.sleep(2000);
		TestEmployeeLeaveObject.EditSuccessMsg.click();		
	}
	@DataProvider(name="empDataEdit")
	public String[] ReadEditLeaveReq() throws IOException, ParseException {
		JSONParser jsonparser= new JSONParser();
		FileReader reader= new FileReader(".\\Jasonfile\\EmployeeLeaveEditData.json");
		Object obj=jsonparser.parse(reader);
		JSONObject dashBoardloginObj=(JSONObject)obj;
		JSONArray LeaveEditArray=(JSONArray) dashBoardloginObj.get("EmployeeLeaveEdit");
		String arr[]=new String[LeaveEditArray.size()];	
		for(int i=0;i<LeaveEditArray.size();i++) {
			JSONObject empedit=(JSONObject)LeaveEditArray.get(i);
			String EmpeditLeaveType=(String) empedit.get("empLeaveType");
			String EmpeditLeaveNoOfDays=(String) empedit.get("empNoOfDays");
			String EmpeditDescription=(String) empedit.get("empLeaveDescription");
			arr[i]=EmpeditLeaveType+","+EmpeditLeaveNoOfDays+","+EmpeditDescription;
		}
		return arr;
	}
}


