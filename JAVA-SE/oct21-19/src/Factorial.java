
public class Factorial {
	int facts=1;
	int  fact(int num) {
	
		if(num>1) {
		facts=num*facts;
		return fact(num-1);}
		else 
			return facts;
		
	
	}

}
