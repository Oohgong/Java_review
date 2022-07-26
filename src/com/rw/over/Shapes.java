package com.rw.over;

public class Shapes {

	public static void main(String[] args) {
		Shape sh = new Shape();
		Circle ci = new Circle();
		Square sq = new Square();
		
		//오버라이딩
		Shape s; //부모 메서드 s에 값 대입
		s= sh; s.draw(); //shape
		s = ci; s.draw(); //circle
		s = sq; s.draw(); //square

	}

}
