package javaClass;

public class RectangleEx1 {

	public static void main(String[] args) {
		try {
			Rectangle rect1 = new Rectangle(20, 30);
	
			int area = rect1.getArea();
			
			System.out.println("---------------------------");
			System.out.println("사각형의  너비 : " + rect1.getWidth());
			System.out.println("사각형의  높이 : " + rect1.getHeight());
			System.out.println("사각형의  면적 : " + area);
			System.out.println("---------------------------\n");
			
			rect1.setWidth(50);
			rect1.setHeight(70);
			area = rect1.getArea();
			
			System.out.println("---------------------------");
			System.out.println("사각형의  너비 : " + rect1.getWidth());
			System.out.println("사각형의  높이 : " + rect1.getHeight());
			System.out.println("사각형의  면적 : " + area);
			System.out.println("---------------------------\n");
			
		} catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}

	}

}
