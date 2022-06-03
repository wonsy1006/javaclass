package javaAPI;

import java.util.Arrays;

// p.537 Random Class

import java.util.Random;

public class MathEx2 {

	public static void main(String[] args) {
		/*
		int num =(int)(Math.random() * 6) + 1;
		System.out.println("dice number = " + num);
		*/
		
		int[] lotto = new int[6];
		int[] myNum = new int[6];
		
		Random rand;
		rand  = new Random(11);
		// Random rand = new Random(10); // 종자값(seed) 에 해당되는 알고리즘 공식. 종자값을 기준으로 알아서 숫자가 배열되어 있음.
		// System.out.println(rand.nextDouble()); // .nextDouble() -> double 타입의 난수를 리턴
		
		System.out.print("추첨 번호 : ");
		for(int i = 0; i < lotto.length; i++) {
			//System.out.println(rand.nextInt(45) + 1); // .nextInt() -> 매개 변수로 설정한 숫자만큼 곱한 값을 넣어 줌
			lotto[i] = rand.nextInt(45) + 1;
			System.out.print(lotto[i] + "        ");
		}
		
		System.out.println(); // 줄바꿈
		
		rand = new Random(11);
		System.out.print("선택 번호 : ");
		for(int i = 0; i < myNum.length; i++) {
			myNum[i] = rand.nextInt(45) + 1;
			System.out.print(myNum[i] + "        ");
		}
		
		System.out.println(); // 줄바꿈
		
		// 비교하기 전 정렬
		Arrays.sort(lotto);
		Arrays.sort(myNum);
		
		boolean result = Arrays.equals(lotto, myNum); // 배열 항목 값 비교
		
		System.out.println("***** 추첨 결과 *****");
		
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}

}
