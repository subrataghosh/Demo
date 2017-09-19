import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo1 {
	
	public static void main(String[] args) throws ParseException {
		// int i=new Integer(10);
		String dateStr = "Mon Apr 24 17:35:24 IST 2017";
		// String dateStr = "Mon Jun 18 00:00:00 IST 2012";
		DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		Date date = (Date) formatter.parse(dateStr);
		System.out.println(date);

		Date d = new Date();
		System.out.println(d);

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		String formatedDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/"+ cal.get(Calendar.YEAR);
		System.out.println("formatedDate : " + formatedDate);

		cal.setTime(d);
		String formatedDate1 = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/"+ cal.get(Calendar.YEAR);
		System.out.println("formatedDate : " + formatedDate1);

		System.out.println(formatedDate.equals(formatedDate1));

	}
}
