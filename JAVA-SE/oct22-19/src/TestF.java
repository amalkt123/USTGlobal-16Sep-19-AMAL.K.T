
public class TestF {
//	public TestF(String a) {
//		this("hello");// recursive constructor invokation
//	}

//	public TestF() {
//		int i;
//		this();//constructor calling must be first statement
//	}
//		
//	public TestF() {
//		this(10);
//	}

//	public TestF(int a) {
//		this();
//	}
	// recursive constructor innvokation error compile time

	void m1() {
		m2();
	}

	void m2() {
		m1();
	}
	// while calling a m1 or m2 method it cause satck overflow error in runtime

}
