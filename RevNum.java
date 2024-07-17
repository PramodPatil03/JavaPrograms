package com.pramod;

public class RevNum {
	public int Reverse(int num) {
		int revNum = 0;
		while(true) {
			if(num == 0) {
			break;
			}
			else {
				revNum = revNum *10;
				revNum += (num % 10);
				System.out.println("Rev Num 1: "+revNum);
				
				num = num /10; 
				System.out.println("Rev Num 2: "+revNum);
				System.out.println("Num: "+num);
			}
		}
		return revNum;
	}
}
