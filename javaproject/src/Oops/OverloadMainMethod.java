package Oops;

public class OverloadMainMethod {

	public void main(int a)
	{
		System.out.println(a);
		
	}
	public void main(int a, int b)
	
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		OverloadMainMethod ov=new OverloadMainMethod();
		ov.main(10);
		ov.main(25, 78);
	}

}
