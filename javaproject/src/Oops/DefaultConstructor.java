package Oops;

public class DefaultConstructor {
	
	int x;
	int y;
	
	DefaultConstructor()  // DefaultConstructor
	{
		x=10;
		y=30;
		
	}
	
	void display()     //method for genrating output
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
		DefaultConstructor Del =new DefaultConstructor();// invoke default constructor
		   Del.display();
		

	}

}
