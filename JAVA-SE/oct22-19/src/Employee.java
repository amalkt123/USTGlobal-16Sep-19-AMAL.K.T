
public class Employee {
	String name;
	int eid;
	public Employee(String ename,int cid) {
		name=ename;
		eid=cid;
		// TODO Auto-generated constructor stub
	}
	void printdetails() {
		System.out.println("employee name is "+name);
		System.out.println("employee eid is "+eid);
	}

	public static void main(String[] args) {
		Employee e1=new Employee("rashmitha",143);
		e1.printdetails();
		
		Employee e2=new Employee("manasi",420);
		e2.printdetails();

		Employee e3=new Employee("chacha",69);
		e3.printdetails();
		
		
	}

}
