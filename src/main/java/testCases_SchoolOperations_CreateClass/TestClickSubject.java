package testCases_SchoolOperations_CreateClass;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonFunction.CommonFunction;
import pageObject_SchoolOperation_CreateClass.ClickClass;
import pageObject_SchoolOperation_CreateClass.CreateClassSubjectObject;

public class TestClickSubject extends CommonFunction {

	@Test(priority = (0), dataProvider = "CreateClass")
	public void AddSubject(String datas) throws InterruptedException {
		String Users[] = datas.split(",");
		PageFactory.initElements(driver, ClickClass.class);
		Thread.sleep(3000);
		ClickClass.ClickSubjectBtn.click();
		Thread.sleep(2000);
		ClickClass.ClickAddSubject.click();
		Thread.sleep(2000);
		ClickClass.EnterSubjectId.sendKeys(Users[7]);
		Thread.sleep(2000);
		ClickClass.EnterSubjectName.sendKeys(Users[8]);
		Thread.sleep(2000);
		ClickClass.CreatenewSubBtn.click();
		Thread.sleep(2000);
		ClickClass.SuccessBtn.click();
	}

	@DataProvider(name = "CreateClass")
	public String[] ReadCreateClass() throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jasonfile\\CreateClass.json");
		Object obj = jsonparser.parse(reader);
		JSONObject dashBoardloginObj = (JSONObject) obj;
		JSONArray EmployeeWorkingTimeArray = (JSONArray) dashBoardloginObj.get("CreateClass");
		String arr[] = new String[EmployeeWorkingTimeArray.size()];
		for (int i = 0; i < EmployeeWorkingTimeArray.size(); i++) {
			JSONObject empedit = (JSONObject) EmployeeWorkingTimeArray.get(i);
			String StandardName1 = (String) empedit.get("StandardName1");
			String SectionName1 = (String) empedit.get("SectionName1");
			String StandardName2 = (String) empedit.get("StandardName2");
			String SectionName2 = (String) empedit.get("SectionName2");
			String primary = (String) empedit.get("primary");
			String Selectclass = (String) empedit.get("Selectclass");
			String Selectclass2 = (String) empedit.get("Selectclass2");
			String Id1 = (String) empedit.get("Id1");
			String Language1 = (String) empedit.get("Language1");
			String Id2 = (String) empedit.get("Id2");
			String Languge2 = (String) empedit.get("Languge2");

			arr[i] = StandardName1 + "," + SectionName1 + "," + StandardName2 + "," + SectionName2 + "," + primary + ","
					+ Selectclass + "," + Selectclass2 + "," + Id1 + "," + Language1 + "," + Id2 + "," + Languge2;
		}
		return arr;
	}

	@Test(priority = (1), dataProvider = "CreateClass")
	public void editSubject(String datas) throws InterruptedException {
		String Users[] = datas.split(",");
		PageFactory.initElements(driver, ClickClass.class);
		Thread.sleep(2000);
		ClickClass.ClickSubEditLogo.click();
		Thread.sleep(2000);
		// ClickClass.ClickSubEditInputId.click();
		ClickClass.ClickSubEditInputId.clear();
		ClickClass.ClickSubEditInputId.sendKeys(Users[9]);
		Thread.sleep(2000);
		ClickClass.ClickSubEditInputSubjectName.clear();
		ClickClass.ClickSubEditInputSubjectName.sendKeys(Users[10]);
		ClickClass.ClickSubEditUpdateBtn.click();
		Thread.sleep(2000);
		ClickClass.ClickSubEditUpdateSuccessBtn.click();
	}

	// Delete
	@Test(priority = (2))
	public void deleteSubject() throws InterruptedException {
		 PageFactory.initElements(driver, CreateClassSubjectObject.class);
		 Thread.sleep(2000);
		 CreateClassSubjectObject.ClickDeleteLogo.click();
			 Thread.sleep(2000);
			 CreateClassSubjectObject.DeleteConfirmaation.click();
			 Thread.sleep(2000);
			 CreateClassSubjectObject.SuccessBtn.click();
//		WebElement table = driver.findElement(By.xpath("//*[@id=\"DataTables_Table_8\"]"));
//
//		// Get all rows of the table
//		java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));
//		String firstColumnName = rows.get(0).findElement(By.tagName("th")).getText();
//		for (WebElement row : rows) {
//			if (row.findElement(By.tagName("td")).getText().equals("Hindi")) {
//				row.findElement(By.tagName("ClickDeleteLogo")).click();
//				Thread.sleep(2000);
//				CreateClassSubjectObject.DeleteConfirmaation.click();
//				Thread.sleep(2000);
//				CreateClassSubjectObject.SuccessBtn.click();
//				break;
			//}
//}
	}
}
