package testCases_inviteSchool;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.github.dockerjava.api.model.Driver;

import commonFunction.CommonFunction;
import pageObject.DataFetchingObject;
import pageObject.EmailLoginPageObject;
import pageObject.EmailSearchFiterObject;
import pageObject.InboxMsgObject;
import pageObject.LoginGreatifyObject;

public class TestEmailLogin extends CommonFunction {

	
	
	@Test(dataProvider="EmailLogin",priority=(0))
	public  void emailLogin(String data) throws InterruptedException, AWTException, IOException {
    	ExtentTest test5 = extent.createTest("TC005 - Email Login UserId and Password");

		try {
	
		 String users[]=data.split(",");
        PageFactory.initElements(driver, EmailLoginPageObject.class);
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");   
        Thread.sleep(5000);
        EmailLoginPageObject.loginUserId.sendKeys(users[0]);
        EmailLoginPageObject.nextBtn.click();
        Thread.sleep(3000);     
        EmailLoginPageObject.password.sendKeys(users[1]); 
        EmailLoginPageObject.nextbtn2.click();
        test5.log(Status.PASS, "Successfully Entered userId and password");
		logger.info("TC005 - Email Login UserId and Password");
		logger.info("Successfully Entered userId");
	}
		catch (Exception e) {
			 logger.error("Error in userId and Password");
			 Robot robot= new Robot();
		     java.awt.Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
		     Rectangle rectangle= new Rectangle(screenSize);
		     BufferedImage source =robot.createScreenCapture(rectangle);
		     File destinationFile=new File("C:\\ss\\TestEmailLogin.png");
		     ImageIO.write(source, "png", destinationFile);
		     test5.log(Status.FAIL, "Unable to login",MediaEntityBuilder.createScreenCaptureFromPath("C:\\ss\\TestEmailLogin.png").build());

		}
		}
	
	@DataProvider(name="EmailLogin")
	public String[] readEmailLoginCredential() throws IOException, ParseException {
		JSONParser jsonparser= new JSONParser();
		FileReader reader= new FileReader(".\\Jasonfile\\emailLogin.json");
		Object obj=jsonparser.parse(reader);
		JSONObject empjsonobj=(JSONObject)obj;
		JSONArray emailloginsArray=(JSONArray) empjsonobj.get("emaillogin");
		String arr[]=new String[emailloginsArray.size()];	
		for(int i=0;i<emailloginsArray.size();i++) {
			JSONObject users=(JSONObject)emailloginsArray.get(i);
			String user=(String) users.get("username");
			String pwd=(String) users.get("password");
			arr[i]=user+","+pwd;
		}
		return arr;
}
	@Test(priority=(1))
	public void emailSearchFilter() throws InterruptedException, IOException, AWTException {
		ExtentTest test6 = extent.createTest("TC006 - Email Search Filter");
		try {
			
		
		Thread.sleep(5000);
		PageFactory.initElements(driver, EmailSearchFiterObject.class);
		EmailSearchFiterObject.searchFilter.click();
		EmailSearchFiterObject.searchFilter.sendKeys("hey Campus");
		EmailSearchFiterObject.actions.sendKeys(Keys.ENTER).perform();
		test6.log(Status.PASS, "Successfully Data Searched in Email Search Filter");
		logger.info("TC006 - Email Search Filter");
		logger.info("Successfully Data Searched in Email Search Filter");

		}
		catch (Exception e) {
	     	logger.error("Error in Email Search Filter");
	     	 Robot robot= new Robot();
		     java.awt.Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
		     Rectangle rectangle= new Rectangle(screenSize);
		     BufferedImage source =robot.createScreenCapture(rectangle);
		     File destinationFile=new File("C:\\ss\\emailSearchFilter.png");
		     ImageIO.write(source, "png", destinationFile);
	     	test6.log(Status.FAIL, "Error in Email Search Filter",MediaEntityBuilder.createScreenCaptureFromPath("C:\\ss\\emailSearchFilter.png").build());
		}}
	
