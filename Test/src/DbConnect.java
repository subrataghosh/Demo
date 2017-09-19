
import java.sql.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

class DbConnect {
	public static void main(String args[]) throws ClassNotFoundException, SQLException { 
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=null;
		JSONArray json = new JSONArray();
		
		try {
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			//Statement stmt = con.createStatement();
			//ResultSet rs = stmt.executeQuery("select * from test where BranchId=1"); //and IsEdited=0
			
			PreparedStatement stmt=con.prepareStatement("select * from test where BranchId=1");  
			ResultSet rs=stmt.executeQuery();  
			
			while (rs.next()){
				JSONObject jo = new JSONObject();
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
				jo.put("id", String.valueOf(rs.getInt(1)));
				jo.put("Name", rs.getString(2) );
				jo.put("BranchId", rs.getString(3) );
				json.add(jo);
			}
			//con.commit();
			System.out.println(json);
			/*PreparedStatement stmt1=con.prepareStatement("insert into Emp values(?,?)");  
			stmt1.setInt(1,101);//1 specifies the first parameter in the query  
			stmt1.setString(2,"Ratan");  
			  
			int i=stmt1.executeUpdate();  
			System.out.println(i+" records inserted");  */
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			con.close();
		}
	}
}