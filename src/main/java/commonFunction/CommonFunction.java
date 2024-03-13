package commonFunction;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pageObject.GreatifyLoginPageObject;

public class CommonFunction {
	public static ExtentReports extent;
	public static ExtentTest test;
	public static Logger logger = Logger.getLogger(CommonFunction.class);
	public static WebDriver driver = null;
	public static Actions act;

	// public ;
	@BeforeSuite
	public void browserLauncher() throws IOException, ParseException {
		try {

			PropertyConfigurator.configure("log4j.properties");
			ExtentSparkReporter htmlReporter = new ExtentSparkReporter("./GreatifyExtentReport.html");
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			ExtentTest test = extent.createTest("TC001 - open google");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option);
			act = new Actions(driver);
			driver.manage().window().maximize();
			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			test.log(Status.PASS, "Browser Launched Successfully");
		} catch (Exception e) {
			test.log(Status.FAIL, "Error in Launching browser");
		}
	}
//	@AfterSuite
//	public void TearDown() {
//		extent.flush();
//	}
}
