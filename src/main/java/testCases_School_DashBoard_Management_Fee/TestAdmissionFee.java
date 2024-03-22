package testCases_School_DashBoard_Management_Fee;

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
import pageObject.SchoolOnBoardSubjectObject;
import pageObject_School_DashBoard_ManagementFee.ClickAddFeeBtn;
import pageObject_School_DashBoard_ManagementFee.ClickAdmissionAndFee;
import pageObject_School_DashBoard_ManagementFee.ClickConcession;

public class TestAdmissionFee extends  CommonFunction{
	@Test(priority=(0),dataProvider="AddFee")
	public void clickManageAndFee(String datas) throws InterruptedException, AWTException {
		String user[]=datas.split(",");
		Robot robot= new Robot();
		PageFactory.initElements(driver, ClickAdmissionAndFee.class);
		Thread.sleep(10000);
		ClickAdmissionAndFee.ClickAdmissionAndFee.click();
		Thread.sleep(2000);
		ClickAdmissionAndFee.ClickManageFee.click();
		Thread.sleep(2000);
		ClickAdmissionAndFee.ClickAddFee.click();
		Thread.sleep(2000);
		ClickAdmissionAndFee.EnterName.sendKeys(user[0]);
		ClickAdmissionAndFee.EnterAmount.sendKeys(user[1]);
		ClickAdmissionAndFee.ClickSelectClass.click();
		Thread.sleep(2000);
		ClickAdmissionAndFee.SelectClass.click();
		ClickAdmissionAndFee.SelectDate.click();
		robot.keyPress(KeyEvent.VK_CONTROL);
   	    robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		ClickAdmissionAndFee.SelectDate.sendKeys(user[2]);
		Thread.sleep(2000);
    	ClickAdmissionAndFee.GstOption.click();
    	ClickAdmissionAndFee.GstOption.click();
		ClickAdmissionAndFee.EnterGstPercentage.sendKeys(user[3]);
		ClickAdmissionAndFee.TutionFeeName1.sendKeys(user[4]);
		ClickAdmissionAndFee.SplitAmount1.sendKeys(user[5]);
		ClickAdmissionAndFee.AddFeeBreakDown.click();
		ClickAdmissionAndFee.TutionFeeName2.sendKeys(user[6]);
		ClickAdmissionAndFee.SplitAmount2.sendKeys(user[7]);
		ClickAdmissionAndFee.ClickCreateBtn.click();
		Thread.sleep(2000);
		ClickAdmissionAndFee.CreateSuccessBtn.click();    
		Thread.sleep(2000);
		ClickAdmissionAndFee.PublishNow.click();
		Thread.sleep(2000);
		ClickAdmissionAndFee.PublishCofirmationBtn.click();
		Thread.sleep(2000);
		ClickAdmissionAndFee.PublishSuccessMsg.click();
		
	}
	@Test(priority=(1),dataProvider="AddFee")
	public void ClickManageAndFeeClone(String datas) throws InterruptedException, AWTException {
		String user[]=datas.split(",");
		Robot robot= new Robot();
		PageFactory.initElements(driver, ClickAdmissionAndFee.class);
		ClickAdmissionAndFee.ClickAddFee.click();
		Thread.sleep(2000);
		ClickAdmissionAndFee.EnterName.sendKeys(user[0]);
		ClickAdmissionAndFee.EnterAmount.sendKeys(user[1]);
		ClickAdmissionAndFee.ClickSelectClass.click();
		Thread.sleep(2000);
		ClickAdmissionAndFee.SelectClass.click();
		ClickAdmissionAndFee.SelectDate.click();
		robot.keyPress(KeyEvent.VK_CONTROL);
   	    robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		ClickAdmissionAndFee.SelectDate.sendKeys(user[2]);
		Thread.sleep(2000);
    	ClickAdmissionAndFee.GstOption.click();
    	ClickAdmissionAndFee.GstOption.click();
		ClickAdmissionAndFee.EnterGstPercentage.sendKeys(user[3]);
		ClickAdmissionAndFee.TutionFeeName1.sendKeys(user[4]);
		ClickAdmissionAndFee.SplitAmount1.sendKeys(user[5]);
		ClickAdmissionAndFee.AddFeeBreakDown.click();
		ClickAdmissionAndFee.TutionFeeName2.sendKeys(user[6]);
		ClickAdmissionAndFee.SplitAmount2.sendKeys(user[7]);
		ClickAdmissionAndFee.ClickCreateBtn.click();
		Thread.sleep(2000);
		ClickAdmissionAndFee.CreateSuccessBtn2.click(); 
	}
	@Test(priority =(2),dataProvider="EditFee")
	public void EditFee(String datas) throws InterruptedException {
		String user[]= datas.split(",");
		PageFactory.initElements(driver, ClickAdmissionAndFee.class);
	    Thread.sleep(2000);
		ClickAdmissionAndFee.ClickEditLogo.click();
		Thread.sleep(2000);
		ClickAdmissionAndFee.EditFeeName.clear();
		Thread.sleep(1000);
		ClickAdmissionAndFee.EditFeeName.sendKeys(user[0]);
		ClickAdmissionAndFee.Amount.clear();
		Thread.sleep(1000);
		ClickAdmissionAndFee.Amount.sendKeys(user[1]);
		ClickAdmissionAndFee.GstOptionNo.click();
		ClickAdmissionAndFee.EditBalanceAmount.click();
		Thread.sleep(1000);
		ClickAdmissionAndFee.EditBalanceAmount.clear();
		Thread.sleep(1000);
		ClickAdmissionAndFee.EditBalanceAmount.sendKeys(user[3]);
		ClickAdmissionAndFee.ClickUpdateBtn.click();
		Thread.sleep(2000);
		ClickAdmissionAndFee.ClickEditSuccessMsg.click();
		
	}
	@Test(priority=(3))
	public void DeleteFee() throws InterruptedException {
		PageFactory.initElements(driver, ClickAdmissionAndFee.class);
		Thread.sleep(2000);
		ClickAdmissionAndFee.ClickDeleteFeeLogo.click();
	    Thread.sleep(2000);
	    ClickAdmissionAndFee.DeleteConfirmMsg.click();
	    Thread.sleep(2000);
	    ClickAdmissionAndFee.DeleteSuccessMsg.click();
	}
	 
