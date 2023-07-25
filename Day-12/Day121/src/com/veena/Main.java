package com.veena;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		LocalTime time= LocalTime.now();
		System.out.println(time);
		
		LocalDate y=date.minusDays(1);
		LocalDate t= y.plusDays(2);

		System.out.println(y);
		System.out.println(t);
		DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime current = LocalDateTime.now();
		System.out.println("current date and time in default format: "+ current);
		String udf= current.format(formatObj);
	}

}
