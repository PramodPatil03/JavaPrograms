package com.ifElse;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet: ");
		char ch = sc.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' ) {
			System.out.println(ch +" is an alphabet!");
		}else {
			System.out.println("Not an alphabet.");
		
		}
		sc.close();
	}

}
