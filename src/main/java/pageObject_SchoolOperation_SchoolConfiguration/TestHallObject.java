package pageObject_SchoolOperation_SchoolConfiguration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestHallObject {
	@FindBy(xpath = "/html/body/div[1]/main/div[2]/div[1]/div/div/div[1]/div/nav/div/button[6]")
public static  WebElement ClickHall;
	@FindBy(xpath="//*[@id=\"hall_list\"]/div[1]/div[2]/div[4]/button[2]")
	public  static WebElement AddHall;
	@FindBy(css = "#nc-name9")
	public static WebElement EnterHallName;
	@FindBy(xpath = "//*[@id=\"add_hall\"]/div/div/div[3]/button[2]")
	public static WebElement ClickCreateBtn;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement SuccessMsg;
	
	//Edit Message
	@FindBy(css = "#DataTables_Table_5 > tbody > tr.odd > td:nth-child(4) > div.edit_text.edit > svg")
	public  static WebElement EditIcon;
	@FindBy(id = "nc-name11")
	public static WebElement EditInputHallName;
	@FindBy(xpath = "//*[@id=\"edit_hall\"]/div/div/div[3]/button[2]")
	public static WebElement ClickEditCreateBtn;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement  ClickEditSucccessBtn;
	
	//delete hall
	@FindBy(css = "#DataTables_Table_5 > tbody > tr > td:nth-child(4) > div.delete_text.delete")
	public static WebElement DeleteHall;
	@FindBy(xpath = "/html/body/div[40]/div/div[3]/div[2]/button")
	public static WebElement DeleteSuccessMsg;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement SuccessfullyDeleted;
	
	
}
