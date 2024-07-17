package com.assignment;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("Enter the year: ");

			int year = sc.nextInt();
			if (year % 4 ==0 ) {
				if(year % 100 != 0) 
				{
					System.out.println("Leap year !!");
				}
				else if(year % 400 == 0) {
					System.out.println("Leap Year!!");
				}
				else {
					System.out.println("Not a Leap Year!!");
				}
			}
			else {
				System.out.println("Not a Leap Year!!");
			}
		}
	}

}
