class CircleArea
{
	public static void main(String args[])
		{
			double pi=3.14;
			int radious=10;
			double c=area(pi,radious);
			System.out.println("area of the circle is :"+c);
		}
	static double area(double x,int y)
		{      int z=y*2;
			return  x*z;
		}
}
			