package testCases_SchoolOperations_SchoolConfiguration;

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

public class TestAdminLogin extends CommonFunction {
	@Test (dataProvider="DashBoardLogin")
public void adminLogin(String datas) throws AWTException, IOException, InterruptedException {
		 driver.get("https://wwwkidzeeacademycom.heycampus.site/school/login");
		  PageFactory.initElements(driver, LoginGreatifyObject.class);
			// ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
			  //driver.switchTo().window(tabs.get(2));
		  String users[]=datas.split(",");
			  LoginGreatifyObject.userId.sendKeys(users[0]);
			  LoginGreatifyObject.passWord.sendKeys(users[1]);
			  LoginGreatifyObject.subBtn.click();

}
	@DataProvider(name="DashBoardLogin")
	public String[] adminLoginCredential() throws IOException, ParseException {
		JSONParser jsonparser= new JSONParser();
		FileReader reader= new FileReader(".\\Jasonfile\\GreatifyLoginDashBoard2.json");
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
}}
