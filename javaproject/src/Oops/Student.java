package Oops;

public class Student {

		
		int sid;
		String sname;
		char grade;
		
		Student(int id,String name,char g)//constructor
		{
			sid=id;
			sname=name;
			grade=g;
		}
		
	/*	void getValues(int id,String name,char g)//method
		{
			sid=id;
			sname=name;
			grade=g;
			
		}*/
		
		void display()
		{
			//System.out.println(sid+" "+sname+" "+grade);// this is also way to write
			
			System.out.println(sid);	// this is also way to write
		    System.out.println(sname);
		    System.out.println(grade);
		}

	

}
