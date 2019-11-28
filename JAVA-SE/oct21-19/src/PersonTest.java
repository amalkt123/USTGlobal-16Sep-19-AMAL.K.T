
public class PersonTest {
      public static void main(String[] args) {
    	  Person.color="white";
    	  System.out.println("person color is "+Person.color);
    	  Person.sleep();
		Person p1=new Person();
		p1.name="divya";
		p1.age=20;
		p1.color="blue";
		System.out.println("person name is "+p1.name);
		System.out.println("person age is "+p1.age);
		p1.eat();
		p1.walk();
		System.out.println("*******************************************************");
		Person p2=new Person();
		p2.name="bhavya";
		p2.age=25;
		System.out.println("person name is "+p2.name);
		System.out.println("person age is "+p2.age);
		p2.walk();
		p2.eat();
	
	}
}
