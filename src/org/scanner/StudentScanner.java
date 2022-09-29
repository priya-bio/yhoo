package org.scanner;

import java.util.Scanner;

public class StudentScanner {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Student  id=");
		int id=a.nextInt();
		System.out.println("Student name is =");
		String empname=a.next();
		System.out.println("Student mark 1 is =");
		int mark1=a.nextInt();
		System.out.println("Student mark 2 is =");
		int mark2=a.nextInt();
		System.out.println("Student mark 3 is =");
		int mark3=a.nextInt();
		System.out.println("Student mark 4is =");
		int mark4=a.nextInt();
		System.out.println("Student mark 5 is =");
		int mark5=a.nextInt();
		System.out.println("Student total is =");
		int total = mark1+mark2+mark3+mark4+mark5;
		int total1=a.nextInt();
		System.out.println("Student avarage is =");
		double average=total1/5;
		double average1=a.nextDouble();
		
		
		System.out.println("\n");
		System.out.println("Studentid is="+id);
		System.out.println("Student name is ="+empname);
		
		System.out.println("Student mark1 is ="+mark1);
		System.out.println("Student mark2 is ="+mark2);
		System.out.println("Student mark3 is ="+mark3);
		System.out.println("Student mark4 is ="+mark4);
		System.out.println("Student mark5 is ="+mark5);
		System.out.println("Student total  is ="+total1);
		System.out.println("Student average is ="+average1);
		
	}}
