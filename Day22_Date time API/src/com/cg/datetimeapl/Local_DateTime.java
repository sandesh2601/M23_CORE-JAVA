package com.cg.datetimeapl;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Local_DateTime {

	public static void main(String[] args) {
		//LocalDate l=LocalDate.now();
		//LocalTime t=LocalTime.now();
		LocalDateTime dt=LocalDateTime.now();
		LocalDate d=LocalDate.of(2022,Month.AUGUST ,28);
		//System.out.println(l);
		//System.out.println(t);
		System.out.println(dt);
		System.out.println(d);
		
		}

}