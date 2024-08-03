package com.pramod;

import java.util.Arrays;

public class AnagramStrings {
	public static char[] a1,a2;
	
	public static void sortArray(char a[]) {
		int i=0;
		while(i<a.length) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]>a[j]) {
					char temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
			i++;
		}
	}
	public static boolean checkAna(String a, String b) {
		a1 = a.toCharArray();
		a2 = b.toCharArray();
		
		sortArray(a1);
		sortArray(a2);
		if(a1.length != a2.length) {
			return false;
		}
		for(int i=0;i<a1.length;i++) {
			if(a1[i] != a2[i]) {
				return false;
			}
			else {
				continue;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		String b = "bca";
		boolean f = checkAna(a,b);
		if(f == true) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		
	}

}
