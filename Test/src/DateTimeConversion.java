import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeConversion {

	public static void main(String[] args) {
		
		DateTime dt = new DateTime();
		System.out.println(dt);
		
		String date="09/04/2017";
		
		String time=formatTime("11:52:56","AM");
		 
		String timezone="IRE";
		String dateAndTime = date+" "+time;
		DateTimeFormatter formatterInput = DateTimeFormat.forPattern( "MM/dd/yyyy HH:mm:ss" );
		
		DateTimeZone timeZoneAs = null; 
		
		if(timezone.equals("AUS")){ 
			timeZoneAs = DateTimeZone.forID( "Australia/Sydney" ); 
		}else if (timezone.equals("UK")) {
			timeZoneAs = DateTimeZone.forID( "Europe/London" );
		}
		else if (timezone.equals("IRE")) {
			timeZoneAs = DateTimeZone.forID( "Europe/Dublin" );
		}
		
		DateTime dateTimeAs = formatterInput.withZone( timeZoneAs ).parseDateTime( dateAndTime );

		/*DateTimeZone timeZoneAus = DateTimeZone.forID( "Australia/Sydney" );
		DateTime dateTimeAus = dt.withZone( timeZoneAus );
		System.out.println(dateTimeAus); */
		
		DateTimeZone timeZoneIndia = DateTimeZone.forID( "Asia/Kolkata" );
		DateTime dateTimeIndia = dateTimeAs.withZone( timeZoneIndia );
		String istTime=dateTimeIndia.toString().split("T")[1];
		
		System.out.println(istTime.split(":")[0]+":"+istTime.split(":")[1]+" IST"); 

	}
	
	public static String formatTime(String time,String format){
		String cTime = null;
		if(format.equals("PM")){
			String hh=String.valueOf((Integer.parseInt(time.split(":")[0])+12));
			cTime=hh+":"+time.split(":")[1]+":"+time.split(":")[2];
		}else{
			cTime=time;
		}
		return cTime;
		
	}

}
