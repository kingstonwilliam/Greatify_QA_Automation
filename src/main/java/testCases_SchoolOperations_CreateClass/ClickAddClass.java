package testCases_SchoolOperations_CreateClass;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonFunction.CommonFunction;
import pageObject_SchoolOperation_CreateClass.ClickClass;

public class ClickAddClass extends CommonFunction {
	
	@Test (priority=(0),dataProvider="CreateClass")
public void CreateAddClass(String datas) throws InterruptedException {
		String Users[]=datas.split(",");
		Thread.sleep(2000);
		PageFactory.initElements(driver, ClickClass.class);
		ClickClass.AddClass.click();
		Thread.sleep(2000);
		ClickClass.EnterStandardName1.sendKeys(Users[0]);	
		ClickClass.EnterSectiondName1.sendKeys(Users[1]);
		ClickClass.ClickAddSection.click();
		Thread.sleep(2000);
		ClickClass.EnterStandardName2.sendKeys(Users[2]);
		ClickClass.EnterSectiondName2.sendKeys(Users[3]);
		ClickClass.ClickCreateBtn.click();
		Thread.sleep(2000);
		ClickClass.SuccessMsg.click();
		
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
				
				arr[i]=StandardName1+","+SectionName1+","+StandardName2+","+SectionName2;
			}
			return arr;
		}
	  @Test(priority=(1))
	  public void DeleteClass() throws InterruptedException {
			PageFactory.initElements(driver, ClickClass.class);
			Thread.sleep(3000);
			ClickClass.DeleteBtn.click();
			Thread.sleep(2000);
			ClickClass.DeleteConfirmationBtn.click();
			Thread.sleep(2000);
             ClickClass.DeleteSuccessMsg.click();
             Thread.sleep(2000);
 			ClickClass.DeleteBtn.click();
 			Thread.sleep(2000);
 			ClickClass.DeleteConfirmationBtn.click();
 			Thread.sleep(2000);
              ClickClass.DeleteSuccessMsg.click();
	  }
}
