
public class Student {
	int sid;
	String name;
	int age;
	int mob;
    int mark;
	public Student(int sid,String name,int age,int mob,int mark) {
		this.sid=sid;
		this.name=name;
		this.age=age;
		this.mob=mob;
		this.mark=mark;
	}
	void display() {
		System.out.println("----------student details------------");
		System.out.println();
		System.out.println("sid     : "+sid);
		System.out.println("name    : "+name);
		System.out.println("age     : "+age);
		System.out.println("mark    : "+mark);
		System.out.println("mob     : "+mob);
		System.out.println();
	}
	public static void main(String[] args) {
		Student s1=new Student(100,"ram",18,9876545,80);
		s1.display();
		Student s2=new Student(101,"kiran",19,9876545,69);
		s2.display();
		Student s3=new Student(103,"lal",18,98788854,77);
		s3.display();
		Student s4=new Student(104,"kumar",20,98768765,40);
		s4.display();
		Student s5=new Student(105,"arjun",18,9878595,55);
		s5.display();
		Student s6=new Student(106,"shihab",19,9876858,48);
		s6.display();
		Student s7=new Student(107,"praveen",19,9876545,50);
		s7.display();
		Student s8=new Student(108,"gopal",18,9759685,64);
		s8.display();
		Student s9=new Student(109,"krishna",18,8676545,88);
		s9.display();
		Student s10=new Student(110,"gopi",20,985545,60);
		s10.display();
	}
	}
