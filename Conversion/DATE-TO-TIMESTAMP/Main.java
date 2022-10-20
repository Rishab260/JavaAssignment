import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  
public class Main
{
	public static void main(String[] args) {
	Long Timestamp = new Long(1633304782);
Date timeD = new Date(Timestamp * 1000);
SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

String Time = sdf.format(timeD);

	}
}
