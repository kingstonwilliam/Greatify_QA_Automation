package testCases_School_DashBoard_Management_Fee;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonFunction.CommonFunction;
import pageObject_School_DashBoard_ManagementFee.ClickManageFeeCollection;

public class TestManageFeeCollection extends CommonFunction{
	@Test(priority=(0),dataProvider="AddFee")
public void ManageFeeCollection(String datas) throws InterruptedException {
	String user[]= datas.split(",");
		PageFactory.initElements(driver, ClickManageFeeCollection.class);
	Thread.sleep(2000);
	ClickManageFeeCollection.ClickManageFeeCollection.click();
	Thread.sleep(3000);
	ClickManageFeeCollection.ClickManagePayment.click();
	Thread.sleep(4000);
	ClickManageFeeCollection.AddDiscount.click();
	ClickManageFeeCollection.ClickFlat.click();
	ClickManageFeeCollection.EnterAmount1.sendKeys(user[16]);
	Thread.sleep(1000);
	ClickManageFeeCollection.EnterName.sendKeys(user[17]);
	ClickManageFeeCollection.SubmitBtn.click();
	Thread.sleep(1000);
	ClickManageFeeCollection.EnterAmount2.sendKeys(user[18]);
	ClickManageFeeCollection.PaymentMode1.click();
	ClickManageFeeCollection.AddAnotherPayment.click();
	Thread.sleep(1000);
	ClickManageFeeCollection.EnterAmount3.sendKeys(user[19]);
	ClickManageFeeCollection.PaymentMode2.click();
	Thread.sleep(1000);
	ClickManageFeeCollection.UpdatePayment.click();
	Thread.sleep(13000);
	ClickManageFeeCollection.UpdateSuccessMsg.click();
	Thread.sleep(5000);
	ClickManageFeeCollection.ClickAuditTrail.click();
	
	
	
}

@DataProvider(name="AddFee")
public String[] ReadCreateClass() throws IOException, ParseException {
	JSONParser jsonparser= new JSONParser();
	FileReader reader= new FileReader(".\\Jasonfile\\AddFee.json");
	Object obj=jsonparser.parse(reader);
	JSONObject dashBoardloginObj=(JSONObject)obj;
	JSONArray EmployeeWorkingTimeArray=(JSONArray) dashBoardloginObj.get("AddFee");
	String arr[]=new String[EmployeeWorkingTimeArray.size()];	
	for(int i=0;i<EmployeeWorkingTimeArray.size();i++) {
		JSONObject empedit=(JSONObject)EmployeeWorkingTimeArray.get(i);
		String FeeName=(String) empedit.get("FeeName");
		String Amount=(String) empedit.get("Amount");
		String Choose=(String) empedit.get("Choose");
		String GstPercentage=(String) empedit.get("GstPercentage");
		String PF=(String) empedit.get("PF");
		String SplitAmount=(String) empedit.get("SplitAmount");
		String Balance=(String) empedit.get("Balance");
		String BalanceAmount=(String) empedit.get("BalanceAmount");
		String FeeName2=(String) empedit.get("FeeName2");
		String FeeAmount=(String) empedit.get("FeeAmount");
		String ChooseDate=(String) empedit.get("ChooseDate");
		String EnterGst=(String) empedit.get("EnterGst");
		String DiscountName=(String) empedit.get("DiscountName");
		String DiscountPercentage=(String) empedit.get("DiscountPercentage");
		String EnterAmount=(String) empedit.get("EnterAmount");
		String ChooseDiscountDate=(String) empedit.get("ChooseDiscountDate");
		String EnterDiscountAmount=(String) empedit.get("EnterDiscountAmount");
		String ApprovedName=(String) empedit.get("ApprovedName");
		String EnterAmount1=(String) empedit.get("EnterAmount1");
		String EnterAmount2=(String) empedit.get("EnterAmount2");

		arr[i]=FeeName+","+Amount+","+Choose+","+GstPercentage+","+PF+","+SplitAmount+","+Balance+","+BalanceAmount+","+FeeName2
				+","+FeeAmount+","+ChooseDate+","+EnterGst+","+DiscountName+","+DiscountPercentage+","+EnterAmount+","+ChooseDiscountDate
				+","+EnterDiscountAmount+","+ApprovedName+","+EnterAmount1+","+EnterAmount2;
	}
	return arr;
}
}
