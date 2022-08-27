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
            coursenum = "1�й�";
        }
        else { 
            coursenum = "2�й�";           
        }
    }

    public void Student() {
        System.out.println(name + "\t" + stnum);
    }
    
    public void Course() {
    	if("��ü������".equals(coursename)) {
            System.out.println(name + "\t" + coursename + "\t" + coursenum);
    	}
    	if("3D������".equals(coursename)) {
            System.out.println(name + "\t" + coursename + "\t\t" + coursenum);
    	}
    	if("".equals(coursename)) {
            System.out.println(name + "\t" + "��������" );
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
    
    name.add("ȫ�浿");
    num.add(20201234);
    coursename.add("��ü������");
    score.add(98);
    
    name.add("������");
    num.add(20202345);
    coursename.add("3D������");
    score.add(77);   
    
    name.add("�迬��");
    num.add(20197451);
    coursename.add("��ü������");
    score.add(82); 
    
    name.add("�����");
    num.add(20203566);
    coursename.add("3D������");
    score.add(90); 
    
    name.add("����ȣ");
    num.add(20181755);
    coursename.add("3D������");
    score.add(86); 
    
    name.add("����ȯ");
    num.add(20215278);
    coursename.add("��ü������");
    score.add(93); 
    
    
    for(int j=0; j < name.size(); j++)
    	list.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));
   
    System.out.println("\n========== �л� ���� ==========");
        for (Report Report : list) {
            Report.Student();
        }
 
    System.out.println("\n========== ���� ���� ==========");
        for (Report Report : list) {
            Report.Course();
        }
        
    //�й� ������
    for(int j=0; j < name.size(); j++) {      
    if(coursename.get(j).equals("��ü������") & num.get(j) % 2 == 0) {
    	ob1.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));
     }
    if(coursename.get(j).equals("��ü������") & num.get(j) % 2 == 1) {
    	ob2.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));
     }
    if(coursename.get(j).equals("3D������") & num.get(j) % 2 == 0) {
    	td1.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));
     }
    if(coursename.get(j).equals("3D������") & num.get(j) % 2 == 1) {
    	td2.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));
     }
    }
    
    //�йݺ� ����Ʈ
    System.out.println("\n========== �йߺ� �л� ����Ʈ ==========");
    System.out.println("> ��ü������ 1�й�");
    for (Report Report : ob1) {
        Report.Student();
    }
    System.out.println("\n> ��ü������ 2�й�");
    for (Report Report : ob2) {
        Report.Student();
    }
    System.out.println("\n> 3D������ 1�й�");
    for (Report Report : td1) {
        Report.Student();
    }
    System.out.println("\n> 3D������ 2�й�");
    for (Report Report : td2) {
        Report.Student();
    }    
    
    //�йݺ� ���
    double total;
	System.out.println("\n========== �йߺ� ���� ��� ==========");    
    System.out.println("> ��ü������ 1�й�");
    total = 0;
	for (Report Report : ob1) {
		total += Report.avg();		
	}	
		System.out.println(total / ob1.size() + "��");
	System.out.println("\n> ��ü������ 2�й�");
	total = 0;
	for (Report Report : ob2) {
		total += Report.avg();		
	}	
		System.out.println(total / ob2.size() + "��");
	System.out.println("\n> 3D������ 1�й�");
	total = 0;
	for (Report Report : td1) {
		total += Report.avg();		
	}	
		System.out.println(total / td1.size() + "��");   
	System.out.println("\n> 3D������ 2�й�");
	total = 0;
	for (Report Report : td2) {
		total += Report.avg();		
	}	
		System.out.println(total / td2.size() + "��");       

	//�л� �߰�	
	System.out.println("\n=========* �л� �߰� *=========");  
	System.out.println("�߰��� �л� �̸��� �Է��ϼ��� : ");  	
	name.add(6,sc.nextLine());
	System.out.println("\n"+ name.get(6) + " �л��� �й��� �Է��ϼ��� : ");  	
	num.add(6,sc.nextInt());
	System.out.println("\n"+ name.get(6) + " �л��� ������ �����ϼ��� : ");  	
	System.out.println("1.��ü������  2.3D������");  
	a = sc.nextInt();
	if(a == 1) {
		coursename.add(6,"��ü������");
	}
	if(a == 2) {
		coursename.add(6,"3D������");
	}
	System.out.println("\n"+ name.get(6) + " �л��� ������ �Է��ϼ��� : ");  	
	score.add(6,sc.nextInt());
	
	int j = 6;
	list.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));	
	 
    if(coursename.get(j).equals("��ü������") & num.get(j) % 2 == 0) {
    	ob1.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));
    }
    if(coursename.get(j).equals("��ü������") & num.get(j) % 2 == 1) {
    	ob2.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));
    }
    if(coursename.get(j).equals("3D������") & num.get(j) % 2 == 0) {
    	td1.add(new Report(name.get(j),num.get(j), coursename.get(j), score.get(j)));
    }
    if(coursename.get(j).equals("3D������") & num.get(j) % 2 == 1) {
    	td2.add(new Report(name.get(j), num.get(j), coursename.get(j), score.get(j)));
    }
      
    System.out.println("\n========== �л� ����(�߰�) ==========");
    for (Report Report : list) {
        Report.Student();
    }
	
    System.out.println("\n========== �йߺ� �л� ����Ʈ(�߰�) ==========");
    System.out.println("> ��ü������ 1�й�");
    for (Report Report : ob1) {
        Report.Student();
    }
    System.out.println("\n> ��ü������ 2�й�");
    for (Report Report : ob2) {
        Report.Student();
    }
    System.out.println("\n> 3D������ 1�й�");
    for (Report Report : td1) {
        Report.Student();
    }
    System.out.println("\n> 3D������ 2�й�");
    for (Report Report : td2) {
        Report.Student();
    }  
     
    //�л� �߰� �� ���
	System.out.println("\n========== �йߺ� ���� ���(�߰�) ==========");    
    System.out.println("> ��ü������ 1�й�");
    total = 0;
	for (Report Report : ob1) {
		total += Report.avg();		
	}	
		System.out.println(total / ob1.size() + "��");
	System.out.println("\n> ��ü������ 2�й�");
	total = 0;
	for (Report Report : ob2) {
		total += Report.avg();		
	}	
		System.out.println(total / ob2.size() + "��");
	System.out.println("\n> 3D������ 1�й�");
	total = 0;
	for (Report Report : td1) {
		total += Report.avg();		
	}	
		System.out.println(total / td1.size() + "��");   
	System.out.println("\n> 3D������ 2�й�");
	total = 0;
	for (Report Report : td2) {
		total += Report.avg();		
	}	
		System.out.println(total / td2.size() + "��");     
     
	System.out.println("\n=========* ������û ��� *=========");	
	System.out.println("������û�� ����� �л��� �����ϼ��� : ");
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
    
    System.out.println(name.get(delnum-1) + " �л��� ������ �����մϴ�.");
    
    System.out.println("\n========== ���� ���� ==========");
    for (Report Report : list) {
        Report.Course();
    }
  }  
}