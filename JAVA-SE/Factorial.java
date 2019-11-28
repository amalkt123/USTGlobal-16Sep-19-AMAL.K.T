class Factorial
{
	public static void main(String args[])
		{
			int x=3;
			int f= fact(x);
			System.out.println("factorial of "+x+" is "+f);
		}
	static int fact(int x)
		{
			int fa=1;
			for(int i=1;i<=x;i++)
				fa*=i;
			return fa;

                    /* if(x>1)
                         int facto=x*fact(x-1);
                          else return facto*/




		}
}
					