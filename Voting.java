package com.ifElse;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		byte age = sc.nextByte();
		String res = (age>=18)?"Eligible":"Not eligible";
		System.out.println("You are "+res+" for voting.");
		sc.close();
	}

}
