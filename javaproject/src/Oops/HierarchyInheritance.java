package Oops;

class Parent 
{
	int a;
	void display() 
	{
		System.out.println(a);
		
	}
}

class child1 extends Parent
{
	int b;
	void show ()
	{
		System.out.println(b);
		
	}
}
 class child2 extends Parent
 {
	 int c;
	 void print()
	 {
		 System.out.println(c);
	 }
 }
 
public class HierarchyInheritance {

	public static void main(String[] args) {
		child1 ch=new child1();
		ch.a=100;
		ch.b=200;
		ch.display();
		ch.show();
		
		child2 cb=new child2();
		cb.a=500;
		cb.c=600;
		cb.display();
		cb.print();
	

	}

}
