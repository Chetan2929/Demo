package Oops;

public class Case2 {
	
	int x=10;
	int y=20;
	
	int sum()
	{
		return(x+y);
	}
	

	public static void main(String[] args) {
		
		Case2 ca=new Case2();
		int res = ca.sum();
		System.out.println(res);
		//System.out.println(ca.sum()); this is also right
		

	}

}
