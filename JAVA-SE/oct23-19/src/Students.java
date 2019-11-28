
public class Students extends Person {
	int mark;
	int rollno;
public Students(int mark,int rollno,String name,int age) {
	super(name, age);
	this.mark=mark;
	this.rollno=rollno;
	
}
public static void main(String[] args) {
	Students s1=new Students(80,22,"ram",18);
}
}
