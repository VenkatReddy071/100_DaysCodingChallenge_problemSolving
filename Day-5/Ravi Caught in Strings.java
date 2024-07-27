/*Ravi discovered that some strings read the same forwards and backwards, which are called palindromes.

He noticed that every string he encountered has at least one palindromic substring. He wants to know how to find the longest palindromic substring in a given string.

Can you help him determine the length of this longest palindromic substring?

Input Format
The first line contains n the length of the string
The following line has s, the input string
Output Format
Print the length of the longest palindromic substring that is possible.
Constraints
1<=n<=1000
Sample Testcase 0
Testcase Input
5 
abacc
Testcase Output
3
Explanation
The given string is abacc The possible palindromic substrings present are ‘a’, ‘b,’ ‘c,’ ‘aba,’ ‘cc,’ and the longest substring is ‘aba’ of length 3.*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();

    sc.nextLine();

    String s=sc.nextLine();

    System.out.println(polindrome(s));
}

public static int polindrome(String s)
{
    int n=s.length();
    int length=1;
    boolean dp[][]=new boolean[n][n];

    for(int i=0;i<n;i++)
    {
        dp[i][i]=true;
    }

    for(int i=0;i<n-1;i++)
    {
        if(s.charAt(i)==s.charAt(i+1))
        {
            dp[i][i+1]=true;
            length=2;
        }
    }

    for(int len=3;len<=n;len++)
    {   
        for(int i=0;i<n-len+1;i++)
        {
            int j=i+len -1;
            if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1])
            {
                dp[i][j]=true;
                length=len;
            }
        }
    }
    return length;
}
}