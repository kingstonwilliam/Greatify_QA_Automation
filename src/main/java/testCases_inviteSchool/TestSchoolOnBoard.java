package testCases_inviteSchool;

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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonFunction.CommonFunction;
import pageObject.ManageSchoolObject;
import pageObject.SchoolOnBoardClassObject;
import pageObject.SchoolOnBoardDetailObject;
import pageObject.SchoolOnBoardSubjectObject;
import pageObject.SchoolOnBoardTeacherObject;
import pageObject.SchoolOnboardStudentObject;
import pageObject.SuccessfulOnBoardMsgObject;

public class TestSchoolOnBoard extends CommonFunction {
	@Test(priority=(0))
	public static void SchoolDetails() throws InterruptedException, AWTException {

		Thread.sleep(3000);

		PageFactory.initElements(driver, SchoolOnBoardDetailObject.class);
		SchoolOnBoardDetailObject.UploadFile.click();
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
	@Test(dataProvider="SchoolOnBoardDetails",priority=(1))
	public void SchoolOnBoardingDetails(String SchoolDetailsData) throws InterruptedException {
			Thread.sleep(5000);
		PageFactory.initElements(driver, SchoolOnBoardDetailObject.class);
		String SchoolOnBoardUser[]=SchoolDetailsData.split(",");
        SchoolOnBoardDetailObject.ClickSchoolSyllabus.click();
        Select dropdown = new Select(SchoolOnBoardDetailObject.ClickSchoolSyllabus);
        dropdown.selectByVisibleText(SchoolOnBoardUser[0]);
        SchoolOnBoardDetailObject.ClickAffilationNumber.sendKeys(SchoolOnBoardUser[1]);
//        Thread.sleep(2000);
       // SchoolOnBoardDetailObject.ClickMediumOfSchool.click();
		 Select SchoolMediumdropdown = new Select(SchoolOnBoardDetailObject.ClickMediumOfSchool);
		 SchoolMediumdropdown.selectByVisibleText(SchoolOnBoardUser[2]);
		 SchoolOnBoardDetailObject.ClickEnterContactName.sendKeys(SchoolOnBoardUser[3]);
		 SchoolOnBoardDetailObject.ClickEnterNumber.sendKeys(SchoolOnBoardUser[4]);
		 SchoolOnBoardDetailObject.ClickWebsiteAddress.sendKeys(SchoolOnBoardUser[5]);
		 SchoolOnBoardDetailObject.ClickEnterLatitude.sendKeys(SchoolOnBoardUser[6]);
		 SchoolOnBoardDetailObject.ClickEnterLongitude.sendKeys(SchoolOnBoardUser[7]);
		 SchoolOnBoardDetailObject.ClickEnterAdressLine1.sendKeys(SchoolOnBoardUser[8]);
		 SchoolOnBoardDetailObject.ClickEnterAdressLine2.sendKeys(SchoolOnBoardUser[9]);
		 Thread.sleep(3000);
		 SchoolOnBoardDetailObject.ClickChooseCountry.click();
		 Select countryDropDown = new Select(SchoolOnBoardDetailObject.ClickChooseCountry);
		 countryDropDown.selectByVisibleText(SchoolOnBoardUser[10]);
		 Thread.sleep(5000);
		 SchoolOnBoardDetailObject.ClickChooseState.click();
		 Select stateDropDown = new Select(SchoolOnBoardDetailObject.ClickChooseState);
		 stateDropDown.selectByVisibleText(SchoolOnBoardUser[11]);
		 Thread.sleep(2000);
		 SchoolOnBoardDetailObject.ClickChooseCity.click();
		 Select cityDropDown = new Select(SchoolOnBoardDetailObject.ClickChooseCity);
		 cityDropDown.selectByVisibleText(SchoolOnBoardUser[12]);
		 SchoolOnBoardDetailObject.ClickEnterPincode.sendKeys(SchoolOnBoardUser[13]);
		 SchoolOnBoardDetailObject.ClickContinue.click();

	}

	@DataProvider(name = "SchoolOnBoardDetails")
	public String[] readSchoolOnBoardDetails() throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jasonfile\\schoolOnBoardDetail.json");
		Object obj = jsonparser.parse(reader);
		JSONObject schonboardobj = (JSONObject) obj;
		JSONArray schoolOnBoardArray = (JSONArray) schonboardobj.get("schoolDetail");
		String arr[] = new String[schoolOnBoardArray.size()];
		for (int i = 0; i < schoolOnBoardArray.size(); i++) {
			JSONObject SchoolOnBoardForm = (JSONObject) schoolOnBoardArray.get(i);
			String Syllabus = (String) SchoolOnBoardForm.get("syllabus");//0
			String AffilationNumber = (String) SchoolOnBoardForm.get("affilationNumber");//1
			String MediumOfSchool = (String) SchoolOnBoardForm.get("mediumOfSchool");//2
			String ContactName = (String) SchoolOnBoardForm.get("contactName");//3
			String MobileNumber = (String) SchoolOnBoardForm.get("contactNumber");//4
			String WebAddress = (String) SchoolOnBoardForm.get("websiteAdress");//5
			String EnterLatitude = (String) SchoolOnBoardForm.get("latitude");//6
			String EnterLogitude = (String) SchoolOnBoardForm.get("longitude");//7
			String AddressLine1 = (String) SchoolOnBoardForm.get("address1");//8
			String AddressLine2 = (String) SchoolOnBoardForm.get("address2");//9
			String Country = (String) SchoolOnBoardForm.get("country");//10
			String state = (String) SchoolOnBoardForm.get("state");//11
			String city = (String) SchoolOnBoardForm.get("city");//12
			String pincode = (String) SchoolOnBoardForm.get("pincode");//13
			arr[i] = Syllabus + "," + AffilationNumber + "," + MediumOfSchool + "," + ContactName + "," + MobileNumber
					+ "," + WebAddress + "," + EnterLatitude + "," + EnterLogitude + "," + AddressLine1 + ","
					+ AddressLine2 + "," + Country + "," + state + "," + city + "," + pincode;
		}
		return arr;
	}
	@Test(priority=(2))
	public void OnBoardSubjectClickDownload(){
		PageFactory.initElements(driver, SchoolOnBoardSubjectObject.class);
		 SchoolOnBoardSubjectObject.ClickDownload.click();
	}
	@Test(priority=(3))
	public void ClickFolderUpload() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		PageFactory.initElements(driver, SchoolOnBoardSubjectObject.class);
		SchoolOnBoardSubjectObject.reUploadFiles.click();
		String filePath = "C:\\Users\\macappstudio\\Downloads\\SubjectCsv.csv";
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
		Thread.sleep(5000);
		SchoolOnBoardSubjectObject.successfulBtn.click();
		Thread.sleep(2000);
		SchoolOnBoardSubjectObject.continueBtn.click();
	}
	@Test(priority=(4))
	public void OnBoardTeacherDetail() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		PageFactory.initElements(driver, SchoolOnBoardTeacherObject.class);
		SchoolOnBoardTeacherObject.downloadTeacherFile.click();
		Thread.sleep(3000);
		SchoolOnBoardTeacherObject.reUploadFiles.click();
		String filePath = "C:\\Users\\macappstudio\\Downloads\\TeacherCsv.csv";
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
		Thread.sleep(5000);
		SchoolOnBoardTeacherObject.SuccessfulMsg.click();
		Thread.sleep(2000);
		SchoolOnBoardTeacherObject.continueBtn.click();
		
	}
	@Test(priority=(5))
	public void OnBoardSchoolClass() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		PageFactory.initElements(driver, SchoolOnBoardClassObject.class);
		SchoolOnBoardClassObject.DownloadFile.click();
		Thread.sleep(3000);
		SchoolOnBoardClassObject.reUploadFiles.click();
		String filePath = "C:\\Users\\macappstudio\\Downloads\\ClassCsv.csv";
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
		Thread.sleep(5000);
		SchoolOnBoardClassObject.SuccessMsg.click();
		Thread.sleep(2000);
		SchoolOnBoardClassObject.continueBtn.click();

		
	}
	@Test(priority=(6))
	public void OnBoardStudentClass() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		PageFactory.initElements(driver, SchoolOnboardStudentObject.class);
		SchoolOnboardStudentObject.downLoadFile.click();
		Thread.sleep(3000);
		SchoolOnboardStudentObject.reUploadFile.click();
		String filePath = "C:\\Users\\macappstudio\\Downloads\\StudentCsv.csv";
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
		Thread.sleep(5000);
		SchoolOnboardStudentObject.clickSuccessfulMsg.click();
//		Thread.sleep(2000);
		//SchoolOnboardStudentObject.continueBtn.click();
		
	}
//	@Test(priority=(7))
//	public void SuccessfullyOnBoarded() {
//		PageFactory.initElements(driver, SuccessfulOnBoardMsgObject.class);
//		SuccessfulOnBoardMsgObject.clickSuccessfullyMsg.click();
//	}
}
