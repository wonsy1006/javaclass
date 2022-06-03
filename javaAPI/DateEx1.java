package javaAPI;

import java.text.SimpleDateFormat;

// p. 538 Date Class

import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		
		Date now = new Date(); // 인스턴스 객체 생성
		System.out.println(now);
		
		SimpleDateFormat sdf; // SimpleDateFormat 클래스 -> 특정 문자열 포맷으로 날짜를 리턴
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일"); // 대문자 M은 month, 소문자 m은 minute 
		System.out.println(sdf.format(now)); // format -> 메소드
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초"); // hh -> HH : 24시간제 출력가능
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초(S)"); // a -> 오전/오후 출력, S -> 1/1000초까지
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 D일"); // D -> 해당년도의 몇번째 날인지 카운트
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일(E)"); // E -> 요일 출력
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 w주차"); // w -> 해당년도의 몇주차인지 카운트
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 W주차"); // W -> 해당 월의 몇주차인지 카운트
		System.out.println(sdf.format(now));
		
	}

}
