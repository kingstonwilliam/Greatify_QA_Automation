package testCases_SchoolOperations_Announcement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.dockerjava.core.dockerfile.DockerfileStatement.Add;

import commonFunction.CommonFunction;
import pageObject_SchoolOperation_Announcement.AddAnnouncement;
import pageObject_SchoolOperation_TimeTable.StudentTimeTableObject;

public class ClickAnnouncement extends CommonFunction {
	@Test(priority = 0, dataProvider = "CreateAnnouncement")
	public void CreateAnnouncement(String datas) throws InterruptedException, AWTException {
		Robot robot = new Robot();
		String[] user = datas.split(",");
		PageFactory.initElements(driver, AddAnnouncement.class);
		Thread.sleep(3000);
		AddAnnouncement.ClickAnnouncement.click();
		Thread.sleep(2000);
		AddAnnouncement.AddNewMessage.click();
		Thread.sleep(2000);
		AddAnnouncement.EnterTitle.sendKeys(user[0]);
		Thread.sleep(2000);
		AddAnnouncement.ChooseCategory.click();
		Thread.sleep(2000);
		AddAnnouncement.ChooseCategory.sendKeys(user[1]);
		robot.keyPress(KeyEvent.VK_ENTER);
		AddAnnouncement.ChooseDate.click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		//robot.keyRelease(0);
		AddAnnouncement.ChooseDate.sendKeys(user[2]);
		Thread.sleep(2000);
		AddAnnouncement.EnterMessage.sendKeys(user[4]);
		AddAnnouncement.SelectClass.click();
		robot.keyPress(KeyEvent.VK_ENTER);
		AddAnnouncement.CreateMsg.click();
		Thread.sleep(2000);
		AddAnnouncement.SuccessMsg.click();
	}

	@DataProvider(name = "CreateAnnouncement")
	public String[] ReadCreateClass() throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jasonfile\\Announcement.json");
		Object obj = jsonparser.parse(reader);
		JSONObject dashBoardloginObj = (JSONObject) obj;
		JSONArray EmployeeWorkingTimeArray = (JSONArray) dashBoardloginObj.get("Announcement");
		String arr[] = new String[EmployeeWorkingTimeArray.size()];
		for (int i = 0; i < EmployeeWorkingTimeArray.size(); i++) {
			JSONObject empedit = (JSONObject) EmployeeWorkingTimeArray.get(i);
			String Title = (String) empedit.get("Title");
			String category = (String) empedit.get("category");
			String Date = (String) empedit.get("Date");
			String Selectclass = (String) empedit.get("Selectclass");
			String Message = (String) empedit.get("Message");
			String Title2 = (String) empedit.get("Title2");
			String category2 = (String) empedit.get("category2");
			String Date2 = (String) empedit.get("Date2");
			String Selectclass2 = (String) empedit.get("Selectclass2");
			String Message2 = (String) empedit.get("Message2");
			arr[i] = Title + "," + category + "," + Date + "," + Selectclass + "," + Message + "," + Title2 + ","
					+ category2 + "," + Date2 + "," + Selectclass2 + "," + Message2;
		}
		return arr;
	}

	@Test(priority = (1), dataProvider = "CreateAnnouncement")
	public void EditAnnouncement(String datas) throws InterruptedException, AWTException {
		Robot robot = new Robot();
		String[] user = datas.split(",");
		PageFactory.initElements(driver, AddAnnouncement.class);
		AddAnnouncement.ClickEditLogo.click();
		Thread.sleep(2000);
		AddAnnouncement.EditTitle.click();
		Thread.sleep(1000);
		AddAnnouncement.EditTitle.clear();
		AddAnnouncement.EditTitle.sendKeys(user[5]);
//		AddAnnouncement.EditChooseCategory.click();
//		Thread.sleep(1000);
//		AddAnnouncement.EditChooseCategory.sendKeys(user[6]);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		AddAnnouncement.ChooseDate.click();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_A);
//		AddAnnouncement.ChooseDate.sendKeys(user[7]);
		Thread.sleep(2000);
		AddAnnouncement.ChooseMsg.click();
		Thread.sleep(1000);
		AddAnnouncement.ChooseMsg.clear();
		AddAnnouncement.ChooseMsg.sendKeys(user[9]);
		AddAnnouncement.EditSelectClass.click();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		AddAnnouncement.UpdateBtn.click();
		Thread.sleep(2000);
		AddAnnouncement.EditSuccessBtn.click();
		
	}
	    @Test(priority = (2))
	    public void DeleteAnnouncement() throws InterruptedException {
		PageFactory.initElements(driver, AddAnnouncement.class);
		Thread.sleep(2000);
		AddAnnouncement.DeleteLogo.click();
		Thread.sleep(2000);
		AddAnnouncement.DeleteConfimation.click();
		Thread.sleep(2000);
		AddAnnouncement.DeleteSuccessOkBtn.click();
	}
}