	@Test(priority=(2))
	public void clickInboxMsg() throws InterruptedException, AWTException, IOException {
      	ExtentTest test7 = extent.createTest("TC010 - Click Inbox Msg in Email");
try {
		Thread.sleep(5000);
		PageFactory.initElements(driver, InboxMsgObject.class);
		InboxMsgObject.ClickInboxMsg.click();
		test7.log(Status.PASS, "Successfully Inbox Msg Clicked");
		logger.info("TC07 - Click Inbox Msg in Email");
		logger.info("Successfully Inbox Msg Clicked");

}
catch (Exception e) {
	// TODO: handle exception
	Robot robot= new Robot();
    java.awt.Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
    Rectangle rectangle= new Rectangle(screenSize);
    BufferedImage source =robot.createScreenCapture(rectangle);
    File destinationFile=new File("C:\\ss\\clickInboxMsg.png");
    ImageIO.write(source, "png", destinationFile);
	test7.log(Status.FAIL, "Error in Email Search Filter",MediaEntityBuilder.createScreenCaptureFromPath("C:\\ss\\clickInboxMsg.png").build());
}
	}
	@Test (priority=(3))
	public void inboxDataFetching() throws AWTException, IOException {
      	ExtentTest test8 = extent.createTest("TC08 - Fetching UserId And Password From Inbox Message");
try {
        PageFactory.initElements(driver, DataFetchingObject.class);
        WebElement table = driver.findElement(By.xpath("//*/div[1]/table/tbody/tr[4]/td/div/table"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (int i = 0; i < rows.size(); i++) {
            WebElement row = rows.get(i);
            System.out.println(row.getText());
        }
        System.out.println("successfully data fetched");
        test8.log(Status.PASS, "Successfully data Fetched ");
		logger.info("TC08 - Fetching UserId And Password From Inbox Message");
		logger.info("Successfully data Fetched");

}catch (Exception e) {
    logger.error("Error in Email Inbox Data Fetching");
    Robot robot= new Robot();
    java.awt.Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
    Rectangle rectangle= new Rectangle(screenSize);
    BufferedImage source =robot.createScreenCapture(rectangle);
    File destinationFile=new File("C:\\ss\\clickInboxMsg.png");
    ImageIO.write(source, "png", destinationFile);
	     	test8.log(Status.FAIL, "Error in Inbox Data Fetching ",MediaEntityBuilder.createScreenCaptureFromPath("C:\\ss\\clickInboxMsg.png").build());

}
	}
	@Test(priority = (4))
	public void clickLoginGreatifyBtn() throws AWTException, IOException {
    	ExtentTest test9 = extent.createTest("TC012 - Click Login Greatify Button");
try {
		PageFactory.initElements(driver,LoginGreatifyObject.class);
//		LoginGreatifyObject.loginBtn.click();
		driver.get("https://wwwkidzeeacademycom.heycampus.site/school/login");
		test9.log(Status.PASS, "Successfully Login Button Clicked");
		logger.info("TC009 - Click Login Greatify Button");
		logger.info("Successfully Login Button Clicked");
	}catch (Exception e) {
        logger.error("Error in Clicking Login Button");
        Robot robot= new Robot();
        java.awt.Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle= new Rectangle(screenSize);
        BufferedImage source =robot.createScreenCapture(rectangle);
        File destinationFile=new File("C:\\ss\\clickLoginGreatifyBtn.png");
        ImageIO.write(source, "png", destinationFile);
     	test9.log(Status.FAIL, "Error in Clicking Login Button",MediaEntityBuilder.createScreenCaptureFromPath("C:\\ss\\clickLoginGreatifyBtn.png").build());

	}}
	
	@Test (dataProvider="DashBoardLogin",priority=(5))
	public  void loginGreatify(String datas) throws AWTException, IOException {
	  	ExtentTest test10 = extent.createTest("TC010 - Enter Correct UserId and Password");
try {
		 String users[]=datas.split(",");
		  PageFactory.initElements(driver, LoginGreatifyObject.class);
		// ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
		  //driver.switchTo().window(tabs.get(2));
		  LoginGreatifyObject.userId.sendKeys(users[0]);
		  LoginGreatifyObject.passWord.sendKeys(users[1]);
		  LoginGreatifyObject.subBtn.click();
		  System.out.println(users[0]);
		  System.out.println(users[1]);
		  test10.log(Status.PASS, "Successfully Logged in");
			logger.info("TC010 - Enter Correct UserId and Password");
			logger.info("Successfully Logged in");
	}
catch (Exception e) {
 	logger.error("Error in Loggin page");
 	Robot robot= new Robot();
    java.awt.Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
    Rectangle rectangle= new Rectangle(screenSize);
    BufferedImage source =robot.createScreenCapture(rectangle);
    File destinationFile=new File("C:\\ss\\loginGreatify.png");
    ImageIO.write(source, "png", destinationFile);
 	test10.log(Status.FAIL, "Error in Loggin page",MediaEntityBuilder.createScreenCaptureFromPath("C:\\ss\\loginGreatify.png").build());

}}
	@DataProvider(name="DashBoardLogin")
	public String[] readLoginDashBoardCredential() throws IOException, ParseException {
		JSONParser jsonparser= new JSONParser();
		FileReader reader= new FileReader(".\\Jasonfile\\GreatifyLoginDashBoard.json");
		Object obj=jsonparser.parse(reader);
		JSONObject dashBoardloginObj=(JSONObject)obj;
		JSONArray DashBoardLoginArray=(JSONArray) dashBoardloginObj.get("GreatifyLoginDashBoard");
		String arr[]=new String[DashBoardLoginArray.size()];	
		for(int i=0;i<DashBoardLoginArray.size();i++) {
			JSONObject users=(JSONObject)DashBoardLoginArray.get(i);
			String Dashuser=(String) users.get("username");
			String Dashpwd=(String) users.get("password");
			arr[i]=Dashuser+","+Dashpwd;
		}
		return arr;
		
	}
	
	
}