package pageObject_SchoolOperation_CreateClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickNavCategory {
	@FindBy(xpath = "//*[@id=\"nav-category-tab\"]")
	public static WebElement ClickNavCat;
	@FindBy(xpath = "//*[@id=\"nav-category\"]/div[1]/div[2]/div[4]/button[2]")
	public static WebElement CreateCat;
	@FindBy(xpath = "/html/body/div[13]/div/div/div[2]/div/div[1]/label/input")
	public static WebElement ClickCategoryName;
	@FindBy(xpath = "//*[@id=\"add_category\"]/div/div/div[2]/div/div[2]/span/span[1]/span/ul/li/input")
	public static WebElement ClickSelectClass;
	@FindBy(xpath = "//*[@id=\"add_category\"]/div/div/div[3]/button[2]")
	public static WebElement CreateClass;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement OkMsg;
	
	// edit
	@FindBy(css = "#DataTables_Table_7 > tbody > tr.even > td:nth-child(5) > svg.edit-category")
	public static WebElement ClickCatEditLogo;
	@FindBy(id = "ns-name1")
	public static WebElement ClickCatEditName;
	@FindBy(xpath = "/html/body/div[14]/div/div/div[2]/div/div[2]/span/span[1]/span/ul")
	public static WebElement ClickCatEditDropDown;
	@FindBy(xpath = "//*[@id=\"edit_category\"]/div/div/div[3]/button[2]")
	public static WebElement ClickCatUpdateBtn;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement ClickCatSuccessBtn;
	
	//delete
	@FindBy(css = "#DataTables_Table_7 > tbody > tr.even > td:nth-child(5) > svg.delete-add.delete_category")
	public static WebElement ClickCatDeleteBtn;
	@FindBy(xpath = "//*[@id=\"delete_category\"]/div/div/div[3]/button[2]")
	public static WebElement ClickCatDeleteConfirmBtn;
	@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
	public static WebElement ClickCatDeleteSuccessBtn;
}
