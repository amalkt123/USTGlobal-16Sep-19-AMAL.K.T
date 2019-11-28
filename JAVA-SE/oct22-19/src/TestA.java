
public class TestA {
public static  void add(long a,int b) {
	System.out.println("1");
}
public  void add(int a,long b) {
	System.out.println("2");
	
}
public int multiply(byte a,int b){
	System.out.println("multiply(int a,int b)method");
	return a+b;
}
public int multiply(int a,int b){
	System.out.println("multiply(int a,int b)method");
	return a+b;
}

public static void main(String[] args) {
	TestA a=new TestA();
	a.add(4l,2);
	a.multiply(10, 20);
}
}
