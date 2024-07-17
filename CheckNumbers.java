package com.assignment;

import java.util.Scanner;

public class CheckNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if(n1 != n2 && n2 != n3 ) {
			System.out.println("All the three numbers are not equal");
		}else if(n1 == n2 && n2 == n3) {
			System.out.println("All three are equal!!");
		}else {
			System.out.println("Not all numbers are equal but not all are different!!");
		}
	}

}
