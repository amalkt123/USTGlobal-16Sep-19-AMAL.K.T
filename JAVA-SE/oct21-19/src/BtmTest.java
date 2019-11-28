
public class BtmTest {

	public static void main(String[] args) {

		Btm b=new Btm();
		b.swipe();
		System.out.println("total count is "+b.getTotalCount());
		System.out.println("count is "+b.getCount());
		Btm b1= new Btm();
		b1.swipe();
		System.out.println("total count is "+b1.getTotalCount());
		System.out.println("count is "+b1.getCount());
	}

}
