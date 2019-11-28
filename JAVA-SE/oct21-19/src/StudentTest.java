
public class StudentTest {

	public static void main(String[] args) {
     Student s= new Student();
     Student.cname="Qspiders";
     s.name="priya";
     s.usn=101;
     System.out.println("college name is "+s.cname);
     System.out.println("name is "+s.name);
     System.out.println("id is "+s.usn);
     s.read();
	}

}
