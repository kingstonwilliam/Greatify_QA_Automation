package PageObject_TeacherAndStaffs_CreateTeacher;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickTeacherObject {
	@FindBy(xpath = "//*[@id=\"employeeManagementSection\"]/p")
    public static WebElement ClickTeacherAndStaff;
	@FindBy(xpath = "//*[@id=\"sideTeacher\"]/a/span")
	public static WebElement ClickTeachers;
	
}
