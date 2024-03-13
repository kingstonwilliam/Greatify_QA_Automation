package JsonPractice;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JasonTesting {
	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparser= new JSONParser();
		FileReader reader= new FileReader(".\\Jasonfile\\employee.json");
		Object obj=jsonparser.parse(reader);
		JSONObject empjsonobj=(JSONObject)obj;
		
		String fname=(String) empjsonobj.get("firstName");
		String lname=(String) empjsonobj.get("lastName");
		
		System.out.println("first name :"+ fname);
		System.out.println("last name :"+ lname);
		
		JSONArray array=(JSONArray)empjsonobj.get("address");
		
		for(int i=0;i<array.size();i++) {
			JSONObject address=(JSONObject) array.get(i);
			String street=(String)address.get("street");
			String city=(String)address.get("city");
			String state=(String)address.get("state");
			System.out.println("address of "+i);
			System.out.println(street);
			System.out.println(city);
			System.out.println(state);
					
		}

	}
}
