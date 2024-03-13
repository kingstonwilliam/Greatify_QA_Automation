package testCases_SchoolOperations_SchoolConfiguration;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonFunction.CommonFunction;
import pageObject_SchoolOperation_SchoolConfiguration.TestEmployeeWorkingTimeObject;

public class TestEmployeeWorkingTime extends CommonFunction {
	@Test(priority=(0),dataProvider="EmpWorkingTime")
	public void employeeWorkingTime(String datas) throws InterruptedException, AWTException {
		try {
		Robot robot = new Robot();

		String Users[]=datas.split(",");
		System.out.println(Users[0]);
		System.out.println(Users[1]);
		System.out.println(Users[2]);
		System.out.println(Users[3]);
		Thread.sleep(3000);
		PageFactory.initElements(driver, TestEmployeeWorkingTimeObject.class);
		TestEmployeeWorkingTimeObject.ClickEmployeeWorkingTime.click();
		Thread.sleep(2000);
		TestEmployeeWorkingTimeObject.ClickEmployeeEditBtn.click();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
//		TestEmployeeWorkingTimeObject.TeachingCheckInTime.click();
//		TestEmployeeWorkingTimeObject.TeachingCheckInTime.clear();
		TestEmployeeWorkingTimeObject.TeachingCheckInTime.sendKeys(Users[0]);
		//act.sendKeys(Keys.ENTER).perform();
//		TestEmployeeWorkingTimeObject.TeachingCheckOutTime.click();
//		TestEmployeeWorkingTimeObject.TeachingCheckOutTime.clear();
		robot.keyPress(KeyEvent.VK_TAB);
		TestEmployeeWorkingTimeObject.TeachingCheckOutTime.sendKeys(Users[1]);

//		TestEmployeeWorkingTimeObject.TeachingCheckInBufferTime.click();
//		TestEmployeeWorkingTimeObject.TeachingCheckInBufferTime.clear();
		robot.keyPress(KeyEvent.VK_TAB);

        TestEmployeeWorkingTimeObject.TeachingCheckInBufferTime.sendKeys(Users[2]);

//        TestEmployeeWorkingTimeObject.TeachingCheckOutBufferTime.click();
//        TestEmployeeWorkingTimeObject.TeachingCheckOutBufferTime.clear();
		robot.keyPress(KeyEvent.VK_TAB);
        TestEmployeeWorkingTimeObject.TeachingCheckOutBufferTime.sendKeys(Users[3]);
    	robot.keyPress(KeyEvent.VK_TAB);
    	act.sendKeys(Keys.TAB).perform();
    	robot.keyPress(KeyEvent.VK_ENTER);

       // TestEmployeeWorkingTimeObject.ClickEmployeeUpdateBtn.click();
//        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        TestEmployeeWorkingTimeObject.EmployeeEditSuccessMsg.click();
		}
		catch (Exception e) {
			// TODO: handle exception
			TestEmployeeWorkingTimeObject.ErrorMsg.click();
		}
	}
	@DataProvider(name="EmpWorkingTime")
	public String[] ReadEmployeeWorkingTime() throws IOException, ParseException {
		JSONParser jsonparser= new JSONParser();
		FileReader reader= new FileReader(".\\Jasonfile\\EmployeeWorkingTime.json");
		Object obj=jsonparser.parse(reader);
		JSONObject dashBoardloginObj=(JSONObject)obj;
		JSONArray EmployeeWorkingTimeArray=(JSONArray) dashBoardloginObj.get("workingTime");
		String arr[]=new String[EmployeeWorkingTimeArray.size()];	
		for(int i=0;i<EmployeeWorkingTimeArray.size();i++) {
			JSONObject empedit=(JSONObject)EmployeeWorkingTimeArray.get(i);
			String CheckInTime=(String) empedit.get("CheckInTime");
			String CheckOutTime=(String) empedit.get("CheckOutTime");
			String BufferInTime=(String) empedit.get("BufferInTime");
			String BufferOutTime=(String)empedit.get("BufferOutTime");
			arr[i]=CheckInTime+","+CheckOutTime+","+BufferInTime+","+BufferOutTime;
		}
		return arr;
	}
}
