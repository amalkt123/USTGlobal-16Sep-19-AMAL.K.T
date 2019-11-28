
public class Student {
	String name;
	int rollno;
	final String cname="Qspider";
	final int cid;
	public Student(String name,int rollno,int cid) {
		this.name=name;
		this.rollno=rollno;
		this .  cid = cid;
	}
	public Student() {
		cid=10;
	}
	final void printDetails() {
		System.out.println("hi "+name+" welcome to "+cname);
	}
	final void printDetails(String name) {
		System.out.println("hi "+name+" welcome to "+cname);
	}
}
