package com.doWhile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> a = new ArrayList<>();
		int pc=0,nc=0,zc=0;
		System.out.println("Enter numbers(Enter 111 to end your input):");
		int i;
		do {
			i = sc.nextInt();
			a.add(i);
		}while( i != 111);
		for(int s:a) {
			System.out.println(s+" " );
			
		}
		for(int s : a) {
			System.out.print(s+' ');
			if(s == 111) {
				break;
			}
			if(s<0) {
				nc = nc+1;
			}else if(s== 0) {
				zc = zc+1;
			}else {
				pc += 1;
			}
		}
		sc.close();
		System.out.println("\n\nPositive numbers: "+pc);
		System.out.println("Negative numbers: "+nc);
		System.out.println("Zeroes: "+zc);
	}

}
