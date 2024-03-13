package testCases_inviteSchool;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import commonFunction.CommonFunction;
import pageObject.GreatifyLoginPageObject;
import pageObject.ManageSchoolObject;

public class Test_User_Role extends CommonFunction {

	@Test(dataProvider = "dp", priority = (0))
	public void login(String data) throws AWTException, IOException {
		ExtentTest test2 = extent.createTest("TC002 - Fetching Data From Json");
		try {
			driver.get("https://heycampus.site/super-admin/login");
			String users[] = data.split(",");
			PageFactory.initElements(driver, GreatifyLoginPageObject.class);
			GreatifyLoginPageObject.userName.sendKeys((users[0]));// username
			GreatifyLoginPageObject.passWord.sendKeys((users[1]));// password
			GreatifyLoginPageObject.loginbtn.click();
			test2.log(Status.PASS, "Fetched Data Successfully From Json");
			logger.info("TC002 - Fetching Data From Json");
			logger.info("Successfully fetched Data from Json");
		} catch (Exception e) {
			System.err.println("Error in readLoginCredential method: " + e.getMessage());
			logger.fatal("error in fetching data from Json");
			Robot robot = new Robot();
			java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rectangle = new Rectangle(screenSize);
			BufferedImage source = robot.createScreenCapture(rectangle);
			File destinationFile = new File("C:\\ss\\login.png");
			ImageIO.write(source, "png", destinationFile);
			test2.log(Status.FAIL, "Unable to login",
					MediaEntityBuilder.createScreenCaptureFromPath("C:\\ss\\login.png").build());

		}
	}

	@DataProvider(name = "dp")
	public String[] readLoginCredential() throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jasonfile\\login.json");
		Object obj = jsonparser.parse(reader);
		JSONObject empjsonobj = (JSONObject) obj;
		JSONArray userloginsArray = (JSONArray) empjsonobj.get("userlogins");

		String arr[] = new String[userloginsArray.size()];

		for (int i = 0; i < userloginsArray.size(); i++) {
			JSONObject users = (JSONObject) userloginsArray.get(i);
			String user = (String) users.get("username");
			String pwd = (String) users.get("password");
			arr[i] = user + "," + pwd;

		}
		return arr;
	}

	@Test(priority = (1))
	public void clickManageSchool() throws InterruptedException, IOException, AWTException {
		ExtentTest test3 = extent.createTest("TC003 - Click Manage School");
		try {

			PageFactory.initElements(driver, ManageSchoolObject.class);
			Thread.sleep(8000);
			ManageSchoolObject.clickManageSchoolBtn.click();
			test3.log(Status.PASS, "Successfully clicked Manage School Button");
			logger.info("TC005 - Click Manage School Button");
			logger.info("Successfully clicked Manage School Button");
		} catch (Exception e) {
			logger.error("Unable to click Manage School Button");
			Robot robot = new Robot();
			java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rectangle = new Rectangle(screenSize);
			BufferedImage source = robot.createScreenCapture(rectangle);
			File destinationFile = new File("C:\\ss\\manageSchoolTest.png");
			ImageIO.write(source, "png", destinationFile);
			test3.log(Status.FAIL, "Unable to click Manage School Button",
					MediaEntityBuilder.createScreenCaptureFromPath("C:\\ss\\manageSchoolTest.png").build());

		}
	}

	@Test(dataProvider = "invite", priority = (2))
	public void clickInviteSchoolBtn(String data) throws InterruptedException, IOException, AWTException {
		ExtentTest test4 = extent.createTest("TC006 - Click Invite School Button and fill the form");
		try {

			String users[] = data.split(",");
			Thread.sleep(4000);
			PageFactory.initElements(driver, ManageSchoolObject.class);
			// Thread.sleep(3000);
			ManageSchoolObject.clickInviteSchool.click();
			Thread.sleep(4000);
			ManageSchoolObject.schoolName.sendKeys((users[0]));
			ManageSchoolObject.siteName.sendKeys(users[1]);
			ManageSchoolObject.emailId.sendKeys(users[2]);
			ManageSchoolObject.coursePlanManagementChkBox.click();
			ManageSchoolObject.calenderManagementChkBox.click();
			ManageSchoolObject.nonTeachingEmp.click();
			ManageSchoolObject.attendanceManagement.click();
			ManageSchoolObject.smsCredit.sendKeys(users[3]);
			ManageSchoolObject.whatsApp.sendKeys(users[4]);
			ManageSchoolObject.marketPlaceCommision.sendKeys(users[5]);
			ManageSchoolObject.AccountId.sendKeys(users[6]);
			ManageSchoolObject.commisionAmt.sendKeys(users[7]);
			ManageSchoolObject.submtBtn.click();
			test4.log(Status.PASS, "Successfully form filled");
			logger.info("TC004 - Click Invite School Button and fill the form");
			logger.info("Successfully form filled");
		} catch (Exception e) {
			logger.error("unable to click the invite school btn");
			Robot robot = new Robot();
			java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rectangle = new Rectangle(screenSize);
			BufferedImage source = robot.createScreenCapture(rectangle);
			File destinationFile = new File("C:\\ss\\clickInviteScdhoolBtn.png");
			ImageIO.write(source, "png", destinationFile);
			test4.log(Status.FAIL, "Error in filling form",
					MediaEntityBuilder.createScreenCaptureFromPath("C:\\ss\\clickInviteScdhoolBtn.png").build());

		}
	}

	@DataProvider(name = "invite")
	public String[] readInviteSchoolForm() throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jasonfile\\inviteSchool.json");
		Object obj = jsonparser.parse(reader);
		JSONObject inviteFormObj = (JSONObject) obj;
		JSONArray inviteFormArray = (JSONArray) inviteFormObj.get("inviteschoolform");

		String arr[] = new String[inviteFormArray.size()];
		for (int i = 0; i < inviteFormArray.size(); i++) {
			JSONObject users = (JSONObject) inviteFormArray.get(i);
			String SchoolName = (String) users.get("schoolName");
			String SiteName = (String) users.get("siteName");
			String EmailAddress = (String) users.get("emailAddress");
			String smsCredits = (String) users.get("smsCredits");
			String whatsApp = (String) users.get("whatsApp");
			String marketplaceCommission = (String) users.get("marketplaceCommission");
			String accountId = (String) users.get("accountId");
			String commissionAmount = (String) users.get("commissionAmount");
			arr[i] = SchoolName + "," + SiteName + "," + EmailAddress + "," + smsCredits + "," + whatsApp + ","
					+ marketplaceCommission + "," + accountId + "," + commissionAmount;
		}
		return arr;

	}
}
