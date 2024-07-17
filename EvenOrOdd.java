package com.pramod;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (new Scanner(System.in)).nextInt();
		if(num % 2 == 0) System.out.println("Even Number!!");
		else if(num % 2 == 1) System.out.println("Odd Number!!");
		else System.out.println("Invalid Number!!");
	}

}
