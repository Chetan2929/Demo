package Oops;

public class EmployeeMain {

	 public static void main(String args[]) {
  	   
  	   Employee emp1=new Employee();//creating object
  	   emp1.eid=101;
  	   emp1.ename="chetan";
  	   emp1.sal=30000.00;
  	   emp1.deptno=10;
  	   emp1.job="manager";
  	   emp1.display();
  	   
  	   Employee emp2=new Employee();//creating object
  	   emp2.eid=103;
  	   emp2.ename="annkit";
  	   emp2.sal=50000.00;
  	   emp2.deptno=50;
  	   emp2.job="ceo";
  	   emp2.display();

}
	 
}  
