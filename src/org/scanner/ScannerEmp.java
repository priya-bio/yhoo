package org.scanner;

import java.util.Scanner;

public class ScannerEmp {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Employee id=");
		
		int id=a.nextInt();
		System.out.println("employee name is =");
		String empname=a.next();
		System.out.println("Employee email id is =");
		String empemail=a.next();
		System.out.println("Employee phone number is =");
		long empphoneno=a.nextLong();
		System.out.println("Employee salary is=");
		double empsalary=a.nextDouble();
		System.out.println("Employee gender is =");
		String empgender=a.next();
		System.out.println("employee city is=");
		String empcity=a.next();
		
		System.out.println("\n");
		System.out.println("employee id is="+id);
		System.out.println("employee name is ="+empname);
		System.out.println("employee emailid is ="+empemail);
		System.out.println("employee phone number is ="+empphoneno);
		System.out.println("employee salary is ="+empsalary);
		System.out.println("employee gender is =" +empgender);
		System.out.println("employee city is="+empcity);
		
		}

}
