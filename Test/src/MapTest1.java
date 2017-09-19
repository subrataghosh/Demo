import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class MapTest1 {

	public static void main(String[] args) {
	
		//HashMap m=new HashMap();
		/*IdentityHashMap m=new IdentityHashMap();
		String i1=new String("id");
		String i2=new String("webId");
		m.put(i1, "a");
		m.put(i2, "b");
		System.out.println(m);
		*/
		JSONArray json = new JSONArray();
		for (int i = 0; i <2; i++) {
			
		}
		
		JSONObject jo = new JSONObject();
		jo.put("firstName", "John");
		jo.put("lastName", "Doe");
		
		
		json.add(jo);
		System.out.println(json);

	}

}
