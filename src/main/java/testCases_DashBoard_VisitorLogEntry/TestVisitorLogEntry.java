package testCases_DashBoard_VisitorLogEntry;

import java.awt.AWTException;
import java.awt.Robot;
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
import pageObject_SchoolDashBoard_VisitorLogEntry.VisitorLogEntry;

public class TestVisitorLogEntry extends CommonFunction {
	@Test(priority = (0), dataProvider = "CreateVisitorLog")
	public void ClickVisitorLog(String datas) throws InterruptedException, AWTException {
		Robot robot = new Robot();
		String[] user = datas.split(",");
		PageFactory.initElements(driver, VisitorLogEntry.class);
		Thread.sleep(5000);
		VisitorLogEntry.ClickVisitorLog.click();
		Thread.sleep(2000);
		VisitorLogEntry.ClickNewEntry.click();
		Thread.sleep(2000);
		VisitorLogEntry.TypeOfVisitor.click();
		VisitorLogEntry.ParentsName.sendKeys(user[0]);
		VisitorLogEntry.MobileNumber.sendKeys(user[1]);
		VisitorLogEntry.VehicleNumber.sendKeys(user[2]);
		VisitorLogEntry.Address.sendKeys(user[3]);
		VisitorLogEntry.CityName.sendKeys(user[4]);
		VisitorLogEntry.VisitBdgeNumber.sendKeys(user[5]);
		VisitorLogEntry.StudentName.click();
		VisitorLogEntry.Sec.click();
		VisitorLogEntry.Class.click();
		VisitorLogEntry.PurposeOfVisit.click();
		// VisitorLogEntry.ChooseTime.sendKeys(user[6]);
		VisitorLogEntry.ChooseTime.click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		VisitorLogEntry.ChooseTime.sendKeys(user[6]);
		// VisitorLogEntry.CheckOutTime.sendKeys(user[7]);
// 	VisitorLogEntry.CheckOutTime.click();
// 	 robot.keyPress(KeyEvent.VK_CONTROL);
// 	 robot.keyPress(KeyEvent.VK_A);
// 	VisitorLogEntry.CheckOutTime.sendKeys(user[7]);
		Thread.sleep(2000);
		VisitorLogEntry.Create.click();
		Thread.sleep(2000);
		VisitorLogEntry.Create.click();
		Thread.sleep(2000);
		VisitorLogEntry.success.click();
	}

	@Test(priority = (1), dataProvider = "CreateVisitorLog")
	public void EnterExitTime(String datas) throws InterruptedException, AWTException {
		Robot robot = new Robot();
		String[] user = datas.split(",");
		PageFactory.initElements(driver, VisitorLogEntry.class);
		Thread.sleep(3000);
		VisitorLogEntry.ClickEditExitTime.click();
		Thread.sleep(2000);
		VisitorLogEntry.ClickChooseTime.click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		VisitorLogEntry.ClickChooseTime.sendKeys(user[7]);
		VisitorLogEntry.ClickDone.click();
		Thread.sleep(2000);
		VisitorLogEntry.ClickDone.click();
		Thread.sleep(2000);
		VisitorLogEntry.ClickSuccess.click();
	}

	@DataProvider(name = "CreateVisitorLog")
	public String[] ReadVisitorLog() throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jasonfile\\VisitorLogEntry.json");
		Object obj = jsonparser.parse(reader);
		JSONObject dashBoardloginObj = (JSONObject) obj;
		JSONArray EmployeeWorkingTimeArray = (JSONArray) dashBoardloginObj.get("Visitors");
		String arr[] = new String[EmployeeWorkingTimeArray.size()];
		for (int i = 0; i < EmployeeWorkingTimeArray.size(); i++) {
			JSONObject empedit = (JSONObject) EmployeeWorkingTimeArray.get(i);
			String ParentsName = (String) empedit.get("ParentsName");
			String MobileNumber = (String) empedit.get("MobileNumber");
			String VehicleNumber = (String) empedit.get("VehicleNumber");
			String Address = (String) empedit.get("Address");
			String City = (String) empedit.get("City");
			String BadgeNumber = (String) empedit.get("BadgeNumber");
			String CheckInTime = (String) empedit.get("CheckInTime");
			String CheckOutTime = (String) empedit.get("CheckOutTime");

			arr[i] = ParentsName + "," + MobileNumber + "," + VehicleNumber + "," + Address + "," + City + ","
					+ BadgeNumber + "," + CheckInTime + "," + CheckOutTime;
		}
		return arr;
	}
}
