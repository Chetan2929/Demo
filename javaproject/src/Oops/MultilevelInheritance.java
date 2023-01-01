package Oops;

class X//  parent
{
	int a;
	void display() 
	{
		System.out.println(a);
	}
	
}

class Y extends X  //child
{
	int b;
	void print() {
		System.out.println(b);
	}
}

class Z extends Y
{
	int c;
	void show() {
		System.out.println(c);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		/*A obj=new A();
		obj.a=100;
		obj.display();*/
		
		/*B ob=new B();
		ob.a=200;
		ob.b=300;
		ob.display();
		ob.print();*/
		
		Z abc=new Z();
		abc.a=100;
		abc.b=200;
		abc.c=300;
		
		abc.display();
		abc.print();
		abc.show();
		
	

	}

}
