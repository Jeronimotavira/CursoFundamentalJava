package Fechas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Formatter;

public class Fechas_01 {

	public static void main(String[] args) {
	
		LocalDate L1=LocalDate.now();
		LocalDate L2=LocalDate.of(2018, 1, 13);
		System.out.println(L2);
		
		//DateTimeFormatter formatter1;
		LocalDate L3=LocalDate.parse("2018-10-10");
		LocalDate L4=LocalDate.parse("10/04/18", DateTimeFormatter.ofPattern("dd/MM/yy"));
		//L3=L3.plus(4,ChronoUnit.MONTHS);
		System.out.println(L3);
		
		LocalTime Lt1=LocalTime.now();
		
		System.out.println(Lt1);
		
		LocalDateTime LDT= LocalDateTime.now();
		System.out.println(LDT);
		
		System.out.println(LDT.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(LDT.format(DateTimeFormatter.ISO_DATE));
		System.out.println(LDT.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(LDT.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(LDT.format(DateTimeFormatter.ofPattern("dd/MM/yy")));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/mm/dd");
		LocalDateTime L5=LocalDateTime.of(2015,10,10,11,22);
		System.out.println(dtf.format(L5));
		Instant istn=Instant.now();
		System.out.println(istn);
		
		Period p=Period.of(2,3, 11);
		System.out.println(p);

		Duration d1=Duration.ofHours(3);
		Duration d2=Duration.ofHours(5);
		
		System.out.println(d1+" - d2:"+d2.toMinutes());
		
		
	}

}
