package testCases_SchoolOperations_CreateClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.IOException;

import org.checkerframework.checker.units.qual.C;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.After;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.errorprone.annotations.ThreadSafe;

import commonFunction.CommonFunction;
import pageObject_SchoolOperation_CreateClass.ClickClass;

@Test(priority = (0), dataProvider = "CreateClass")
public class TestClickSubjectMapping extends CommonFunction {
	public void ClickSubMapping(String datas) throws InterruptedException, AWTException {
		Robot robot = new Robot();
		String Users[] = datas.split(",");
		PageFactory.initElements(driver, ClickClass.class);
		ClickClass.ClickSubjectMapping.click();
//		Thread.sleep(2000);
//		ClickClass.ClickMapSubject.click();
//		Thread.sleep(2000);
//		ClickClass.SelectStandard.click();
//		ClickClass.SelectStandard.sendKeys(Users[11]);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		ClickClass.subject_map1.click();
//		ClickClass.subject_map1.sendKeys(Users[12]);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		ClickClass.hours1.sendKeys(Users[13]);
//		Thread.sleep(2000);
//		ClickClass.minutes1.sendKeys(Users[14]);
//		Thread.sleep(2000);
//		ClickClass.CreateBtn.click();
//		Thread.sleep(2000);
//		ClickClass.MapSuccessMsg.click();
	}
	
	@DataProvider(name = "CreateClass")
	public String[] ReadCreateClass() throws IOException, ParseException, AWTException {

		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jasonfile\\CreateClass.json");
		Object obj = jsonparser.parse(reader);
		JSONObject dashBoardloginObj = (JSONObject) obj;
		JSONArray EmployeeWorkingTimeArray = (JSONArray) dashBoardloginObj.get("CreateClass");
		String arr[] = new String[EmployeeWorkingTimeArray.size()];
		for (int i = 0; i < EmployeeWorkingTimeArray.size(); i++) {
			JSONObject empedit = (JSONObject) EmployeeWorkingTimeArray.get(i);
			String StandardName1 = (String) empedit.get("StandardName1");
			String SectionName1 = (String) empedit.get("SectionName1");
			String StandardName2 = (String) empedit.get("StandardName2");
			String SectionName2 = (String) empedit.get("SectionName2");
			String primary = (String) empedit.get("primary");
			String Selectclass = (String) empedit.get("Selectclass");
			String Selectclass2 = (String) empedit.get("Selectclass2");
			String Id1 = (String) empedit.get("Id1");
			String Language1 = (String) empedit.get("Language1");
			String Id2 = (String) empedit.get("Id2");
			String Languge2 = (String) empedit.get("Languge2");
			String SelectStandard = (String) empedit.get("SelectStandard");
			String SelectSub = (String) empedit.get("SelectSub1");
			String ClassHr = (String) empedit.get("ClassHr1");
			String ClassMin = (String) empedit.get("ClassMin1");
			String SelectSub2 = (String) empedit.get("SelectSub2");
			String ClassHr2 = (String) empedit.get("ClassHr2");
			String ClassMin2 = (String) empedit.get("ClassMin2");

			arr[i] = StandardName1 + "," + SectionName1 + "," + StandardName2 + "," + SectionName2 + "," + primary + ","
					+ Selectclass + "," + Selectclass2 + "," + Id1 + "," + Language1 + "," + Id2 + "," + Languge2 + ","
					+ SelectStandard + "," + SelectSub + "," + ClassHr + "," + ClassMin + "," + SelectSub2 + ","
					+ ClassHr2 + "," + ClassMin2;
		}
		return arr;
	}

//	@Test(priority = (1), dataProvider = "CreateClass")
//	public void SubjectEdit(String datas) throws InterruptedException, AWTException {
//		Robot robot = new Robot();
//		PageFactory.initElements(driver, ClickClass.class);
//		String Users[] = datas.split(",");
//		Thread.sleep(1000);
//		ClickClass.ClickEditSubjectMapping.click();
//		Thread.sleep(1000);
//		ClickClass.ClickEditAddAnotherSubject.click();
//		Thread.sleep(1000);
//		ClickClass.ClickSubjectDropDown.click();
//		ClickClass.ClickSubjectDropDown.sendKeys(Users[15]);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		ClickClass.ClickSubjectHours.sendKeys(Users[16]);
//		Thread.sleep(1000);
//		ClickClass.ClickMinutes.sendKeys(Users[17]);
//		ClickClass.ClickEditUpdateBtn.click();
//		Thread.sleep(1000);
//		ClickClass.ClickEditSuccessBtn.click();
//		
//		
//
//	}
//	
	
//	@AfterTest
//	public void SubjectMapping() throws InterruptedException {	
//		System.out.println("error");
//		PageFactory.initElements(driver, ClickClass.class);
//		Thread.sleep(3000);
//				ClickClass.ClickDeleteBtn.click();
//				Thread.sleep(2000);
//				ClickClass.ConfirmationMsg.click();
//				Thread.sleep(2000);
//				ClickClass.SubMappingSuccessMsg.click();
//	}
	
//	public void deleteClassTest() throws InterruptedException {
//		PageFactory.initElements(driver, ClickClass.class);
//		Thread.sleep(2000);
//		ClickClass.clickClass.click();
//		Thread.sleep(2000);
//		ClickClass.ClickChkBox1.click();
//		Thread.sleep(2000);
//		ClickClass.ClickChkBox2.click();
//		Thread.sleep(2000);
//		ClickClass.DleteBtn.click();
//		Thread.sleep(2000);
//		ClickClass.Confirmation.click();
//		Thread.sleep(2000);
//		ClickClass.Success.click();
//		Thread.sleep(2000);
//	}
//	

}
