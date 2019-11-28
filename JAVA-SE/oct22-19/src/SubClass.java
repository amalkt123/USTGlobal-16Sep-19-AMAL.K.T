
public class SubClass extends SuperClass {
	String s="subclass variable";
	public SubClass() {
		System.out.println("subclass constructor");
	}
	void getData() {
		System.out.println(s);
		System.out.println(this.s);
		super.s="aa";
		a=22;
		System.out.println(super.s);
		super.superClassMethod();
		superClassMethod();
	}
	
}
