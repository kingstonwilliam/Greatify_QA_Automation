package JsonPractice;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.GreatifyLoginPageObject;

public class JasonLoginPractice {
	public static WebDriver driver;
	@BeforeSuite
void browserLauncher() throws IOException, ParseException {
		
		
		
		 driver =new ChromeDriver();
		
}
	@Test(dataProvider="dp")
	void login(String data) {
		String users[]=data.split(",");
		driver.get("https://heycampus.site/super-admin/login");
		PageFactory.initElements(driver, GreatifyLoginPageObject.class);
		GreatifyLoginPageObject.userName.sendKeys((users[0]));//username
		GreatifyLoginPageObject.passWord.sendKeys((users[1]));//password
		GreatifyLoginPageObject.loginbtn.click();
	}
	@DataProvider(name="dp")
	public String[] readLoginCredential() throws IOException, ParseException {
		JSONParser jsonparser= new JSONParser();
		FileReader reader= new FileReader(".\\Jasonfile\\login.json");
		Object obj=jsonparser.parse(reader);
		JSONObject empjsonobj=(JSONObject)obj;
		JSONArray userloginsArray=(JSONArray) empjsonobj.get("userlogins");
		
		String arr[]=new String[userloginsArray.size()];
		
		for(int i=0;i<userloginsArray.size();i++) {
			JSONObject users=(JSONObject)userloginsArray.get(i);
			String user=(String) users.get("username");
			String pwd=(String) users.get("password");
			arr[i]=user+","+pwd;

		}
		return arr;
	}
	
}
