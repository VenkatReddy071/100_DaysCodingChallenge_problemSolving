/*Problem Statement
Given an integer array, arr. Display the count of AND triplets.

An AND triplet is a set of three indices i, j, and k such that:

0 <= i<arr.length
0 <= j <arr.length
0 <= k <arr.length
arr[i] &arr[j] &arr[k] == 0, where & represents the bitwise-AND operator.
 */

 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
          arr[i] = sc.nextInt();
        }

        int count = 0;

      for(int j =0;j<n;j++){
        for (int k = 0;k<n;k++){
          for (int l =0;l<n;l++){
            int c = arr[j]&arr[k]&arr[l];
            if (c == 0){
              count++;
            }
          }
        }
      }
      System.out.println(count);
    }
}
         