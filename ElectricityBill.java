package com.ifElse;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units: ");
		int u = sc.nextInt();
		float bill = 0.0f;
		if(u<= 50) {
			bill = u*0.50f;
		}
		if(u <= 200) {
			bill = 25;
			bill += (u-50) * 0.75f;
		}
		if(u<=450 ) {
			bill = 25 + 131.25f;
			bill += (u-200) * 1.20f;
		}
		if(u>250) {
			bill = 25 + 131.25f + 300;
			bill += (u-450) * 1.50f;
		}
		System.out.println(bill);
		bill += bill * 0.20;
		System.out.println(bill);
		sc.close();
	}

}
