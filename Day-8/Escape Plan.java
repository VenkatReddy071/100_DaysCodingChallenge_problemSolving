/*John wick is trying to escape the island which is present in the form of a linked list consisting of n nodes in an unsorted fashion. To figure out the escape John first has to sort the list and figure out the middle of that list. If the length of the list is even then both the middle points will be the escape.

The escape is only possible if he manages to search the middle of that list. If not then he will be on that island forever. Your task is to help John in escaping the island.

Input Format
The first line of the input contains a number n.

The second line contains n numbers.

Output Format
The output contains the middle element of that list.

Constraints
1 < = n < = 10^4

0 < = arr [ i ] < = 100

Sample Testcase 0
Testcase Input
5
1 2 3 4 5
Testcase Output
 3
Explanation
Since the middle of the list is 3 so it is the escape for john wick.*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();

      int arr[]=new int [n];

      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }

      Arrays.sort(arr);

      System.out.println(arr[n/2]);
    }
}
             