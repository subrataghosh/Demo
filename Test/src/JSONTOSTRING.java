import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONTOSTRING {

	public static void main(String[] args) throws ParseException {
		String s="[{ \"id\": \"1\",\"webId\": \"201\"},{ \"id\": \"2\",\"webId\": \"202\"},{ \"id\":\"3\",\"webId\": \"203\"}]";
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(s);
		JSONArray jsonarray = (JSONArray) obj;
		List<String> webIdList=new ArrayList<>();
		List<String> idList=new ArrayList<>();
        System.out.println(jsonarray); 
        for (int i = 0; i < jsonarray.size(); i++) {
			JSONObject natObject = (JSONObject) jsonarray.get(i);
			Map<String, String> map = (Map<String, String>) natObject;
			String st = map.get("webId").toString();
			webIdList.add(st);
			String st1 = map.get("id").toString();
			idList.add(st1);
        }
        System.out.println(webIdList); 
        System.out.println(idList); 
        
       /*JSONArray json = new JSONArray();
		for (int i = 0; i <2; i++) {
			JSONObject jo = new JSONObject();
			jo.put("firstName", "John");
			jo.put("lastName", "Doe");
			json.add(jo);
		}
		System.out.println(json);*/
	}

}
