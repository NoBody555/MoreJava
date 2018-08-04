import java.text.SimpleDateFormat;
import java.util.Date;

public class DateD {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d.toString());
		System.out.println(d.getTime());
		System.out.println(d.getMonth());
		System.out.println(d.getDate());
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	
	System.out.println(sdf.format(d));
	SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
	System.out.println(sd.format(d));
	}
}
