package testCases_SchoolOperations_ManageStudent;

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

import commonFunction.CommonFunction;
import pageObject.SchoolOnBoardDetailObject;
import pageObject_SchoolOperation_ManageStudentt.ClickAddStudentObject;
import pageObject_SchoolOperation_ManageStudentt.StudentFileUploadObject;
import pageObject_SchoolOperation_ManageStudentt.StudentMedicalDetailForm;

public class TestAddStudent extends CommonFunction {

	@Test(priority=(0),dataProvider="AddStudent")
   public void ClickAddStudent(String datas) throws InterruptedException {
	   String Users[] = datas.split(",");
	   PageFactory.initElements(driver, ClickAddStudentObject.class );
	   Thread.sleep(2000);	
   ClickAddStudentObject.ClickAddStudent.click();
   Thread.sleep(2000);
   ClickAddStudentObject.ClickStudentName.sendKeys(Users[0]);
   Thread.sleep(1000);
   ClickAddStudentObject.ClickChooseDate.sendKeys(Users[1]);
   Thread.sleep(1000);
   ClickAddStudentObject.ClickChooseGender.click();
   ClickAddStudentObject.ClickChooseGender.sendKeys(Users[2]);
   Thread.sleep(1000);
   ClickAddStudentObject.ClickStudentId.sendKeys(Users[3]);
   Thread.sleep(1000);
   ClickAddStudentObject.ClickStudentRollNo.sendKeys(Users[4]);
   Thread.sleep(1000);
   ClickAddStudentObject.ClickEnterAdmission.sendKeys(Users[5]);
   Thread.sleep(1000);
   ClickAddStudentObject.ClickStudentPhoneNo.sendKeys(Users[6]);
   Thread.sleep(1000);
   ClickAddStudentObject.ClickChooseClass.sendKeys(Users[7]);
   Thread.sleep(1000);
   ClickAddStudentObject.ClickChooseBloodGroup.click();
   ClickAddStudentObject.ClickChooseBloodGroup.sendKeys(Users[8]);
   ClickAddStudentObject.ClickParentId.sendKeys(Users[9]);
   ClickAddStudentObject.ClickEnterAddress.sendKeys(Users[10]);
   ClickAddStudentObject.ClickEnterLocation.sendKeys(Users[11]);
   ClickAddStudentObject.ClickEnterFatherName.sendKeys(Users[12]);
   ClickAddStudentObject.ClickEnterFatherEmail.sendKeys(Users[13]);
   ClickAddStudentObject.ClickFatherMobileNumber1.sendKeys(Users[14]);
   ClickAddStudentObject.ClickMotherName.sendKeys(Users[15]);
   ClickAddStudentObject.ClickEnterMotherEmail.sendKeys(Users[16]);
   ClickAddStudentObject.ClickMotherMobileNo1.sendKeys(Users[17]);
   ClickAddStudentObject.ClickEnterFatherOccupation.sendKeys(Users[18]);
   ClickAddStudentObject.ClickMotherOccupation.sendKeys(Users[19]);
   ClickAddStudentObject.ClickEnterFatherAnnualIncome.sendKeys(Users[20]);
   ClickAddStudentObject.ClickEnterMotherAnnualIncome.sendKeys(Users[21]);
   ClickAddStudentObject.ClickEnterHouseMobileNo.sendKeys(Users[22]);
   ClickAddStudentObject.EnterSchoolName.sendKeys(Users[23]);
   ClickAddStudentObject.ChoosePreviousBoard.sendKeys(Users[24]);
   ClickAddStudentObject.EnterMarkObtained.sendKeys(Users[25]);
   ClickAddStudentObject.EnterClassHere.sendKeys(Users[26]);
   ClickAddStudentObject.EnterPercentage.sendKeys(Users[27]);
   ClickAddStudentObject.EnterRepresentative.sendKeys(Users[28]);
   ClickAddStudentObject.ClickContinueBtn.click();
	}

