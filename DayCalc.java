package com.assignment;

import java.util.Scanner;

public class DayCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Cal c = new Cal();
		System.out.println("Enter hwo many days after: ");
		int day = sc.nextInt();
		String after_day = c.getDay(day);
		System.out.println(after_day);
	}

}

class Cal{

	public String getDay(int day) {
		// TODO Auto-generated method stub
		int calDay = day % 7;
		String dd;
		switch(calDay) {
		case 0:dd =  "Monday";
		break;
		case 1: dd = "Tueseday";
		break;
		case 2: dd = "Wednesday";
		break;
		case 3: dd = "Thursday";
		break;
		case 4: dd = "Friday";
		break;
		case 5: dd = "Saturday";
		break;
		case 6: dd = "Sunday";
		break;
		default: dd =  "Invalid Day";
		
		}
		return dd;
		
	}
	
}
