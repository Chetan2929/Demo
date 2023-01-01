package Oops;

public class Static {

	static int a=50;//static variable
	       int b=45;  //non static variable
	       
	 static void m1()// static method 
	 {
		 System.out.println("this is m1 static method");
	 }
	void m2()// non static method
	{
		System.out.println("this is m2 non static method");
		
	}
	
	void m3()
	{
		System.out.println("this m3 method ---- non static");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2 ();
	}
	public static void main(String[] args) {
		//static method access only static stuff
		System.out.println(a);
		m1();
		//System.out.println(Static.a); here we acces in other calss without object
		//Static.m1();

		//System.out.println(b); incorrect because non static variabel
		//m2();                  incorrect because non static method
		
		
		//static ,ethod can also access non static stuff but through object
		Static st=new Static();
		System.out.println(st.b);
		st.m2();
		st.m3();
		
		
	}

}