	 @Test(priority =(4),dataProvider="AddFee")
	 public void AddOnFees(String datas) throws InterruptedException, AWTException {
		 TestAdmissionFee execute = new TestAdmissionFee();
		 String user[]=datas.split(",");
		 PageFactory.initElements(driver,ClickAddFeeBtn.class);
		 Thread.sleep(2000);
		 ClickAddFeeBtn.ClickAddOnfee.click();
		 Thread.sleep(2000);
		 ClickAddFeeBtn.CreateAddOnFee.click();
		 Thread.sleep(2000);
		 ClickAddFeeBtn.EnterFeeName.sendKeys(user[8]);
		 ClickAddFeeBtn.FeeAmount.sendKeys(user[9]);
		 ClickAddFeeBtn.ChooseDate.sendKeys(user[10]);
		 ClickAddFeeBtn.GstPercentage.sendKeys(user[11]);
		 ClickAddFeeBtn.DownloadSampleCsv.click();
		 Thread.sleep(2000);
		 ClickAddFeeBtn.UploadCsv.click();
		 execute.ClickFolderUpload();
		 Thread.sleep(2000);
		 ClickAddFeeBtn.fileUploadSuccess.click();
		 Thread.sleep(2000);
		 ClickAddFeeBtn.FeeCreate.click();
		 Thread.sleep(2000);
		 ClickAddFeeBtn.FeeCreateSuccess.click();
		 
		 
	 }
		public void ClickFolderUpload() throws InterruptedException, AWTException {
			
		 Thread.sleep(3000);
			String filePath = "C:\\Users\\macappstudio\\Downloads\\addon_fee_students.csv";
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
			
		}
        @Test(priority=(5),dataProvider="AddFee")
		public void AddDiscount(String datas) throws InterruptedException, AWTException {
			Robot robot= new Robot();
			String user[]= datas.split(",");
			PageFactory.initElements(driver, ClickConcession.class);
			Thread.sleep(2000);
			ClickConcession.ClickConcession.click();
			Thread.sleep(2000);
			ClickConcession.ClickAddDiscount.click();
			Thread.sleep(2000);
			ClickConcession.SelectClass.click();
			ClickConcession.ChooseFeeName.click();
			ClickConcession.DiscountName.sendKeys(user[12]);
			ClickConcession.DiscountPercentage.sendKeys(user[13]);
			ClickConcession.EnterAmount.sendKeys(user[14]);
			ClickConcession.ChooseDate.click();
			robot.keyPress(KeyEvent.VK_CONTROL);
    	   	 robot.keyPress(KeyEvent.VK_A);
    	   	 Thread.sleep(1000);
			ClickConcession.ChooseDate.sendKeys(user[15]);
			ClickConcession.ClickSampleCSV.click();
			Thread.sleep(2000);
			ClickConcession.UploadCSV.click();
			String filePath = "C:\\Users\\macappstudio\\Downloads\\discount_fee_students.csv";
			StringSelection selection = new StringSelection(filePath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			ClickConcession.UploadSuccessMsg.click();
			Thread.sleep(2000);
			ClickConcession.ClickCreate.click();
			Thread.sleep(2000);
			ClickConcession.ConfirmationMsg.click();	
		}
        @DataProvider(name="AddFee")
		public String[] ReadCreateClass() throws IOException, ParseException {
			JSONParser jsonparser= new JSONParser();
			FileReader reader= new FileReader(".\\Jasonfile\\AddFee.json");
			Object obj=jsonparser.parse(reader);
			JSONObject dashBoardloginObj=(JSONObject)obj;
			JSONArray EmployeeWorkingTimeArray=(JSONArray) dashBoardloginObj.get("AddFee");
			String arr[]=new String[EmployeeWorkingTimeArray.size()];	
			for(int i=0;i<EmployeeWorkingTimeArray.size();i++) {
				JSONObject empedit=(JSONObject)EmployeeWorkingTimeArray.get(i);
				String FeeName=(String) empedit.get("FeeName");
				String Amount=(String) empedit.get("Amount");
				String Choose=(String) empedit.get("Choose");
				String GstPercentage=(String) empedit.get("GstPercentage");
				String PF=(String) empedit.get("PF");
				String SplitAmount=(String) empedit.get("SplitAmount");
				String Balance=(String) empedit.get("Balance");
				String BalanceAmount=(String) empedit.get("BalanceAmount");
				String FeeName2=(String) empedit.get("FeeName2");
				String FeeAmount=(String) empedit.get("FeeAmount");
				String ChooseDate=(String) empedit.get("ChooseDate");
				String EnterGst=(String) empedit.get("EnterGst");
				String DiscountName=(String) empedit.get("DiscountName");
				String DiscountPercentage=(String) empedit.get("DiscountPercentage");
				String EnterAmount=(String) empedit.get("EnterAmount");
				String SectionName2=(String) empedit.get("SectionName2");
				String ChooseDiscountDate=(String) empedit.get("ChooseDiscountDate");

				arr[i]=FeeName+","+Amount+","+Choose+","+GstPercentage+","+PF+","+SplitAmount+","+Balance+","+BalanceAmount+","+FeeName2
						+","+FeeAmount+","+ChooseDate+","+EnterGst+","+DiscountName+","+DiscountPercentage+","+EnterAmount+","+SectionName2+","+ChooseDiscountDate;
			}
			return arr;
		}
        @DataProvider(name="EditFee")
		public String[] ReadEditClass() throws IOException, ParseException {
			JSONParser jsonparser= new JSONParser();
			FileReader reader= new FileReader(".\\Jasonfile\\EditFee.json");
			Object obj=jsonparser.parse(reader);
			JSONObject dashBoardloginObj=(JSONObject)obj;
			JSONArray EmployeeWorkingTimeArray=(JSONArray) dashBoardloginObj.get("EditFee");
			String arr[]=new String[EmployeeWorkingTimeArray.size()];	
			for(int i=0;i<EmployeeWorkingTimeArray.size();i++) {
				JSONObject empedit=(JSONObject)EmployeeWorkingTimeArray.get(i);
				String FeeName=(String) empedit.get("FeeName");
				String Amount=(String) empedit.get("Amount");				String Balance=(String) empedit.get("Balance");
				String BalanceAmount=(String) empedit.get("BalanceAmount");

				arr[i]=FeeName+","+Amount+","+Balance+","+BalanceAmount;
			}
        
		return arr;
        }
}