	@DataProvider(name = "AddStudent")
	public String[] ReadAddStudent() throws IOException, ParseException, AWTException {

		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jasonfile\\AddStudent.json");
		Object obj = jsonparser.parse(reader);
		JSONObject dashBoardloginObj = (JSONObject) obj;
		JSONArray EmployeeWorkingTimeArray = (JSONArray) dashBoardloginObj.get("AddStudent");
		String arr[] = new String[EmployeeWorkingTimeArray.size()];
		for (int i = 0; i < EmployeeWorkingTimeArray.size(); i++) {
			JSONObject empedit = (JSONObject) EmployeeWorkingTimeArray.get(i);
			String StudentName = (String) empedit.get("StudentName");
			String DateOfBirth = (String) empedit.get("DateOfBirth");
			String Gender = (String) empedit.get("Gender");
			String StudentId = (String) empedit.get("StudentId");
			String SudentRollNo = (String) empedit.get("SudentRollNo");
			String AdmissionNo = (String) empedit.get("AdmissionNo");
			String StudentMobileNo = (String) empedit.get("StudentMobileNo");
			String ChooseClass = (String) empedit.get("ChooseClass");
			String ChooseBloodGroup = (String) empedit.get("ChooseBloodGroup");
			String ParentId = (String) empedit.get("ParentId");
			String StudentAddress = (String) empedit.get("StudentAddress");
			String StudentLocation = (String) empedit.get("StudentLocation");
			String FathersName = (String) empedit.get("FathersName");
			String FatherEmail = (String) empedit.get("FatherEmail");
			String FatherMobileNo = (String) empedit.get("FatherMobileNo");
			String MotherName = (String) empedit.get("MotherName");
			String MotherEmailId = (String) empedit.get("MotherEmailId");
			String MotherMobileNo = (String) empedit.get("MotherMobileNo");
			String FatherOccupation = (String) empedit.get("FatherOccupation");
			String MotherOccupation = (String) empedit.get("MotherOccupation");
			String FatherAnnualIncome = (String) empedit.get("FatherAnnualIncome");
			String MotherAnnualIncome = (String) empedit.get("MotherAnnualIncome");
			String HomeMobilenNumber = (String) empedit.get("HomeMobilenNumber");
			String PreviousSchoolName = (String) empedit.get("PreviousSchoolName");
			String PreviousSchoolBoard = (String) empedit.get("PreviousSchoolBoard");
			String PreviousSchoolMarksObtained = (String) empedit.get("PreviousSchoolMarksObtained");
			String PreviousClass = (String) empedit.get("PreviousClass");
			String PreviousSchoolPercentage = (String) empedit.get("PreviousSchoolPercentage");
			String EnterRepresentative = (String) empedit.get("EnterRepresentative");

			arr[i] = StudentName + "," + DateOfBirth + "," + Gender + "," + StudentId + "," + SudentRollNo + ","
					+ AdmissionNo + "," + StudentMobileNo + "," + ChooseClass + "," + ChooseBloodGroup + "," + ParentId
					+ "," + StudentAddress + "," + StudentLocation + "," + FathersName + "," + FatherEmail + ","
					+ FatherMobileNo + "," + MotherName + "," + MotherEmailId + "," + MotherMobileNo + ","
					+ FatherOccupation + "," + MotherOccupation + "," + FatherAnnualIncome + "," + MotherAnnualIncome
					+ "," + HomeMobilenNumber + "," + PreviousSchoolName + "," + PreviousSchoolBoard + ","
					+ PreviousSchoolMarksObtained + "," + PreviousClass+ "," + PreviousSchoolPercentage+ "," + EnterRepresentative;
		}
		return arr;
	}
	@Test (priority=(1),dataProvider="StudentMedicalForm")
	public void StudentMedicalForm(String datas) throws InterruptedException {
		String Users[] = datas.split(",");
		   PageFactory.initElements(driver, StudentMedicalDetailForm.class );
		   StudentMedicalDetailForm.HealthConditions.click();
		   StudentMedicalDetailForm.FoodAllergies.click();
		   StudentMedicalDetailForm.VaccineAllergies.click();
		   StudentMedicalDetailForm.EnterName1.sendKeys(Users[0]);
		   StudentMedicalDetailForm.EnterDose1.sendKeys(Users[1]);
		   StudentMedicalDetailForm.addMedicalDose.click();
		   Thread.sleep(3000);
		   StudentMedicalDetailForm.EnterName2.sendKeys(Users[2]);
		   StudentMedicalDetailForm.EnterDose2.sendKeys(Users[3]);
		   StudentMedicalDetailForm.Continue.click();
		   
	}
	@DataProvider(name = "StudentMedicalForm")
	public String[] ReadStudentMedicalForm() throws IOException, ParseException, AWTException {

		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jasonfile\\StudentMedicalCheck.json");
		Object obj = jsonparser.parse(reader);
		JSONObject dashBoardloginObj = (JSONObject) obj;
		JSONArray EmployeeWorkingTimeArray = (JSONArray) dashBoardloginObj.get("StudentMedicalCheckForm");
		String arr[] = new String[EmployeeWorkingTimeArray.size()];
		for (int i = 0; i < EmployeeWorkingTimeArray.size(); i++) {
			JSONObject empedit = (JSONObject) EmployeeWorkingTimeArray.get(i);
			String injectionName1 = (String) empedit.get("injectionName1");
			String Dose1 = (String) empedit.get("Dose1");
			String injectionName2 = (String) empedit.get("injectionName2");
			String Dose2 = (String) empedit.get("Dose2");
			arr[i] = injectionName1 + "," + Dose1 + "," + injectionName2 + "," + Dose2 ;			
			
		}
		return arr;
	}
	@Test(priority=(2))
	public void ClickStudentUpload() throws InterruptedException, AWTException {
		TestAddStudent execute =new TestAddStudent();
		PageFactory.initElements(driver, StudentFileUploadObject.class);
		StudentFileUploadObject.ClickUpload1.click();
		execute.StudentDocumentUpload();
		Thread.sleep(5000);
		StudentFileUploadObject.ClickUpload2.click();
		execute.StudentDocumentUpload();
		Thread.sleep(2000);
		StudentFileUploadObject.ClickUpload3.click();
		execute.StudentDocumentUpload();
		Thread.sleep(2000);
		StudentFileUploadObject.ClickUpload4.click();
		execute.StudentDocumentUpload();
		Thread.sleep(2000);
		StudentFileUploadObject.ClickUpload5.click();
		execute.StudentDocumentUpload();
		Thread.sleep(2000);
		StudentFileUploadObject.ClickUpload6.click();
		execute.StudentDocumentUpload();
		Thread.sleep(2000);
		StudentFileUploadObject.submtBtn.click();
		Thread.sleep(2000);
		StudentFileUploadObject.ClickSuccessBtn.click();
	}
	
	public void StudentDocumentUpload() throws InterruptedException, AWTException {
		
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
