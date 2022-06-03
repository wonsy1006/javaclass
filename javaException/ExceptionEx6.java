package javaException;

// p.436 멀티캐치 -> 권장하지 않음

public class ExceptionEx6 {

	public static void main(String[] args) {
		
		try {
			
			String[] data = {"100", "a200"};
			
			int value1 = Integer.parseInt(data[0]);
			int value2 = Integer.parseInt(data[2]);
			
			int result = value1 + value2;
			
			System.out.println("계산결과 = " + result);
			
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.out.println("숫자로 변환할 수 없거나 배열의 인덱스를 벗어났습니다.");
				
		} catch (Exception e) { // 명시한 예외처리 유형이 아닌 다 exception이 발생했을 때 예외 처리. 순서 중요. 제일 마지막에 작성.
			System.out.println("프로그램 개발자에게 문의하세요(010-7777-7777)" + e.getMessage());
				
		} finally { // 예외 발생 여부에 관계 없이 무조건 실행할 명령. 
				System.out.println("cheer up");
				
		}

	}

}
