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
import pageObject_SchoolOperation_SchoolConfiguration.TestHallObject;

public class TestStudentHall extends CommonFunction {
    @Test(priority=(0),dataProvider="Hall")
	public void StudentHall(String datas) throws InterruptedException {
		String Users[]=datas.split(",");
		Thread.sleep(3000);
		PageFactory.initElements(driver,TestHallObject.class );
		TestHallObject.ClickHall.click();
		Thread.sleep(2000);
        TestHallObject.AddHall.click();	
        Thread.sleep(2000);
        TestHallObject.EnterHallName.click();
        TestHallObject.EnterHallName.sendKeys(Users[0]);
        TestHallObject.ClickCreateBtn.click();
        Thread.sleep(2000);
        TestHallObject.SuccessMsg.click();
        
	}
    @DataProvider(name="Hall")
	public String[] ReadStudentAttendancePercentage() throws IOException, ParseException {
		JSONParser jsonparser= new JSONParser();
		FileReader reader= new FileReader(".\\Jasonfile\\CreateHall.json");
		Object obj=jsonparser.parse(reader);
		JSONObject dashBoardloginObj=(JSONObject)obj;
		JSONArray EmployeeWorkingTimeArray=(JSONArray) dashBoardloginObj.get("SchoolHall");
		String arr[]=new String[EmployeeWorkingTimeArray.size()];	
		for(int i=0;i<EmployeeWorkingTimeArray.size();i++) {
			JSONObject empedit=(JSONObject)EmployeeWorkingTimeArray.get(i);
			String Hall1=(String) empedit.get("Hall1");
			String Hall2=(String) empedit.get("Hall2");
			
			arr[i]=Hall1+","+Hall2;
		}
		return arr;
	}
    @Test(priority=(1),dataProvider="Hall")
    public void EditHallMsg(String datas) throws InterruptedException {
    	String Users[]=datas.split(",");
    	Thread.sleep(3000);
    	PageFactory.initElements(driver, TestHallObject.class);
    	TestHallObject.EditIcon.click();
    	Thread.sleep(2000);
    	TestHallObject.EditInputHallName.click();
    	TestHallObject.EditInputHallName.clear();
    	TestHallObject.EditInputHallName.sendKeys(Users[1]);
    	TestHallObject.ClickEditCreateBtn.click();
    	Thread.sleep(2000);
    	TestHallObject.ClickEditSucccessBtn.click();
    }
    @Test(priority=(2))
    public void DeleteHall() throws InterruptedException {
      	Thread.sleep(2000);
    	PageFactory.initElements(driver, TestHallObject.class);
    	TestHallObject.DeleteHall.click();
    	Thread.sleep(2000);
    	TestHallObject.DeleteSuccessMsg.click();
    	Thread.sleep(2000);
    	TestHallObject.SuccessfullyDeleted.click();
    }
}
