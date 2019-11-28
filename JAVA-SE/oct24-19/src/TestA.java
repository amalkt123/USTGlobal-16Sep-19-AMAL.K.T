
public class TestA {
	static int a;
	int b;
	static {
		a=10;
		System.out.println("static block1");
	}
		public TestA() {
		System.out.println("TestA() constructor");
	}
	public static void main(String[] args) {
		TestA t1=new TestA();
		TestA t2 =new TestA();
		System.out.println("a value is "+a);
	}
	static {
		a=20;
		System.out.println("static block 2");
	}

	static {
		a=40;
		System.out.println("static block3");
	}
}
