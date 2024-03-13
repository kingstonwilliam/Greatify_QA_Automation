package testCases_TeacherAndStaffs_CreateTeacher;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject_TeacherAndStaffs_CreateTeacher.ClickTeacherObject;
import PageObject_TeacherAndStaffs_CreateTeacher.CreateTeacherFormObject;
import PageObject_TeacherAndStaffs_CreateTeacher.TeacherUploadDocumentObject;
import commonFunction.CommonFunction;
import pageObject_SchoolOperation_ManageStudentt.StudentFileUploadObject;
import testCases_SchoolOperations_ManageStudent.TestAddStudent;

public class CreateTeacherForm extends CommonFunction {
       @Test(priority = (0),dataProvider="TeacherCreate") 
	public void TeacherForm(String datas) throws InterruptedException, AWTException {
    	   try {
		String user[] = datas.split(",");
		Robot robot = new Robot();
		PageFactory.initElements(driver, CreateTeacherFormObject.class);
		Thread.sleep(2000);
		CreateTeacherFormObject.ClickAddTeachers.click();
		Thread.sleep(2000);
		CreateTeacherFormObject.Name.sendKeys(user[0]);
		Thread.sleep(2000);
		CreateTeacherFormObject.DateOfBirth.sendKeys(user[1]);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		CreateTeacherFormObject.GenderOption.click();
		Thread.sleep(2000);
		CreateTeacherFormObject.GenderOption.click();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		CreateTeacherFormObject.TeacherId.sendKeys(user[3]);
		Thread.sleep(2000);
		CreateTeacherFormObject.EmailAddress.sendKeys(user[4]);
		CreateTeacherFormObject.MobileNo.sendKeys(user[5]);
		CreateTeacherFormObject.ChooseBloodGroup.click();
		CreateTeacherFormObject.ChooseBloodGroup.click();
		robot.keyPress(KeyEvent.VK_ENTER);
		CreateTeacherFormObject.SelectSubject1.click();
		CreateTeacherFormObject.SelectSubject2.click();
		CreateTeacherFormObject.SelectSubject3.click();
		CreateTeacherFormObject.SelectSubject4.click();
		CreateTeacherFormObject.SelectSubject5.click();
        CreateTeacherFormObject.EnterFatherName.sendKeys(user[8]);
        CreateTeacherFormObject.EnterFatherOccupation.sendKeys(user[9]);
        CreateTeacherFormObject.MotherName.sendKeys(user[10]);
        CreateTeacherFormObject.EnterMotherOccupation.sendKeys(user[11]);
        CreateTeacherFormObject.EnterNationality.sendKeys(user[12]);
        CreateTeacherFormObject.EnterReligion.sendKeys(user[13]);
        CreateTeacherFormObject.ChooseCasteCategory.sendKeys(user[14]);
        CreateTeacherFormObject.EnterLanguageSpoken.sendKeys(user[15]);
      CreateTeacherFormObject.EnterLanguageWritten.sendKeys(user[16]);
        CreateTeacherFormObject.ContactAddress.sendKeys(user[17]);
        CreateTeacherFormObject.OfficailAddress.sendKeys(user[18]);
        CreateTeacherFormObject.EnterMobileNo2.sendKeys(user[19]);
        CreateTeacherFormObject.ClassCategory.click();
        CreateTeacherFormObject.Qualification.sendKeys(user[21]);
        CreateTeacherFormObject.EnterPassingHere.sendKeys(user[22]);
        CreateTeacherFormObject.EnterMarksHere.sendKeys(user[23]);
        CreateTeacherFormObject.EnterUniversityHere.sendKeys(user[24]);
        Thread.sleep(2000);
        CreateTeacherFormObject.EnterCtc.click();
        CreateTeacherFormObject.EnterCtc.sendKeys(user[26]);
        CreateTeacherFormObject.ClickContinueBtn.click();
    	   }
    	   catch (Exception e) {
			// TODO: handle exception
    		   CreateTeacherFormObject.ClickOkBtn.click();
		}
		}

