//한성대학교 JAVA 프로그래밍_3-3.객체생성자 예시



public class Rectangle {
	
	int width;
	int height;

//생성자
//접근지정자 변수명(){}
	public Rectangle() {
		width = height = 1;
	}
	
	public Rectangle(int width, int h) {
		if(width <0 || height<0) {
			width= 1;
			height = 1;			
		}//초기화 하는 법
		this.width = width;
		height = h;
	}
	
	int clacArea() {
		return width * height;
	}
}
