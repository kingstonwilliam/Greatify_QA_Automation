package testCases_Non_Teaching_Staff_Create_Non_Teaching_Staff;

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

import PageObject_Non_Teaching_Staffs_Create_Non_Teaching_Staff.NonTeachhingUploadDocument;
import PageObject_Non_Teaching_Staffs_Create_Non_Teaching_Staff.NonTeachingEmployeeForm;
import commonFunction.CommonFunction;
import testCases_TeacherAndStaffs_CreateTeacher.CreateTeacherForm;

public class ClickAddEmployeeForm extends CommonFunction {

	@Test(priority=(0), dataProvider="NonTeachingEmp")
	public void ClickAddEmployeeBtn(String datas) throws InterruptedException, AWTException {
		try {
		String user[]= datas.split(",");
		Robot robot = new Robot();
	 PageFactory.initElements(driver, NonTeachingEmployeeForm.class);
	 NonTeachingEmployeeForm.AddEmployeeBtn.click();
	 Thread.sleep(2000);
	 NonTeachingEmployeeForm.ClickEnterName.sendKeys(user[0]);
	 NonTeachingEmployeeForm.ClickDate.click();
	 NonTeachingEmployeeForm.ClickDate.click();
	 NonTeachingEmployeeForm.ClickDate.sendKeys(user[1]);
	 robot.keyPress(KeyEvent.VK_ENTER);
	 Thread.sleep(2000);
	 NonTeachingEmployeeForm.ChooseGender.click();
		 Thread.sleep(2000);
	 NonTeachingEmployeeForm.EmployeeId.sendKeys(user[3]);
	 Thread.sleep(2000);
	 NonTeachingEmployeeForm.EmailAddress.sendKeys(user[4]);
	 NonTeachingEmployeeForm.MobileNo.sendKeys(user[5]);
	 NonTeachingEmployeeForm.BloodGroup.click();
	 NonTeachingEmployeeForm.DrivingLicense.sendKeys(user[7]);
	 NonTeachingEmployeeForm.DrivingLicenseExpiryDate.sendKeys(user[8]);
	 NonTeachingEmployeeForm.EnterFatherName.sendKeys(user[9]);
	 NonTeachingEmployeeForm.EnterFatherOccupation.sendKeys(user[10]);
	 NonTeachingEmployeeForm.MotherName.sendKeys(user[11]);
	 NonTeachingEmployeeForm.MotherOccupation.sendKeys(user[12]);
	 NonTeachingEmployeeForm.NationalityName.sendKeys(user[13]);
	 NonTeachingEmployeeForm.ReligionName.sendKeys(user[14]);
	 NonTeachingEmployeeForm.ChooseCategory.click();
	 NonTeachingEmployeeForm.EnterLanguageWritten.sendKeys(user[15]);
	 NonTeachingEmployeeForm.EnterLanguageSpoken.sendKeys(user[16]);
	 NonTeachingEmployeeForm.EnterAddress1.sendKeys(user[17]);
	 NonTeachingEmployeeForm.EnterAddress2.sendKeys(user[18]);
	 NonTeachingEmployeeForm.EnterMobileNo2.sendKeys(user[19]);
	 NonTeachingEmployeeForm.Qualification.sendKeys(user[20]);
	 NonTeachingEmployeeForm.EnterPassingHere.sendKeys(user[21]);
	 NonTeachingEmployeeForm.EnterCgpa.sendKeys(user[22]);
	 NonTeachingEmployeeForm.EnterUniversity.sendKeys(user[23]);
	 NonTeachingEmployeeForm.EnterCtc.sendKeys(user[24]);
	 Thread.sleep(2000);
	 NonTeachingEmployeeForm.ContinueBtn.click();
	 Thread.sleep(2000);
	 NonTeachingEmployeeForm.SuccessMsg.click();
		}
		catch (Exception e) {
			// TODO: handle exception
			
		}
	}
	@DataProvider(name = "NonTeachingEmp")
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
			String Date = (String) empedit.get("Date");
			String ChooseGender = (String) empedit.get("ChooseGender");
			String EmployeeId = (String) empedit.get("EmployeeId");
			String EmailAddress = (String) empedit.get("EmailAddress");
			String MobileNo = (String) empedit.get("MobileNo");
			String BloodGroup = (String) empedit.get("BloodGroup");
			String DrivingLicense = (String) empedit.get("DrivingLicense");
			String DrivingLicenseExpiryDate = (String) empedit.get("DrivingLicenseExpiryDate");
			String FatherName = (String) empedit.get("FatherName");
			String FatherOccupation = (String) empedit.get("FatherOccupation");
			String MotherName = (String) empedit.get("MotherName");
			String MotherOccupation = (String) empedit.get("MotherOccupation");
			String NationalityName = (String) empedit.get("NationalityName");
			String ReligionName = (String) empedit.get("ReligionName");
			String LanguageWritten = (String) empedit.get("LanguageWritten");
			String LanguageSpoken = (String) empedit.get("LanguageSpoken");
			String EnterAddress1 = (String) empedit.get("EnterAddress1");
			String EnterAddress2 = (String) empedit.get("EnterAddress2");
			String EnterMobileNo2 = (String) empedit.get("EnterMobileNo2");
			String Qualification = (String) empedit.get("Qualification");
			String EnterYearPassingHere = (String) empedit.get("EnterYearPassingHere");
			String EnterCgpa = (String) empedit.get("EnterCgpa");
			String EnterUniversity = (String) empedit.get("EnterUniversity");
			String EnterCtc = (String) empedit.get("EnterCtc");

			arr[i] = Name + "," + Date  + "," + ChooseGender  + "," + EmployeeId  + "," + EmailAddress  + "," + MobileNo 
					 + "," + BloodGroup  + "," + DrivingLicense  + "," + DrivingLicenseExpiryDate  + "," + FatherName  + "," + FatherOccupation  + "," + MotherName
					 + "," + MotherOccupation  + "," + NationalityName  + "," + ReligionName  + "," + LanguageWritten  + "," + LanguageSpoken  + "," + EnterAddress1
					 + "," + EnterAddress2+ "," + EnterMobileNo2+ "," + Qualification+ "," + EnterYearPassingHere+ "," + EnterCgpa+ "," + EnterUniversity+ "," + EnterCtc;
		}
		return arr;
	}
	@Test(priority=(1))
	public void UploadDocument() throws InterruptedException, AWTException {
		try {
		PageFactory.initElements(driver, NonTeachhingUploadDocument.class);
		Robot robot = new Robot();
		ClickAddEmployeeForm execute =new ClickAddEmployeeForm();
		Thread.sleep(3000);
		NonTeachhingUploadDocument.UploadDocument1.click();
		execute.NonTeachingDocumentUpload();
		
		NonTeachhingUploadDocument.UploadDocument2.click();
		execute.NonTeachingDocumentUpload();
		
		NonTeachhingUploadDocument.UploadDocument3.click();
		execute.NonTeachingDocumentUpload();
		
		NonTeachhingUploadDocument.UploadDocument4.click();
		execute.NonTeachingDocumentUpload();
		
		NonTeachhingUploadDocument.UploadDocument5.click();
		execute.NonTeachingDocumentUpload();
		
		NonTeachhingUploadDocument.UploadOtherDocument.click();
		execute.NonTeachingDocumentUpload();
		Thread.sleep(2000);
		NonTeachhingUploadDocument.SubmitBtn.click();
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		}
		catch (Exception e) {
			// TODO: handle exception
			NonTeachhingUploadDocument.CancelOkBtn.click();
		}
		

	}
public void NonTeachingDocumentUpload() throws InterruptedException, AWTException {
		
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
