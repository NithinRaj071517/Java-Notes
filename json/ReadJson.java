package json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;

public class ReadJson {

	public static void main(String[] args) throws IOException {



		HashMap<Integer, String> data = new HashMap<Integer, String>();
		data.put(1, "Login");
		data.put(2, "Checkout");
		data.put(3, "Logout");
		JSONObject jsonMap=new JSONObject(data);


		JSONObject json=new JSONObject();
		json.put("Name","Nithin");
		json.put("Age", "28");
		
		
		JSONArray arr=new JSONArray();
		arr.put("Chennai");
		arr.put("Banglore");

		json.put("Location",arr);

		FileWriter fw1=new FileWriter("sample.json");
		fw1.write(json.toString());
		fw1.close();
		FileWriter fw2=new FileWriter("sample1.json");
		fw2.write(jsonMap.toString());
		fw2.close();
		System.out.println("Json created");
	}
}
