package com.pramod;

import java.util.Scanner;

public class IfElseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String();
		s = (new Scanner(System.in)).next();
		if(s.equals("Apple")) {
			System.out.println("One");
		}else if(s.equals("Banana")){
			System.out.println("Two");
		}else if(s.equals("Mango")) {
			System.out.println("Three");
		}else {
			System.out.println("Orange");
		}
	}

}
