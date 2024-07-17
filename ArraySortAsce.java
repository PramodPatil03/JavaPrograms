package com.arrays;

public class ArraySortAsce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,30,20,50,40,15};
		int temp = 0;
		System.out.print("Before sorting: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println();
		//Sorting in Ascending order
//		for(int i=0;i<a.length;i++) {
//			for (int j=i+1;j<a.length;j++) {
//				if(a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
		//Sorting in descending order
		for(int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if(a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
