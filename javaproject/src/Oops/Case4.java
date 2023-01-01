package Oops;

public class Case4 {
	
	int sum(int a,int b)
	{
		return(a+b);
	}

	public static void main(String[] args) {
		
           Case4 cal=new Case4();
           int del = cal.sum(300, 400);
           System.out.println(del);
	}

}
