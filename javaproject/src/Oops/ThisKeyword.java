package Oops;

public class ThisKeyword {

	int a,b;//instance variable or class variable this keyword always belong to class variable 
	
	void getValues(int a,int b)//method variable/external variable
	{
		this.a=a;
		this.b=b;
		
	}
	void printvalue() 
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		ThisKeyword th=new ThisKeyword();
		th.getValues(10, 45);
		th.printvalue();

	}

}
