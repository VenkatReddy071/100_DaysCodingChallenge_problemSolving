/*Imagine a row of linked boxes, like a chain of nodes in a linked list, with Shyaam holding the first box. 

Each box is represented by a number. The challenge Ram presents is to rearrange the order of these linked boxes in reverse, making the last box the new first one. 
Can you help Shyaam conquer this task?

Input Format
Each Input has two lines

Contains N (number of boxes)
Contains N numbers (value of each box)
Output Format
Print the chain of boxes after reversing.

Constraints
The number of boxes in the chain is in the range of [0, 10^6].
-5000 <= box.val <= 5000
Sample Testcase 0
Testcase Input
7
9 10 4 2 7 3 6
Testcase Output
6 3 7 2 4 10 9*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {
   
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }

       
    }
}