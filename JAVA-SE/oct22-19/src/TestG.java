
public class TestG {
    final void add() {
    	System.out.println("add() method");
    }
    final void add(int a) {
    	System.out.println("add(int a) method ");
    }
	public static void main(String[] args) {
		SuperClass s1=new SuperClass();
		System.out.println("**************************");
		SubClass s2=new SubClass();
		s2.getData();
		TestG t1=new TestG();
		t1.add();
		t1.add(20);
		
		
	}

}
