package testCases_SchoolOperations_CreateClass;


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
import pageObject_SchoolOperation_CreateClass.ClickNavCategory;

public class TestClickCategory extends CommonFunction {
	@Test (priority=(0),dataProvider="CreateClass")
public void ClickCateGory(String datas) throws InterruptedException, AWTException {
		Robot robot = new Robot();
		String Users[]=datas.split(",");
	PageFactory.initElements(driver, ClickNavCategory.class);
	Thread.sleep(4000);
	ClickNavCategory.ClickNavCat.click();
	Thread.sleep(2000);
	ClickNavCategory.CreateCat.click();
	Thread.sleep(2000);
	ClickNavCategory.ClickCategoryName.sendKeys(Users[4]);
	Thread.sleep(2000);
	ClickNavCategory.ClickSelectClass.sendKeys(Users[5]);
	robot.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(2000);
	ClickNavCategory.CreateClass.click();
	Thread.sleep(2000);
	ClickNavCategory.OkMsg.click();
	
	
}
	 @DataProvider(name="CreateClass")
		public String[] ReadCreateClass() throws IOException, ParseException {
			JSONParser jsonparser= new JSONParser();
			FileReader reader= new FileReader(".\\Jasonfile\\CreateClass.json");
			Object obj=jsonparser.parse(reader);
			JSONObject dashBoardloginObj=(JSONObject)obj;
			JSONArray EmployeeWorkingTimeArray=(JSONArray) dashBoardloginObj.get("CreateClass");
			String arr[]=new String[EmployeeWorkingTimeArray.size()];	
			for(int i=0;i<EmployeeWorkingTimeArray.size();i++) {
				JSONObject empedit=(JSONObject)EmployeeWorkingTimeArray.get(i);
				String StandardName1=(String) empedit.get("StandardName1");
				String SectionName1=(String) empedit.get("SectionName1");
				String StandardName2=(String) empedit.get("StandardName2");
				String SectionName2=(String) empedit.get("SectionName2");
				String primary=(String) empedit.get("primary");
				String Selectclass=(String) empedit.get("Selectclass");
				String Selectclass2=(String) empedit.get("Selectclass2");

				arr[i]=StandardName1+","+SectionName1+","+StandardName2+","+SectionName2+","+primary+","+Selectclass+","+Selectclass2;
			}
			return arr;
		}
	 //Edit
	 @Test (priority=(1),dataProvider="CreateClass")
	 public void EditCategory(String datas) throws InterruptedException, AWTException {
	
			Thread.sleep(3000);
		 PageFactory.initElements(driver, ClickNavCategory.class);
		 ClickNavCategory.ClickCatEditLogo.click();
//		 Thread.sleep(2000);
//	 ClickNavCategory.ClickCatEditDropDown.click();
	 Thread.sleep(2000);
	 ClickNavCategory.ClickCatUpdateBtn.click();
	 Thread.sleep(2000);
	 ClickNavCategory.ClickCatSuccessBtn.click();

		 
	 }
	 //Delete
	 @Test (priority=(2))
	 public void DeleteCategory() throws InterruptedException {
		 Thread.sleep(2000);
		 PageFactory.initElements(driver, ClickNavCategory.class);
		 ClickNavCategory.ClickCatDeleteBtn.click();
		 Thread.sleep(2000);
		 ClickNavCategory.ClickCatDeleteConfirmBtn.click();
		 Thread.sleep(2000);
         ClickNavCategory.ClickCatDeleteSuccessBtn.click(); 
	 }
}
