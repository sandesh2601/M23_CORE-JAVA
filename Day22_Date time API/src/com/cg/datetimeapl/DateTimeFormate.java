package com.cg.datetimeapl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormate {

	public static void main(String[] args) {
		String datetime="2022-08-28  00:55";
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime l=LocalDateTime.parse(datetime, df);
		System.out.println(l);
	}

}