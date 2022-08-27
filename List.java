import java.util.ArrayList;
import java.util.Scanner;

class Report {
    public String name;
    public int stnum;
    public String coursenum;
    public String coursename;
    public int stscore;
    
    public Report(String name, int stnum, String coursename, int stscore) {
        this.name = name;
        this.stnum = stnum;
        this.coursename = coursename;
        this.stscore = stscore;
        
        if(stnum % 2 == 0) {
            coursenum = "1분반";
        }
        else { 
            coursenum = "2분반";           
        }
    }

    public void Student() {
        System.out.println(name + "\t" + stnum);
    }
    
    public void Course() {
    	if("객체지향언어".equals(coursename)) {
            System.out.println(name + "\t" + coursename + "\t" + coursenum);
    	}
    	if("3D프린팅".equals(coursename)) {
            System.out.println(name + "\t" + coursename + "\t\t" + coursenum);
    	}
    	if("".equals(coursename)) {
            System.out.println(name + "\t" + "수업없음" );
    	}
    }

    public int avg() {
    		return stscore;
    }  
 	
    public void Delete() {
    	System.out.println(name);
    } 
}
   

public class List {
	
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a, delnum;
    
    ArrayList<Report> list = new ArrayList<>();   
    ArrayList<String> name = new ArrayList<>();
    ArrayList<Integer> num = new ArrayList<>();    
    ArrayList<String> coursename = new ArrayList<>();
    ArrayList<Integer> score = new ArrayList<>();
    
    ArrayList<Report> ob1 = new ArrayList<>();
    ArrayList<Report> ob2 = new ArrayList<>();
    ArrayList<Report> td1 = new ArrayList<>();
    ArrayList<Report> td2 = new ArrayList<>();
    
    name.add("홍길동");
    num.add(20201234);
    coursename.add("객체지향언어");
    score.add(98);
    
    name.add("박지성");
    num.add(20202345);
    coursename.add("3D프린팅");
    score.add(77);   
    
    name.add("김연아");
    num.add(20197451);
    coursename.add("객체지향언어");
    score.add(82); 
    
    name.add("손흥민");
    num.add(20203566);
    coursename.add("3D프린팅");
    score.add(90); 
    
    name.add("박찬호");
    num.add(20181755);
    coursename.add("3D프린팅");
    score.add(86); 
    