	@DataProvider(name = "TeacherCreate")
	public String[] ReadTeacherFormDetail() throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jasonfile\\TeachersAdd.json");
		Object obj = jsonparser.parse(reader);
		JSONObject dashBoardloginObj = (JSONObject) obj;
		JSONArray EmployeeWorkingTimeArray = (JSONArray) dashBoardloginObj.get("TeacherAddForm");
		String arr[] = new String[EmployeeWorkingTimeArray.size()];
		for (int i = 0; i < EmployeeWorkingTimeArray.size(); i++) {
			JSONObject empedit = (JSONObject) EmployeeWorkingTimeArray.get(i);
			String Name = (String) empedit.get("Name");
			String DOB = (String) empedit.get("DOB");
			String Gender = (String) empedit.get("Gender");
			String TeacherId = (String) empedit.get("TeacherId");
			String EmailAddress = (String) empedit.get("EmailAddress");
			String MobileNo1 = (String) empedit.get("MobileNo1");
			String BloodGroup = (String) empedit.get("BloodGroup");
			String SelectSubject1 = (String) empedit.get("SelectSubject1");
			String FatherName = (String) empedit.get("FatherName");
			String FatherOccupation = (String) empedit.get("FatherOccupation");
			String MotherName = (String) empedit.get("MotherName");
			String MotherOccupation = (String) empedit.get("MotherOccupation");
			String NationalityName = (String) empedit.get("NationalityName");
			String ReligionName = (String) empedit.get("ReligionName");
			String CasteCategory = (String) empedit.get("CasteCategory");
			String EnterLanguageSpoken = (String) empedit.get("EnterLanguageSpoken");
			String EnterLanguageWritten = (String) empedit.get("EnterLanguageWritten");
			String ContactAddress = (String) empedit.get("ContactAddress");
			String OfficialAddress = (String) empedit.get("OfficialAddress");
			String MobileNo2 = (String) empedit.get("MobileNo2");
			String ClassCategory = (String) empedit.get("ClassCategory");
			String Qualification = (String) empedit.get("Qualification");
			String EnterYearOfPassing = (String) empedit.get("EnterYearOfPassing");
			String EnterMarksHere = (String) empedit.get("EnterMarksHere");
			String EnterUniversity = (String) empedit.get("EnterUniversity");
			String PayRoll = (String) empedit.get("PayRoll");

			arr[i] = Name + "," + DOB + "," + Gender + "," + TeacherId + "," + EmailAddress + "," + MobileNo1 + ","
					+ BloodGroup + "," + SelectSubject1 + "," + FatherName + "," + FatherOccupation + "," + MotherName
					+ "," + MotherOccupation + "," + NationalityName + "," + ReligionName + "," + CasteCategory + ","
					+ EnterLanguageSpoken + "," + EnterLanguageWritten + "," + ContactAddress + "," + OfficialAddress
					+ "," + MobileNo2 + "," + ClassCategory + "," + Qualification + "," + EnterYearOfPassing + ","
					+ EnterMarksHere + "," + EnterUniversity + "," + EnterUniversity + "," + PayRoll;
		}
		return arr;
	}
	//Upload Teacher
	@Test(priority=(1))
	public void UploadDocumentProof() throws InterruptedException, AWTException {
		try{
		PageFactory.initElements(driver, TeacherUploadDocumentObject.class);
		CreateTeacherForm execute =new CreateTeacherForm();
		TeacherUploadDocumentObject.ClickUpload1.click();
		execute.TeacherDocumentUpload();
		TeacherUploadDocumentObject.ClickUpload2.click();
		execute.TeacherDocumentUpload();

		TeacherUploadDocumentObject.ClickUpload3.click();
		execute.TeacherDocumentUpload();

		TeacherUploadDocumentObject.ClickUpload4.click();
		execute.TeacherDocumentUpload();

		TeacherUploadDocumentObject.ClickUpload5.click();
		execute.TeacherDocumentUpload();
		
		TeacherUploadDocumentObject.ClickUpload6.click();
		execute.TeacherDocumentUpload();
	

		TeacherUploadDocumentObject.SubmtBtn.click();
//		Thread.sleep(2000);
//		TeacherUploadDocumentObject.SuccessBtn.click();
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		Actions act= new Actions (driver);
//		act.sendKeys(Keys.TAB)		
//		.sendKeys(Keys.ENTER).perform();
		}catch (Exception e) {
			// TODO: handle exception
			Thread.sleep(2000);
			TeacherUploadDocumentObject.ClickTeacherNavBar.click();
		}

		
	}
	public void TeacherDocumentUpload() throws InterruptedException, AWTException {
		
		Thread.sleep(3000);
		String filePath = "C:\\Users\\macappstudio\\School_img\\school.jpg";
		StringSelection selection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
//SchoolOnBoardDetailObject.ClickSchoolSyllabus.click();
	}

}
