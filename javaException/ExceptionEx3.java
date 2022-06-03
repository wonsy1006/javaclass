package javaException;

public class ExceptionEx3 {
	
	public static void main(String[] args) {
		
		try {
			
			int[] nums = {10, 20, 30, 40, 50};
			System.out.println(nums[5]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
