package javaAPI;

// p.525 binarySearch

import java.util.Arrays;

public class ArraysEx2 {

	public static void main(String[] args) {
		int[] scores = {96,80,90,60,70};
		
		Arrays.sort(scores); // binarySearch 사용하기 전 sort 반드시 선행
		
		for(int sc : scores) {
			System.out.println(sc);
		}
		
		int index = Arrays.binarySearch(scores, 60); // binarySearch -> 배열의 인덱스를 찾아주는 메소드
		System.out.println("index : " + index);

	}

}
