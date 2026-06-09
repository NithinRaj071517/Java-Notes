//package json;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.HashMap;
//
//import org.json.JSONArray;
//import org.json.JSONObject;
//
//public class WriteJson2 {
//
//	public static void main(String[] args) throws IOException {
//
//		HashMap<String, Long> data = new HashMap<String, Long>();
//		data.put("MSISDN",611999410933);
//		data.put(2, "Checkout");
//		data.put(3, "Logout");
//		JSONObject jsonMap=new JSONObject(data);
//
//		
//		
//		FileWriter fw2=new FileWriter("sample31.json");
//		fw2.write(jsonMap.toString());
//		fw2.close();
//		System.out.println("Json created");
//	}
//}
