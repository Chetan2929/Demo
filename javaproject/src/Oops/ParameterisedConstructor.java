package Oops;

public class ParameterisedConstructor {

	
	int x;
	int y;
	
	 ParameterisedConstructor()  //default constructor
	 {
		 x=34;
		 y=98;
	 }
	 
	 ParameterisedConstructor(int a,int b) //parameterised constructor
	 {
		 x=a;
		 y=b;
		 
	 }
	 
	 void display() 
	 {
		 System.out.println(x+y);
		 
	 }
	 
public static void main(String[] args) {
		
	 ParameterisedConstructor cm1=new  ParameterisedConstructor(); // invoke default constructor
          cm1.display();
          
          ParameterisedConstructor cm2=new  ParameterisedConstructor(400,589);
          cm2.display();
	}

}
