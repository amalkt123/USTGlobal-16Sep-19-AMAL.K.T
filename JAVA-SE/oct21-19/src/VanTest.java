
public class VanTest {

	public static void main(String[] args) {
        
		Van v=new Van();
		v.color="black";
		v.cost=10000;
		System.out.println("color of van is "+v.color);
		System.out.println("cost of van is "+v.cost);
		v.move();
		Van v1=new Van();
		v1.color="white";
		v1.cost=10000;
		System.out.println("the cost of van is"+v1.cost);
		System.out.println("the color of van is "+v1.color);
		v1.move();
	}

}
