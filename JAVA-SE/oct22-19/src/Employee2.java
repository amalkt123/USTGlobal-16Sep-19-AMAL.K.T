
public class Employee2 {
	String name;
	int eid;
	long adharno;
	public Employee2(String name,int eid,long adharno) {
		this.name=name;
		this.eid=eid;
		this.adharno=adharno;
	}
public Employee2(String name,int eid) {
	this.name=name;
	this.eid=eid;

}
public Employee2(int eid,String name) {
	this.name=name;
	this.eid=eid;
	// TODO Auto-generated constructor stub
}
void printDetail() {
	System.out.println("hi "+name+"  welcome to ust");
}
public static void main(String[] args) {
	Employee2 e1=new Employee2(111,"bavya");
	e1.printDetail();
	Employee2 e2=new Employee2("divya",234);
	e2.printDetail();
	Employee2 e3=new Employee2("priya",678,4567898);
	e3.printDetail();
	}
}
