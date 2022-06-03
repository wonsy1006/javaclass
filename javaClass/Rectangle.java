package javaClass;

//사각형에 관련된 클래스

public class Rectangle {
	private int width;      // private -> 캡슐화 (정보 은닉)
	private int height;     
	
	public Rectangle(int width, int height) throws Exception {
		if(width <= 0 || height <= 0) {
			throw new Exception("너비와 높이는 양수 값이어야 합니다.");
		}
		this.width = width;
		this.height = height;
	}
	
	// getter -> 캡슐화되어 있을 경우에 값을 구할 수 있는 함수 (Source - generate getters and setters)
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	// setter 
	
	public void setWidth(int width) throws Exception {
		if(width <= 0) {
			throw new Exception("너비는 양수 값이어야 합니다.");
		}
		
		this.width = width;
	}

	public void setHeight(int height) throws Exception{
		if(height <= 0) {
			throw new Exception("높이는 양수 값이어야 합니다.");
		}
		
		this.height = height;
	}
	
	// 사각형의 면적을 구하는 메소드
	int getArea() { // 매개변수가 없을 수도 있음
		/* int area = width * height;
		return area; */
		return width * height;
	}

	
}
