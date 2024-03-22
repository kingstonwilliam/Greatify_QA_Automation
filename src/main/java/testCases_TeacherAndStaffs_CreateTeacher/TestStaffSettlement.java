package testCases_TeacherAndStaffs_CreateTeacher;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
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

import PageObject_Non_Teaching_Staffs_Create_Non_Teaching_Staff.ClickNonTeachingStaff;
import PageObject_TeacherAndStaffs_CreateTeacher.ClickStaffSettlement;
import commonFunction.CommonFunction;

public class TestStaffSettlement extends CommonFunction {
	@Test(priority = (0),dataProvider="TeachingSettlement")
	public void ClickStaffSettlement(String datas) throws InterruptedException, AWTException {
		TestStaffSettlement execute = new TestStaffSettlement();
		String user[] = datas.split(",");
		PageFactory.initElements(driver, ClickStaffSettlement.class);
		Thread.sleep(5000);
		ClickStaffSettlement.ClickStaffSettlement.click();
		Thread.sleep(2000);
		ClickStaffSettlement.ClickGenerateSettlement.click();
		Thread.sleep(2000);
		ClickStaffSettlement.ChooseTeacher.click();
		ClickStaffSettlement.PfAmount.sendKeys(user[0]);
		ClickStaffSettlement.SettlementAmount.sendKeys(user[1]);
		ClickStaffSettlement.UploadDocument.click();
		execute.ClickFolderUpload();
		Thread.sleep(1000);
		ClickStaffSettlement.GenerateSettlement.click();
		Thread.sleep(2000);
		ClickStaffSettlement.SuccessMsg.click();
	}
	@Test(priority=(1),dataProvider="TeachingSettlement")
	public void EditTeachingSettlement(String datas) throws InterruptedException {
		String user[]= datas.split(",");
		PageFactory.initElements(driver, ClickStaffSettlement.class);
		Thread.sleep(2000);
		ClickStaffSettlement.EditStaffSettlement.click();
		Thread.sleep(2000);
		ClickStaffSettlement.EditPfAmount.clear();
		ClickStaffSettlement.EditPfAmount.sendKeys(user[4]);
		ClickStaffSettlement.EditSettlementPfAmount.clear();
		ClickStaffSettlement.EditSettlementPfAmount.sendKeys(user[5]);
		ClickStaffSettlement.EditUpdate.click();
		Thread.sleep(2000);
		ClickStaffSettlement.EditSuccessMsg.click();
	}
	@Test(priority=(2))
	public void DeleteTeachingSettlement() throws InterruptedException {
		PageFactory.initElements(driver, ClickStaffSettlement.class);
	   Thread.sleep(2000);
	   ClickStaffSettlement.ClickDeleteLogo.click();
	   Thread.sleep(2000);
	   ClickStaffSettlement.ConfirmationBtn.click();
	   Thread.sleep(2000);
	   ClickStaffSettlement.DeleteSuccessMsg.click();
	}
	public void ClickFolderUpload() throws InterruptedException, AWTException {
		 Thread.sleep(3000);
			String filePath = "C:\\Users\\macappstudio\\Downloads\\blank-pdf-document-for-download.pdf";
			StringSelection selection = new StringSelection(filePath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
		}

	@DataProvider(name = "TeachingSettlement")
	public String[] ReadTeacherSettlement() throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jasonfile\\TeachingAndNonTeachingSettlement.json");
		Object obj = jsonparser.parse(reader);
		JSONObject dashBoardloginObj = (JSONObject) obj;
		JSONArray EmployeeWorkingTimeArray = (JSONArray) dashBoardloginObj
				.get("TeachingSettlementAndNonTeachingSettlement");
		String arr[] = new String[EmployeeWorkingTimeArray.size()];
		for (int i = 0; i < EmployeeWorkingTimeArray.size(); i++) {
			JSONObject empedit = (JSONObject) EmployeeWorkingTimeArray.get(i);
			String PfAmount = (String) empedit.get("PfAmount");
			String SettlementAmount = (String) empedit.get("SettlementAmount");
			String NonTeachingPfAmount = (String) empedit.get("NonTeachingPfAmount");
			String NonTeachingSettlementAmount = (String) empedit.get("NonTeachingSettlementAmount");
			String EditPfAmount = (String) empedit.get("EditPfAmount");
			String EditSettlementAmount = (String) empedit.get("EditSettlementAmount");

			arr[i] = PfAmount + "," + SettlementAmount + "," + NonTeachingPfAmount + "," + NonTeachingSettlementAmount
					+ "," + EditPfAmount+ "," + EditSettlementAmount;
		}
		return arr;
	}
	//NON TEACHING SETTLEMENT
	@Test(priority = (3), dataProvider = "TeachingSettlement")
	public void GenerateNonTeachingSettlement(String datas) throws InterruptedException, AWTException
	{
		TestStaffSettlement execute = new TestStaffSettlement();
		String user[]=datas.split(",");
		PageFactory.initElements(driver, ClickStaffSettlement.class);
		Thread.sleep(2000);
		ClickStaffSettlement.ClickNonTeachingSettlement.click();
		Thread.sleep(2000);
		ClickStaffSettlement.NonteachingGenerateSettlement.click();
		Thread.sleep(2000);
		ClickStaffSettlement.ChooseNonTeachingEmployee.click();
		Thread.sleep(2000);
		ClickStaffSettlement.NonTeachingPf.sendKeys(user[2]);
		ClickStaffSettlement.NonTeachingSettlementAmount.sendKeys(user[3]);
		ClickStaffSettlement.NonTeachingUploadDocument.click();
		execute.ClickFolderUpload();
		Thread.sleep(2000);
		ClickStaffSettlement.NonTeachingGenerateBtn.click();
		Thread.sleep(2000);
		ClickStaffSettlement.NonTeachingSuccessMsg.click();
		
		
	}
	@Test (priority=(4),dataProvider = "TeachingSettlement")
	public void NonTeachingEdit(String datas) throws InterruptedException {
		String user[]=datas.split(",");
		PageFactory.initElements(driver, ClickStaffSettlement.class);
		Thread.sleep(2000);
		ClickStaffSettlement.EditNonTeachingSettlement.click();
		Thread.sleep(2000);
		ClickStaffSettlement.EditNonTeachingPfAmount.clear();
		ClickStaffSettlement.EditNonTeachingPfAmount.sendKeys(user[2]);
		ClickStaffSettlement.EditNonTeachingSettlementAmt.clear();
		ClickStaffSettlement.EditNonTeachingSettlementAmt.sendKeys(user[3]);;
	    ClickStaffSettlement.EditNonTeachingUpdateBtn.click();
	    Thread.sleep(2000);
        ClickStaffSettlement.EditNonTeachingSuccessMsg.click();
	}
	@Test(priority = (5))
	public void NonTeachingDelete() throws InterruptedException {
		PageFactory.initElements(driver, ClickStaffSettlement.class);
		Thread.sleep(2000);
		ClickStaffSettlement.NonTeachingDeleteLogo.click();
		Thread.sleep(2000);
		ClickStaffSettlement.NonTeachingConfirmation.click();
		Thread.sleep(2000);
		ClickStaffSettlement.NonTeachingDeleteSuccessMsg.click();
	}
}
