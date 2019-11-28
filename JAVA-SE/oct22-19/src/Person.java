
public class Person {

	String name;
	int age;
	public Person(String pname,int page) {
         
		name=pname;
		age=page;
	}
		public static void main(String[] args) {
          Person p=new Person("divya",20);
          Person p1=new Person("ram",22);
          Person p2=new Person("kumar",27);
        //  Person p3=new Person();  error
	}

}
