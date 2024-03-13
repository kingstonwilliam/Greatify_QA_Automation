package pageObject_SchoolOperation_ManageStudentt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentMedicalDetailForm {
	@FindBy(xpath = "//*[@id=\"add_student_continues\"]/div[3]/div[1]/div[1]/div/label")
	public static WebElement HealthConditions;

	@FindBy(xpath = "//*[@id=\"add_student_continues\"]/div[3]/div[3]/div[1]/div/label")
	public static WebElement FoodAllergies;

	@FindBy(xpath = "//*[@id=\"add_student_continues\"]/div[3]/div[5]/div[1]/div/label")
	public static WebElement VaccineAllergies;

	@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[5]/div[4]/div[2]/div[3]/div[7]/div/div/div[1]/label/input")
	public static WebElement EnterName1;

	@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[5]/div[4]/div[2]/div[3]/div[7]/div/div[1]/div[2]/div[1]/label/input")
	public static WebElement EnterDose1;

	@FindBy(linkText = "+ Medication Details")
	public static WebElement addMedicalDose;
	
	@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[5]/div[4]/div[2]/div[3]/div[7]/div/div[2]/div[1]/label/input")
	public static WebElement EnterName2;
	
	@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div[5]/div[4]/div[2]/div[3]/div[7]/div/div[2]/div[2]/div[1]/label/input")
	public static WebElement EnterDose2;
	
	@FindBy(xpath = "//*[@id=\"add_student_continues\"]/div[3]/div[8]/button")
	public static WebElement Continue;
}
