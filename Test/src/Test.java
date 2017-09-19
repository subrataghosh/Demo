import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Test {

	public static void main(String[] args) {
		Date date = new Date();
		// Date usdate = new Date("Wed Jul 30 10:21:52 CST 2008");
		System.out.println("current date:" + date);
		// System.out.println("current usdate:"+usdate);

		DateFormat istFormat = new SimpleDateFormat();
		DateFormat gmtFormat = new SimpleDateFormat();
		TimeZone gmtTime = TimeZone.getTimeZone("CST");
		TimeZone istTime = TimeZone.getTimeZone("IST");

		istFormat.setTimeZone(gmtTime);
		gmtFormat.setTimeZone(istTime);
		System.out.println("CST Time: " + istFormat.format(date));
		System.out.println("IST Time: " + gmtFormat.format(date));

	
	}

	public String getIST() {
		Date date = new Date();
		DateFormat istFormat = new SimpleDateFormat();
		DateFormat gmtFormat = new SimpleDateFormat();
		TimeZone gmtTime = TimeZone.getTimeZone("CST");
		TimeZone istTime = TimeZone.getTimeZone("IST");
		gmtFormat.setTimeZone(istTime);
		return gmtFormat.format(date);
	}

}

	
	
	
	
	
	
	
	
	
	
	
	/*public static void convert(Date dt) {
	    // This prints: Date with default formatter: 2013-03-14 22:00:12 PDT
	    // As my machine is in PDT time zone
	    System.out.println("Date with default formatter: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").format(dt));

	    // This prints: Date with IST time zone formatter: 2013-03-15 10:30:12 GMT+05:30
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
	    TimeZone tz = TimeZone.getTimeZone("GMT+0530");
	    sdf.setTimeZone(tz);
	    String dateIST = sdf.format(dt);
	    System.out.println("Date with IST time zone formatter: " + dateIST);

	    // This prints: Date CST time zone formatter: 2013-03-15 00:00:12 CDT        
	    tz = TimeZone.getTimeZone("CST");
	    sdf.setTimeZone(tz);
	    System.out.println("Date CST time zone formatter: " + sdf.format(dt));
	}*/


