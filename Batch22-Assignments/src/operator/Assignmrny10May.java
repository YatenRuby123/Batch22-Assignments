package operator;
import java.util.*;
import java.text.*;



public class Assignmrny10May {

		  
	public static void main(String[] args)throws Exception {
		 long yourmilliseconds = 1462928931995L;
		SimpleDateFormat sdf = new SimpleDateFormat("E MMM d HH:mm:ss z  yyyy");
		 
		Date resultdate = new Date(yourmilliseconds);
		System.out.println(sdf.format(resultdate));  } 
		}    



	

//public static void main(String[] args){	
//	
//	
//	String x = "1462928931995";
//
//	long millisecond = 1462928931995L;
//	Instant instant = Instant.ofEpochSecond( millisecond );
//	ZonedDateTime zdt = ZonedDateTime.ofInstant ( instant , ZoneOffset.UTC);
//
//	DateTimeFormatter formatter = DateTimeFormatter.ofPattern ( "HH:mm:ss:SSS" );
//	String output = formatter.format ( zdt );
//
//	System.out.println ( "milliseconds: " + millisecond +  "\n"  + " instant: " + instant + " "+ output );
//	
//	
//			DateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
//
//			long milliSeconds= Long.parseLong(x);
//			System.out.println(milliSeconds);
//
//			Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
//			calendar.setTimeInMillis(milliSeconds);
//				
//			DateFormat dF = DateFormat.getDateInstance(DateFormat.SHORT);
//			System.out.println(dF.format(calendar.getTime())); 
//			calendar.add(Calendar.MONTH, -2 );
//			long newTime = calendar.getTimeInMillis();
//	}
//}	



