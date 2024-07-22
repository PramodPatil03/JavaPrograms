package com.pramod;

import java.io.*;
import java.util.*;

class CommanElem {
 private static void Common(int[] arr1,int[] arr2)
 {
     Set<Integer> set = new HashSet<>();
     for (int i = 0; i < arr1.length; i++) {
         for (int j = 0; j < arr2.length; j++) {
             if (arr1[i] == arr2[j]) {

                 set.add(arr1[i]);
                 break;
             }
         }
     }
     for (int i : set) {
         System.out.print(i + " ");
     }
 }

 public static void main(String[] args)
 {

     int[] arr1 = { 10, 20, 30, 40, 50, 60 };

     int[] arr2 = { 10, 15, 30, 50, 70  };

     System.out.println("Array 1: " + Arrays.toString(arr1));

     System.out.println("Array 2: "+ Arrays.toString(arr2));

     System.out.print("Common Elements: ");

     Common(arr1, arr2);
 }
}