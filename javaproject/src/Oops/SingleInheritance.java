package Oops;

class A//  parent
{
	int a;
	void display() 
	{
		System.out.println(a);
	}
	
}

class B extends A  //child
{
	int b;
	void print() {
		System.out.println(b);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		/*A obj=new A();
		obj.a=100;
		obj.display();*/
		
		B ob=new B();
		ob.a=200;
		ob.b=300;
		ob.display();
		ob.print();
		
	

	}

}
