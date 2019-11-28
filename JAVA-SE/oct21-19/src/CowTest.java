
public class CowTest {

	public static void main(String[] args) {
           Cow c1=new Cow();
           c1.name="ganga";
           c1.color="pink";
           c1.eat();
           c1.sleep();
           System.out.println("Cow name is "+c1.name);
           System.out.println("cow color is "+c1.color);
           System.out.println("*********************************************************************");
           Cow c2=new Cow();
           c2.color="black";
           c2.name="tunga";
           System.out.println("cow name is "+c2.name);
           System.out.println("cow color is "+c2.color);
           c2.eat();
           c2.sleep();
           
           
	}

}
