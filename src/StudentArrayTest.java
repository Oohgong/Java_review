import java.util.Scanner;

public class StudentArrayTest {

	public static void main(String[] args) {
		System.out.println("학생 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		Student [] students = new Student[number];
		//배열 생성
		
		for(int i=0; i<number; i++) {
			System.out.println(i+1+"번째 학생 이름과 성적을 입력하세요.");
			String name = sc.next();
			int score = sc.nextInt();
			
			//새 배열 생성
			Student student = new Student(name, score);
			students[i] = student;

			if(score>90) {
				System.out.println("A+ 멋있어요!");
			}else if(score>80) {
				System.out.println("F 반성하세요.");
			}
		}//for
	
		
		
		
	}

}
