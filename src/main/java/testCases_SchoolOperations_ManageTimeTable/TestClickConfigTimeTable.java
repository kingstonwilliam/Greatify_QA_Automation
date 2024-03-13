package testCases_SchoolOperations_ManageTimeTable;

import java.awt.AWTException;
import java.awt.Robot;
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
import pageObject_SchoolOperation_TimeTable.StudentTimeTableObject;

public class TestClickConfigTimeTable extends CommonFunction{
	@Test(priority=0,dataProvider = "ClassTimeTable")
     public void ClickTimeTableNav(String datas) throws InterruptedException, AWTException {
		Robot robot= new Robot();
		String[]  User= datas.split(",");
    	 PageFactory.initElements(driver, StudentTimeTableObject.class);
    	 Thread.sleep(3000);
    	 StudentTimeTableObject.TimeTablebNav.click();
    	 Thread.sleep(2000);
    	 StudentTimeTableObject.ConFigTimeTable.click();
    	 Thread.sleep(2000);
    	 StudentTimeTableObject.ChooseCategory.click();
    	 StudentTimeTableObject.CheckBoxes1.click();
    	 StudentTimeTableObject.CheckBoxes2.click();
    	 StudentTimeTableObject.CheckBoxes3.click();
    	 StudentTimeTableObject.CheckBoxes4.click();
    	 StudentTimeTableObject.CheckBoxes5.click();
    	 StudentTimeTableObject.SchoolStartTime.click();
    	 Thread.sleep(2000);
       	 StudentTimeTableObject.SchoolStartTime.click();
    	 robot.keyPress(KeyEvent.VK_CONTROL);
    	 robot.keyPress(KeyEvent.VK_A);
    	 StudentTimeTableObject.SchoolStartTime.sendKeys(User[0]);
    	 StudentTimeTableObject.TotalPeriod.sendKeys(User[1]);
    	 StudentTimeTableObject.DurationOfEachPeriod.sendKeys(User[2]);
    	 StudentTimeTableObject.BreakType1.click();
    	 StudentTimeTableObject.BreakMin1.sendKeys(User[3]);
    	 StudentTimeTableObject.breakComesAtfter1.click();
    	 Thread.sleep(2000);
    	 StudentTimeTableObject.AddBreak.click();
    	 Thread.sleep(2000);
    	 StudentTimeTableObject.BreakType2.click();
    	 StudentTimeTableObject.BreakMin2.sendKeys(User[4]);
    	 StudentTimeTableObject.breakComesAtfter2.click();
    	 Thread.sleep(2000);
    	 StudentTimeTableObject.AddBreak2.click();
    	 Thread.sleep(2000);
    	 StudentTimeTableObject.BreakType3.click();
    	 StudentTimeTableObject.BreakMin3.sendKeys(User[5]);
    	 StudentTimeTableObject.breakComesAtfter3.click();
    	 StudentTimeTableObject.ClickConfigureTimeTable.click();
    	 Thread.sleep(2000);
    	 StudentTimeTableObject.BuildTimeTable.click();
    	 Thread.sleep(2000);
    	 StudentTimeTableObject.PublishTimeTable.click();
    	 Thread.sleep(2000);
    	 StudentTimeTableObject.SuccessMsg.click();
    	 
    	 
    	 
    	 
    	 
     }
	@DataProvider(name="ClassTimeTable")
	public String[] StudentTimeTable() throws IOException, ParseException {
		JSONParser jsonparser= new JSONParser();
		FileReader reader= new FileReader(".\\Jasonfile\\TimeTable.json");
		Object obj=jsonparser.parse(reader);
		JSONObject dashBoardloginObj=(JSONObject)obj;
		JSONArray DashBoardLoginArray=(JSONArray) dashBoardloginObj.get("ClassTimeTable");
		String arr[]=new String[DashBoardLoginArray.size()];	
		for(int i=0;i<DashBoardLoginArray.size();i++) {
			JSONObject users=(JSONObject)DashBoardLoginArray.get(i);
			String SchoolStartTime=(String) users.get("SchoolStartTime");
			String Periods=(String) users.get("Periods");
			String DurtionTimePeriod=(String) users.get("DurtionTimePeriod");
			String BreakTime=(String) users.get("BreakTime");
			String lunchBreak=(String) users.get("lunchBreak");
			String BreakTime2=(String) users.get("BreakTime2");

			arr[i]=SchoolStartTime+","+Periods+","+DurtionTimePeriod+","+BreakTime+","+lunchBreak+","+BreakTime2;
		}
		return arr;
}
}
