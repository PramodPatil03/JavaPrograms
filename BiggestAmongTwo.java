package com.pramod;

import java.util.Scanner;

public class BiggestAmongTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1 > num2) {
			System.out.println(num1 + " is bigger than "+num2);
		}
		else if(num1 == num2) {
			System.out.println(num1+" is equal to "+ num2);
		}else {
			System.out.println(num1+" is smaller than "+num2);
		}
	}

}
