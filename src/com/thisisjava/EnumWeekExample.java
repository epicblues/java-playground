package com.thisisjava;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		
		Week today = null;
		
		
	
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal == cal2);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일: " + Week.SUNDAY );
		
		if(today == Week.SUNDAY) {
			System.out.println("오늘은 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}

	}

}