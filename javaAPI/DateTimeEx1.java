package javaAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeEx1 {
	
	public static void main(String[] args) {
		
		// 날짜
		LocalDate currentDate =  LocalDate.now();
		System.out.println("Today is " + currentDate); // 형식이 정해져 있기 때문에 형식을 따로 만들지 않고 간단하게 사용
		
		LocalDate endDate = LocalDate.of(2022, 12, 5);
		System.out.println("End Date : " + endDate);
		
		int year = currentDate.getYear();
		int month = currentDate.getMonthValue(); // 1 안 더해도 됨.
		int day = currentDate.getDayOfMonth();
		
		if(currentDate.isLeapYear()) { // 평년/윤년 판단
			System.out.println("Leap year");
		} else {
			System.out.println("Common year");
		}
		
		System.out.println(year + " - " + month + " - " + day);
		
		// 시간
		LocalTime currentTime = LocalTime.now();
		System.out.println("Now is " + currentTime);
		
		LocalTime endTime = LocalTime.of(21, 40);
		System.out.println("The class will end at " + endTime);
		
		// 날짜와 시간
		LocalDateTime currentDT = LocalDateTime.now();
		System.out.println("Current date and time : " + currentDT);
		
		LocalDateTime endDT = LocalDateTime.of(2022,12,5,21,40);
		System.out.println("Final date and time : " + endDT);
		
		// 시간존(TimeZone)
		ZonedDateTime zDateTime = ZonedDateTime.now(ZoneId.of("Canada/Eastern"));
		System.out.println("Canada timezone : " + zDateTime);
		
	}
	
}
