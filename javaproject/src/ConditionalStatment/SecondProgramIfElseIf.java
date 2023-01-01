package ConditionalStatment;
import java.util.Scanner;



public class SecondProgramIfElseIf {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter your age");
		
		Scanner sc=new Scanner(System.in);
		
		int age =sc.nextInt();
		
		if (age>68) {
			System.out.println(" your are old");
			
		}
		else if(age>48) {
			System.out.println("its time to retire");
			
		}
		else if(age>38) {
			System.out.println("how many baby you have");
			
		}
		else if(age>28) {
			System.out.println("job lagi kya");
			
		}
		else {
			System.out.println("kya kkarr ra bhai tu");
		}
		
		
		
		
		
		

	}

}
