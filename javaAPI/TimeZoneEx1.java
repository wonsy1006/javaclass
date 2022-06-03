package javaAPI;

// 사용 가능한 TimeZone ID 출력

import java.util.TimeZone;

public class TimeZoneEx1 {

	public static void main(String[] args) {
		String[] timeZoneID = TimeZone.getAvailableIDs();
		for(String id : timeZoneID) {
			System.out.println(id);
		}

	}

}
