
public class Bus {
	int seats;
	String color;
	public Bus(int seats,String color) {
         
		this.color=color;
		this.seats=seats;
	}
	public Bus() {
		this(40);
	}
	public Bus(int seats) {
		this(seats,"red");
	}
	void getDetails() {
		System.out.println("welcome to red bus bus seat capacity is "+seats);
	}

}
