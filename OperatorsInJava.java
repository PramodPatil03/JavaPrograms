package com.pramod;
import java.util.Scanner;
public class OperatorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arithmetic operators +,-,*,/,%
		RevNum re = new RevNum();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value for a and b: ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if(b == 0) {
//			System.out.println("The value of b cannot be 0");
//			System.exit(1);
//		}
//		
//		System.out.println("The Sum is: "+(a+b));
//		System.out.println("The Sub is: "+(a-b));
//		System.out.println("The Mul is: "+(a*b));
//		System.out.println("The Div is: "+(a/b));
//		System.out.println("The Rem is: "+(a%b));
		try {
			int rev = re.Reverse(102);
			System.out.println("The reverse number is : "+ rev);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
