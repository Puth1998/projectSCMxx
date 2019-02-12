package projectSCMxx;

import java.util.Scanner;


public class employeeDemo {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		String number, name, number2;
		int s, sl;
		
		employees emp = new employees();
		sales sale = new sales();
		calSalary sum = new calSalary();
		output print = new output();
		
		System.out.print("Enter CustomerNumber, Name, Salary :");
		number = in.next();
		name = in.next();
		s = in.nextInt();
		emp = new employees(number,name,s);
		
		System.out.println();
		System.out.print("Enter CustomerNumber, Sale:");
		number2 = in.next();
		sl = in.nextInt();
		sale = new sales(number2, sl);
		
		if ( emp.getEmpNumber().equals(number2)) {
			emp.setSale(sale);
			sum = new calSalary(s,sl);
		}
		
		print.print(emp.getEmpName(), sum.sumsalary());
	}
}
