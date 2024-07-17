package com.pramod;

import java.util.Scanner;

public class IfElseChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = (new Scanner(System.in)).next().charAt(0);
		if(c == 'A') {
			System.out.println("Apple");
		}else if(c == 'B') {
			System.out.println("BAT");
		}else if (c == 'C') {
			System.out.println("CAT");
		}else {
			System.out.println("Orange");
		}
	}

}
