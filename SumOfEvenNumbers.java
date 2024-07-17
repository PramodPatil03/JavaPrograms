package com.doWhile;

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =0,sum = 0;
		while(i<=n) {
			if(i%2 == 0) {
				sum+= i;
			}
			i++;
		}
		System.out.println("The final sum is: "+sum);
		sc.close();
	}

}
