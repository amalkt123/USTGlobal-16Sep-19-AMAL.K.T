
public class Employee1 {

	String name;
	 int eid;
	 static int eid1;
	public Employee1(String name,int eid) {
		this.name=name;
		this.eid=eid;
		// TODO Auto-generated constructor stub
	}
	void printdetails() {
		System.out.println("employee name is "+this.name);
		System.out.println("employee eid is "+this.eid);
	}
	void sayHello() {
		System.out.println("hello "+name+"welcome to ust global company");
	}
	static void add(int eid1) {
		Employee1.eid1=eid1;
		System.out.println(eid1);
	}

	public static void main(String[] args) {
		
		Employee1 e1=new Employee1("rashmitha",143);
		e1.printdetails();
		e1.sayHello();
		
		Employee1 e2=new Employee1("manasi",420);
		e2.printdetails();
		e2.sayHello();

		Employee e3=new Employee("chacha",69);
		e3.printdetails();
	
		
		
	}

}



