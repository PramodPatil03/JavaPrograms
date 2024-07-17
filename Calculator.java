package com.switchStmnt;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double res =0;
		System.out.print("Enter the operator: ");
		char op = sc.next().charAt(0);
		switch(op) {
			case '+': res = a + b;
			break;
			case '-': res = a - b;
			break;
			case '*': res = a * b;
			break;
			case '/': res = a / b;
			break;
			default: System.out.println("Invalid operator.\n");
		}
		System.out.println("The calculated result is : "+res);
		sc.close();
	}
}
