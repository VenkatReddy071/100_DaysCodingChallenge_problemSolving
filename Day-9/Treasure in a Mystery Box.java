/*As you set out on an adventure to explore a mysterious box, containing n enchanted compartments to lead you to a treasure, you encounter a peculiar challenge. At each move, you can choose to advance by opening 1 or 2 compartments.

Your mission is to decipher the total count of distinct ways to reach the nth compartment of this enigmatic box.

Input Format
A single integer n - number of enchanted compartments
Output Format
Print a single integer that denotes the total count of distinct ways to reach the nth compartment of this enigmatic box.
Constraints
1 <= n <= 45
Sample Testcase 0
Testcase Input
4
Testcase Output
5
Explanation
There are five ways to climb to the top.


1. 1 compartment + 1 compartment + 1 compartment + 1 compartment


2. 1 compartment + 1 compartment + 2 compartment


3. 1 compartment + 2 compartment + 1 compartment


4. 2 compartment + 1 compartment + 1 compartment


5. 2 compartment + 2 compartment*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int dp[]=new int[n*n];
        Arrays.fill(dp,-1);
       System.out.println(check(n,0,dp));
    }

    public static int check(int n,int i,int dp[]){
        if(i==n)
        {
            return 1;
        }
        if(i>n)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
       int left= check(n,i+1,dp);
       int right= check(n,i+2,dp);

       return dp[i]=left+right;
    }
}