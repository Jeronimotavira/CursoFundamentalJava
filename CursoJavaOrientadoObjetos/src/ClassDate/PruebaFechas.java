package ClassDate;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class PruebaFechas {

	public static void main(String[] args) {
		//Clase Date
		Date d=new Date();
		System.out.println(d);
		Date d2=new Date(d.getTime()-1000*60*60*24*2);
		System.out.println(d2);
		//clase calendar
		
		Calendar cal=Calendar.getInstance();
		//cal.setTime(d);
		System.out.println("hora : "+cal.get(Calendar.HOUR)+"\nDia del mes : " +cal.get(Calendar.DAY_OF_MONTH));
		
		//formateado de fechas: 
		
		DateFormat df=DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM,new Locale("us","Us"));
		
		//conversion java.sqlDate en java.util.Date
		
		java.sql.Date fsql = new java.sql.Date(100000);
		java.util.Date futil=fsql;
		
		//conversion java.util.Date en java.sqlDate 
		java.util.Date fact = new java.sql.Date(100000);
		java.sql.Date fadatos=new java.sql.Date(fact.getTime());
		

		System.out.println(df.format(d));
	}

}
