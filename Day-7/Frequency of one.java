/*Suman is a laborious college boy and he is very good at mathematics. He is doing his assignment of computer science but he is not able to solve one coding problem.This problem consists of an integer, N and Suman has to find out the total number of set bits in all numbers starting from 1 to N.

Suman needs your help in solving the problem.

Input Format
First and only one line of the input contains one integer N.

Output Format
Print an integer - the total number of set bits in all the numbers starting  from 1 to N.

Constraints
0<N<=10^7
Sample Testcase 0
Testcase Input
5
Testcase Output
7
Explanation
We have to count total set bits in digit 1 to 5
for (1) => (0001), set bits = 1
for (2) => (0010), set bits = 1
for (3) => (0011), set bits = 2
for (4) => (0100), set bits = 1
for (5) => (0101), set bits = 2
Total set bits = 7
Therefore, for N = 5, result is 7
Sample Testcase 1
Testcase Input
4
Testcase Output
5
Explanation
for (1) => (0001), set bits = 1
for (2) => (0010), set bits = 1
for (3) => (0011), set bits = 2
for (4) => (0100), set bits = 1
Total set bits = 5
Therefore, for N = 4, result is 5*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {
    public static int  binary(int n)
    {
        String s=Integer.toBinaryString(n);

        int count=0;

        for(char c:s.toCharArray())
        {
            if(c=='1')
            {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
    int res=0;
        for(int i=1;i<=n;i++)
        {
           res+=binary(i);
        }

        System.out.println(res);
    }
}
            