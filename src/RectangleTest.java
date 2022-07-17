import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("사각형의 너비를 입력하시오.");
		int width = sc.nextInt();
		
		System.out.println("사각형의 높이를 입력하시오.");
		int height = sc.nextInt();
		
		Rectangle rect = new Rectangle(width, height);
		
		int area = rect.clacArea();
		System.out.println("사각형의 면적은 "+area+" 입니다.");
		

	}

}
