
public class TestB {
	static int a=25;
	int x;
	static TestB t;
public static void add() {
	// only final access modifier is supported for local variable
	int a=0;
	final int b=0;
	System.out.println(a);
	System.out.println(b);
}
public static void main(String[] args) {
	add();
	TestB b=new TestB();
	System.out.println("x value is "+b.x);
}
}
