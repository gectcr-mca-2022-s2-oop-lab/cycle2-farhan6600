package cycle2;

import java.util.*;
public class Employee{
	int empid;
	 String name;
	 float salary;
	 public void getInput() {
		 
		 Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the Employee ID : ");
		  empid = sc.nextInt();
		  System.out.print("Enter the Name : ");
		  name = sc.next();
		  System.out.print("Enter the Salary : ");
		  salary = sc.nextFloat();
		 }
	 public String toString(){
		  
		  return("Employee id = " + empid + "\nEmployee name = " + name + "\nEmployee salary = " + salary);
		 }

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no. of employees:");
		int n=in.nextInt();
		Employee e[]=new Employee[n];
		for(int i=0; i<n; i++) {
			
			   
			   e[i] = new Employee();
			   e[i].getInput();
			  }
		System.out.println("Enter Employee ID :");
		int empno=in.nextInt();
		for(int i=0; i<n; i++) {
			if(e[i].empid==empno) {
				System.out.println(e[i]);
			}
		}
		
		in.close();
	}

}