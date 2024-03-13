package pageObject_SchoolOperation_TimeTable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditStudentTimeTable {
	@FindBy(css = "#DataTables_Table_0 > tbody > tr:nth-child(1) > td:nth-child(9) > div.edit_text.time_table_edit > svg")
   public static WebElement ClickEditLogo; 
	@FindBy(css="body > div.mani > main > div > div.add-new-style > div.edit_timetable > div.main_tables > div > div.tt-cells.periods.ss.edit_period_div_1.edit_period_div > div.period__details.period_details.period_details_2.period__day-1.\\34 536353231_\\[object.Object\\].edit > img")
	public static WebElement EditPeriodTimeTable1;
	@FindBy(xpath = "//*[@id=\"edit_period\"]/div/div/div[2]/div/div[3]/select/option[3]")
  public static WebElement SelectSubject1;
	@FindBy(xpath = "//*[@id=\"edit_period\"]/div/div/div[3]/button[2]")
  public static WebElement  UpdateBtn1;
	@FindBy(css = "body > div.mani > main > div > div.add-new-style > div.edit_timetable > div.main_tables > div > div.tt-cells.periods.ss.edit_period_div_1.edit_period_div > div.period__details.period_details.period_details_2.period__day-3.\\34 536353233_\\[object.Object\\].edit > img")
  public static WebElement EditPeriodTimeTable2;
	@FindBy(xpath = "//*[@id=\"edit_period\"]/div/div/div[2]/div/div[3]/select/option[3]")
	public static WebElement SelectSubject2;
	@FindBy(xpath = "//*[@id=\"edit_period\"]/div/div/div[3]/button[2]")
	  public static WebElement  UpdateBtn2;
	@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[6]/div[2]/div[2]/button")
	  public static WebElement UpdateTimeTable;
	 @FindBy(xpath = "/html/body/div[6]/div/div[4]/div/button")
      public static WebElement ErrorOkBtn;
	 @FindBy(xpath = "//*[@id=\"edit_period\"]/div/div/div[2]/div/div[3]/select/option[3]")
	 public static WebElement SelectSubject3;
	 @FindBy(xpath = "/html/body/div[6]/div/div[4]/div/button")
	 public static WebElement SuccessOkBtn;
	 //DELETE
	 @FindBy(css = "#DataTables_Table_0 > tbody > tr:nth-child(1) > td:nth-child(9) > div.delete_text.delete_period_config > svg")
	 public static WebElement ClickDeleteLogo;
	 @FindBy(xpath = "/html/body/div[6]/div/div[4]/div[2]/button")
	 public static WebElement DeleteConfirmation;
	 @FindBy(xpath = "/html/body/div[6]/div/div[4]/div/button")
	 public static WebElement DeleteOkBtn;
	 
}
