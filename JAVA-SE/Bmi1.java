class Bmi1
{
	public static void main(String args[])
		{
			double height=1.5;
			double weight=50;
			double bmi=weight/(height*2);
                         if(bmi>=40.0)
				{
					System.out.println("out of range");
				}
                        else 

 



                        if(bmi>=30.0)
				{
					System.out.println("you are in the obese weight range");
				}
                         else if(bmi>=25.0)
				{
					System.out.println("you are in the over weight weight range");
				}

                         else if(bmi>=18.5)
				{
					System.out.println("you are in the healthy weight range");
				}
                         else if(bmi<18.5)
				{
					System.out.println("you are in the under weight range");
				}
		}
}