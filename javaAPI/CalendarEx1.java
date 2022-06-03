package javaAPI;

import java.util.Calendar;
import java.util.TimeZone;

// p.539 Calendar Class
// 추상 클래스. new 연산자를 사용해서 인스턴스 생성할 수 없음.
// 연산이 가능. 

public class CalendarEx1 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // getInstance -> 싱글톤
		
		int year = now.get(Calendar.YEAR); // YEAR -> 상수
		int month = now.get(Calendar.MONTH) + 1; // MONTH는 배열로 되어있기 때문에 1을 더해줘야 바른 값을 출력.
		int day = now.get(Calendar.DAY_OF_MONTH); 
		int week = now.get(Calendar.DAY_OF_WEEK); // 일요일이 1
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		System.out.println(week);
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm;
		if(amPm == 0) { // amPm = Calendar.AM 도 가능
			strAmPm =  "AM";
		} else {
			strAmPm = "PM";
		}
		
		System.out.println(strAmPm + " " + hour + "시 " + minute + "분 " + second + "초");
		
		// p.542  TimeZone 클래스 활용. 다른 시간대 시간 구하기
		TimeZone tz = TimeZone.getTimeZone("America/Toronto"); // 로스엔젤레스의 타임존. 대소문자 구분. 
		Calendar calNow = Calendar.getInstance(tz);
		year = calNow.get(Calendar.YEAR); // YEAR -> 상수
		month = calNow.get(Calendar.MONTH) + 1; // MONTH는 배열로 되어있기 때문에 1을 더해줘야 바른 값을 출력.
		day = calNow.get(Calendar.DAY_OF_MONTH); 
		week = calNow.get(Calendar.DAY_OF_WEEK); // 일요일이 1
		hour = calNow.get(Calendar.HOUR);
		amPm = calNow.get(Calendar.AM_PM);
		
		if(amPm == 0) { 
			strAmPm = "AM";
		} else {
			strAmPm = "PM";
		}
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + strAmPm + " " + hour + "시 " + minute + "분 ");
		
	}

}
