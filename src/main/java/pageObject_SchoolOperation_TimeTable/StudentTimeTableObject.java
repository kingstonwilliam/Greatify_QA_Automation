package pageObject_SchoolOperation_TimeTable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentTimeTableObject {
	@FindBy(xpath = "/html/body/div[1]/nav/div[1]/div/ul/li[2]/ul/li[5]/a/span")
public static WebElement TimeTablebNav;
@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[1]/div[1]/div[2]/div[2]/button")
public static WebElement ConFigTimeTable;
@FindBy(xpath = "//*[@id=\"categoryies\"]/option[2]")
public  static WebElement ChooseCategory;
@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[3]/div[3]/div[2]/div[3]/div[2]/div[1]/label")
public static WebElement  CheckBoxes1;
@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[3]/div[3]/div[2]/div[3]/div[2]/div[2]/label")
public static WebElement CheckBoxes2;
@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[3]/div[3]/div[2]/div[3]/div[2]/div[3]/label")
public static WebElement CheckBoxes3;
@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[3]/div[3]/div[2]/div[3]/div[2]/div[4]/label")
public static WebElement CheckBoxes4;
@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[3]/div[3]/div[2]/div[3]/div[2]/div[5]/label")
public static WebElement CheckBoxes5;
@FindBy(xpath = "//*[@id=\"schoolStartTime\"]")
public static WebElement SchoolStartTime;
@FindBy(xpath = "//*[@id=\"totalPeriod\"]")
public static WebElement TotalPeriod;
@FindBy(xpath = "//*[@id=\"periodDuration\"]")
public static WebElement DurationOfEachPeriod;
@FindBy(xpath = "//*[@id=\"interval1\"]/option[2]")
public static WebElement BreakType1;
@FindBy(xpath = "//*[@id=\"intervalMins1\"]")
public static WebElement BreakMin1;
@FindBy(xpath = "//*[@id=\"intervalAfter1\"]/option[3]")
public static WebElement  breakComesAtfter1;
@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[3]/div[3]/div[4]/div[2]/p")
public static WebElement AddBreak;
@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[3]/div[3]/div[4]/div[3]/p")
public static WebElement AddBreak2;
@FindBy(xpath = "//*[@id=\"interval2\"]/option[3]")
public static WebElement BreakType2;
@FindBy(id = "intervalMins2")
public static WebElement BreakMin2;
@FindBy(xpath = "//*[@id=\"intervalAfter2\"]/option[5]")
public static WebElement  breakComesAtfter2;
@FindBy(xpath = "//*[@id=\"interval3\"]/option[2]")
public static WebElement BreakType3;
@FindBy(id = "intervalMins3")
public static WebElement BreakMin3;
@FindBy(xpath = "//*[@id=\"intervalAfter3\"]/option[7]")
public static WebElement  breakComesAtfter3;
@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[3]/div[3]/div[5]/button")
public static WebElement ClickConfigureTimeTable;
@FindBy(xpath = "//*[@id=\"buildTimetable\"]")
public static WebElement BuildTimeTable;
@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[4]/div[3]/div[1]/div[2]/button")
public static WebElement PublishTimeTable;
@FindBy(xpath = "/html/body/div[6]/div/div[4]/div/button")
public static WebElement SuccessMsg;

}