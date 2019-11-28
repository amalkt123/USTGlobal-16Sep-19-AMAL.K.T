
public class AnimalTest {
   public static void main(String[] args) {
	Animal a=new Animal();
	a.eat();
	System.out.println("****************************************");
	Dog d=new Dog();
	d.bark();
	d.eat();
	System.out.println("********************************************");
	Lion l=new Lion();
	l.eat();
	l.roar();
	System.out.println("**************************************************");
}
}
