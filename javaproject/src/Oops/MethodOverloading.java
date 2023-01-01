package Oops;

public class MethodOverloading {

	void add(int a,int b) //1
	{
		System.out.println(a+b);
	}
	void add(int a,double b) //2
	{
		System.out.println(a+b);
	}
	void add(double a,double b)//3
	{
		System.out.println(a+b);
	}
	void add(int a,int b,double c)//4
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading mo=new MethodOverloading();
		mo.add(10, 20);//1
		mo.add(12.5, 45.68);//3
		mo.add(58, 45.63);//2
		mo.add(12, 45, 45.36);//4
	}

}
