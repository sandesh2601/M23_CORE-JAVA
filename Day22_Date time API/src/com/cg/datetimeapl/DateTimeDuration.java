package com.cg.datetimeapl;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDuration {

	public static void main(String[] args) {
		LocalDateTime date1=LocalDateTime.now();
		LocalDateTime date2=date1.plusDays(2);
		System.out.println(date2);
		long df=ChronoUnit.DAYS.between(date1, date2);
		System.out.println(df);

	}

}