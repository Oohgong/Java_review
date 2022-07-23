import java.util.Scanner;

public class IntArrayTest {

	public static void main(String[] args) {

		//크기가 10인 배열 intArray 선언
		int [] intArray = new int[10];
		
		System.out.println("정수 10개를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			int input = sc.nextInt();
			intArray[i]=input;
		}//for1
		
//3의 배수일 때만 출력		
		for(int i=0; i<10; i++) {
			if(intArray[i]%3==0) {
				System.out.println(intArray[i]+" ");
			}//if
		}//for2

	}

}
