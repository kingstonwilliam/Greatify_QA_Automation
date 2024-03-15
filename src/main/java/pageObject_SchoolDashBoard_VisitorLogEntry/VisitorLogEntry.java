package pageObject_SchoolDashBoard_VisitorLogEntry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VisitorLogEntry{
	
	@FindBy(xpath = "//*[@id=\"sideVisitors\"]/a/p")
    public static WebElement ClickVisitorLog;
  
	@FindBy(xpath = "//*[@id=\"pills-home\"]/div[1]/div[2]/div[2]/button")
	public static WebElement ClickNewEntry;
	
	@FindBy(xpath = "//*[@id=\"add_fee\"]/div/div/div[2]/div/div[1]/div[1]/select/option[1]")
	public static WebElement TypeOfVisitor;
	
	@FindBy(xpath = "//*[@id=\"add_fee\"]/div/div/div[2]/div/div[1]/div[2]/label/input")
	public static WebElement ParentsName;
	
	@FindBy(xpath = "//*[@id=\"add_fee\"]/div/div/div[2]/div/div[2]/div[1]/label/input")
	public static WebElement MobileNumber;
	
	@FindBy(xpath = "//*[@id=\"add_fee\"]/div/div/div[2]/div/div[2]/div[3]/label/input")
	public static WebElement VehicleNumber;
	
	@FindBy(xpath = "//*[@id=\"add_fee\"]/div/div/div[2]/div/div[3]/div[1]/label/input")
	public static WebElement Address;
	
	@FindBy(xpath = "//*[@id=\"add_fee\"]/div/div/div[2]/div/div[3]/div[2]/label/input")
	public static WebElement CityName;
	
	@FindBy(xpath = "//*[@id=\"add_fee\"]/div/div/div[2]/div/div[4]/div[2]/div[1]/select/option[1]")
	public static WebElement Class;
	
	@FindBy(xpath = "//*[@id=\"add_fee\"]/div/div/div[2]/div/div[4]/div[2]/div[2]/div[1]/select/option")
	public static WebElement Sec;
	@FindBy(xpath = "//*[@id=\"add_fee\"]/div/div/div[2]/div/div[4]/div[2]/div[2]/div[2]/select/option[2]")
	public static WebElement StudentName;
	
	@FindBy(xpath = "//*[@id=\"add_fee\"]/div/div/div[2]/div/div[5]/div[1]/select/option[4]")
	public static WebElement PurposeOfVisit;
	
	@FindBy(xpath = "//*[@id=\"add_fee\"]/div/div/div[2]/div/div[5]/div[3]/label/input")
	public static WebElement VisitBdgeNumber;
	
	@FindBy(xpath = "//*[@id=\"visitor_in_time\"]")
	public static WebElement ChooseTime;
	
	@FindBy(xpath = "//*[@id=\"visitor_out_time\"]")
	public static WebElement CheckOutTime;
	
	@FindBy(xpath = "//*/div/div/div[3]/button[2]")
	public static WebElement Create;
	
	@FindBy(xpath = "/html/body/div[5]/div/div[4]/div/button")
	public static WebElement success;
	
}
