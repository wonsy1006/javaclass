package javaAPI;

import java.util.Arrays;

public class ArraysEx1 {

	public static void main(String[] args) {
		int[] scores = {98, 75, 80, 60, 88};
		
		Arrays.sort(scores); // 오름차순만 존재
		
		// 오름차순
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		} 
		
		System.out.println("-----------------");
		
		// 내림차순 ( 출력 조건을 바꿔주면 가능 )
		for(int i = scores.length-1; i >= 0; i--) {
			System.out.println(scores[i]);
		} 
		
		System.out.println("-----------------");
		
		String[] names = {"이영희" ,"홍길동", "김철수", "손흥민", "박지성"};
		Arrays.sort(names);
	
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
