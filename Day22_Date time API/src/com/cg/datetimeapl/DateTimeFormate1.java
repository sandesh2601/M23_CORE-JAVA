package com.cg.datetimeapl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormate1 {

	public static void main(String[] args) {
		LocalDateTime datetime=LocalDateTime.now();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String var=datetime.format(df);
		System.out.println(var);
	}

}