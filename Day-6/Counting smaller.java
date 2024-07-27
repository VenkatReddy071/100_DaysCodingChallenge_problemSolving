/*Mocha is given yet another task. In the task, mocha is provided with a sequence of n numbers.

In the sequence for every number, we have to find the count of elements that are strictly smaller than it and generate a sequence from it.

Your task is to help mocha in building the sequence.

Input Format
The first line contains an integer n

The second line contains n integers nums[1],nums[2]…..nums[n].

Output Format
The output contains n integers where every integer represents the count of smaller elements.

Constraints
1<=n<=10^5

1<=nums[n]<=10^2

Sample Testcase 0
Testcase Input
5
8 1 2 2 3
Testcase Output
4 0 1 1 3 
Explanation
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).*/
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
       for(int i=0;i<n;i++)
        {
           int cnt=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]<arr[i])
                    cnt++;
            }
            System.out.print(cnt+" ");
        }

    }
}
        