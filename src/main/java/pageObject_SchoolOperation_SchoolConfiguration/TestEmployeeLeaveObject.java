package pageObject_SchoolOperation_SchoolConfiguration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestEmployeeLeaveObject {

@FindBy(id="nav-profile-tab")
public static WebElement EmployeeLeaveBtn; 

@FindBy(xpath = "//*[@id=\"employee_leave\"]/div[1]/div[2]/div[4]/button")
public static WebElement EmployeeLeaveAddBtn;

@FindBy(id="nc-name1")
public static WebElement EmployeeLeaveType;

@FindBy(id="nc-name2")
public static WebElement EmployeeLeaveNoOfDays;

@FindBy(xpath = "//*[@id=\"employee_leave_add_new\"]/div/div/div[2]/div[2]/div[2]/textarea")
public static WebElement EmloyeeLeaveDiscription;

@FindBy(xpath="//*[@id=\"employee_leave_add_new\"]/div/div/div[3]/button[2]")
public static WebElement EmployeeCreateBtn;

@FindBy(xpath="/html/body/div[40]/div/div[4]/div/button")
public static WebElement SuccessMsg;
//delete request object
@FindBy(css = "#DataTables_Table_1 > tbody > tr > td:nth-child(5) > div.delete_text.delete_year > svg")
public static WebElement DeleteRequest;

@FindBy(xpath = "/html/body/div[40]/div/div[3]/div[2]/button")
public static WebElement ConfirmationMsg;

//edit request page
@FindBy(css="#DataTables_Table_1 > tbody > tr > td:nth-child(5) > div.edit_text.edit > svg")
public static WebElement ClickEditLogo;
//@FindBy(xpath = "//*[@id=\"edit_leave_add_new\"]/div/div/div[3]/button[2]")
//public static WebElement UpDateEmployee;
@FindBy(css = "#nc-name2")
public static WebElement EditLeaveType;
@FindBy(css = "#nc-name3")
public static WebElement EditNoOfDays;
@FindBy(xpath = "//*[@id=\"edit_leave_add_new\"]/div/div/div[2]/div[2]/div[2]/textarea")
public static WebElement Editdescription;
@FindBy(xpath = "//*[@id=\"edit_leave_add_new\"]/div/div/div[3]/button[2]")
public static WebElement EditUpdateBtn;
@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
public static WebElement EditSuccessMsg;
@FindBy(xpath = "/html/body/div[40]/div/div[4]/div/button")
public static WebElement DeleteSucessMsg;



}

