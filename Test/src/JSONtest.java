import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.response.Response;
public class JSONtest {

	public static void main(String[] args) throws ParseException { 
		String token = getAccessToken();
		Map<String, String> header = new HashMap<String, String>();
		header.put("Authorization", token);
		
		Response res = given().headers(header).when().get("https://sndbx.reltio.com/reltio/api/760BwaaOcr6yhhU/configuration");
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(res.body().asString());
		JSONObject jsonObject = (JSONObject) obj;
		JSONArray jsonarray = (JSONArray) jsonObject.get("entityTypes");
        String entityTypeName=null;
		for (int i = 0; i < jsonarray.size(); i++) {
			JSONObject natObject = (JSONObject) jsonarray.get(i);
			Map<String, String> map = (Map<String, String>) natObject;
			String st = map.get("uri").toString();
			//System.out.println(st + "," + map.keySet().contains("extendsTypeURI"));
			if (st.endsWith("Organization") && map.keySet().contains("extendsTypeURI")) {
				String st1=map.get("extendsTypeURI").toString();
				entityTypeName =st1.substring(st1.lastIndexOf("/")+1); 
				break;
			}
		}
		System.out.println(entityTypeName); 
            
	}
	
	public static String getAccessToken(){
		Map<String, String> header=new HashMap<String, String>();
		header.put("Authorization", "Basic cmVsdGlvX3VpOm1ha2l0YQ==");
		Response res=given().headers(header).when().post("https://auth.reltio.com/oauth/token?username=rudradip.misra&password=RudradiP&grant_type=password");
	    String body=res.body().asString();
	    String st[]=body.split(",");
	    String st1[]=st[0].split(":");
	    String token="bearer "+st1[1].replace('"', ' ').trim();
		return token;
		
	}
	

}