    name.add("박태환");
    num.add(20215278);
    coursename.add("객체지향언어");
    score.add(93); 
    
    
    for(int j=0; j < name.size(); j++)
    	list.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));
   
    System.out.println("\n========== 학생 정보 ==========");
        for (Report Report : list) {
            Report.Student();
        }
 
    System.out.println("\n========== 수업 정보 ==========");
        for (Report Report : list) {
            Report.Course();
        }
        
    //분반 나누기
    for(int j=0; j < name.size(); j++) {      
    if(coursename.get(j).equals("객체지향언어") & num.get(j) % 2 == 0) {
    	ob1.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));
     }
    if(coursename.get(j).equals("객체지향언어") & num.get(j) % 2 == 1) {
    	ob2.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));
     }
    if(coursename.get(j).equals("3D프린팅") & num.get(j) % 2 == 0) {
    	td1.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));
     }
    if(coursename.get(j).equals("3D프린팅") & num.get(j) % 2 == 1) {
    	td2.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));
     }
    }
    
    //분반별 리스트
    System.out.println("\n========== 분발별 학생 리스트 ==========");
    System.out.println("> 객체지향언어 1분반");
    for (Report Report : ob1) {
        Report.Student();
    }
    System.out.println("\n> 객체지향언어 2분반");
    for (Report Report : ob2) {
        Report.Student();
    }
    System.out.println("\n> 3D프린팅 1분반");
    for (Report Report : td1) {
        Report.Student();
    }
    System.out.println("\n> 3D프린팅 2분반");
    for (Report Report : td2) {
        Report.Student();
    }    
    
    //분반별 평균
    double total;
	System.out.println("\n========== 분발별 점수 평균 ==========");    
    System.out.println("> 객체지향언어 1분반");
    total = 0;
	for (Report Report : ob1) {
		total += Report.avg();		
	}	
		System.out.println(total / ob1.size() + "점");
	System.out.println("\n> 객체지향언어 2분반");
	total = 0;
	for (Report Report : ob2) {
		total += Report.avg();		
	}	
		System.out.println(total / ob2.size() + "점");
	System.out.println("\n> 3D프린팅 1분반");
	total = 0;
	for (Report Report : td1) {
		total += Report.avg();		
	}	
		System.out.println(total / td1.size() + "점");   
	System.out.println("\n> 3D프린팅 2분반");
	total = 0;
	for (Report Report : td2) {
		total += Report.avg();		
	}	
		System.out.println(total / td2.size() + "점");       

	//학생 추가	
	System.out.println("\n=========* 학생 추가 *=========");  
	System.out.println("추가할 학생 이름을 입력하세요 : ");  	
	name.add(6,sc.nextLine());
	System.out.println("\n"+ name.get(6) + " 학생의 학번을 입력하세요 : ");  	
	num.add(6,sc.nextInt());
	System.out.println("\n"+ name.get(6) + " 학생의 수업을 선택하세요 : ");  	
	System.out.println("1.객체지향언어  2.3D프린팅");  
	a = sc.nextInt();
	if(a == 1) {
		coursename.add(6,"객체지향언어");
	}
	if(a == 2) {
		coursename.add(6,"3D프린팅");
	}
	System.out.println("\n"+ name.get(6) + " 학생의 점수를 입력하세요 : ");  	
	score.add(6,sc.nextInt());
	
	int j = 6;
	list.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));	
	 
    if(coursename.get(j).equals("객체지향언어") & num.get(j) % 2 == 0) {
    	ob1.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));
    }
    if(coursename.get(j).equals("객체지향언어") & num.get(j) % 2 == 1) {
    	ob2.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));
    }
    if(coursename.get(j).equals("3D프린팅") & num.get(j) % 2 == 0) {
    	td1.add(new Report(name.get(j),num.get(j), coursename.get(j), score.get(j)));
    }
    if(coursename.get(j).equals("3D프린팅") & num.get(j) % 2 == 1) {
    	td2.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));
    }
      
    System.out.println("\n========== 학생 정보(추가) ==========");
    for (Report Report : list) {
        Report.Student();
    }
	
    System.out.println("\n========== 분발별 학생 리스트(추가) ==========");
    System.out.println("> 객체지향언어 1분반");
    for (Report Report : ob1) {
        Report.Student();
    }
    System.out.println("\n> 객체지향언어 2분반");
    for (Report Report : ob2) {
        Report.Student();
    }
    System.out.println("\n> 3D프린팅 1분반");
    for (Report Report : td1) {
        Report.Student();
    }
    System.out.println("\n> 3D프린팅 2분반");
    for (Report Report : td2) {
        Report.Student();
    }  
     
    //학생 추가 후 평균
	System.out.println("\n========== 분발별 점수 평균(추가) ==========");    
    System.out.println("> 객체지향언어 1분반");
    total = 0;
	for (Report Report : ob1) {
		total += Report.avg();		
	}	
		System.out.println(total / ob1.size() + "점");
	System.out.println("\n> 객체지향언어 2분반");
	total = 0;
	for (Report Report : ob2) {
		total += Report.avg();		
	}	
		System.out.println(total / ob2.size() + "점");
	System.out.println("\n> 3D프린팅 1분반");
	total = 0;
	for (Report Report : td1) {
		total += Report.avg();		
	}	
		System.out.println(total / td1.size() + "점");   
	System.out.println("\n> 3D프린팅 2분반");
	total = 0;
	for (Report Report : td2) {
		total += Report.avg();		
	}	
		System.out.println(total / td2.size() + "점");     
     
	System.out.println("\n=========* 수강신청 취소 *=========");	
	System.out.println("수강신청을 취소할 학생을 선택하세요 : ");
	int i = 1;
	for (Report Report : list) {
		System.out.printf((i++)+ ". ");
       	Report.Delete();
    }
	delnum = sc.nextInt();
	list.remove(delnum-1);
    list.add(new Report(name.get(delnum-1), num.get(delnum-1), "", 0));
    coursename.add(delnum-1,"");
    score.add(delnum-1, 0);
    
    System.out.println(name.get(delnum-1) + " 학생의 수업을 삭제합니다.");
    
    System.out.println("\n========== 수업 정보 ==========");
    for (Report Report : list) {
        Report.Course();
    }
  }  
}