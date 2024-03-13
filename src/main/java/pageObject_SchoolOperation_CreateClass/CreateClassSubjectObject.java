package pageObject_SchoolOperation_CreateClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateClassSubjectObject {
	@FindBy(css = "#DataTables_Table_8 > tbody > tr:nth-child(1) > td:nth-child(4) > div.delete_text.delete_sub > svg")
	public static WebElement ClickDeleteLogo;
	@FindBy(xpath = "//*[@id=\"delete_sub\"]/div/div/div[3]/button[2]")
	public static WebElement DeleteConfirmaation;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement SuccessBtn;

}
