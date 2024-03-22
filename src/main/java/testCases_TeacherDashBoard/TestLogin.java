package testCases_TeacherDashBoard;

import java.awt.AWTException;
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
import pageObject.LoginGreatifyObject;
import pageObject_TeacherLogin.TeacherLogin;

public class TestLogin extends CommonFunction{
	@Test (dataProvider="DashBoardLogin")
	public void adminLogin(String datas) throws AWTException, IOException, InterruptedException {
			 driver.get("https://wwwkidzeeacademycom.heycampus.site/teacher/login");
			  PageFactory.initElements(driver, TeacherLogin.class);
				// ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
				  //driver.switchTo().window(tabs.get(2));
			  String users[]=datas.split(",");
			  TeacherLogin.MobileNo.sendKeys(users[0]);
			  Thread.sleep(2000);
			  TeacherLogin.SendOtp.click();
				 
	}
		@DataProvider(name="DashBoardLogin")
		public String[] adminLoginCredential() throws IOException, ParseException {
			JSONParser jsonparser= new JSONParser();
			FileReader reader= new FileReader(".\\Jasonfile\\GreatifyTeacherLogin.json");
			Object obj=jsonparser.parse(reader);
			JSONObject dashBoardloginObj=(JSONObject)obj;
			JSONArray DashBoardLoginArray=(JSONArray) dashBoardloginObj.get("TeacherLogin");
			String arr[]=new String[DashBoardLoginArray.size()];	
			for(int i=0;i<DashBoardLoginArray.size();i++) {
				JSONObject users=(JSONObject)DashBoardLoginArray.get(i);
				String MobileNo=(String) users.get("MobileNo");
				arr[i]=MobileNo;
			}
			return arr;
	}
}
