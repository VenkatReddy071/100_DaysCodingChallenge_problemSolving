/*We are given a string s consisting of only lowercase letters of english, and a character ch.

Let the index of last occurence of ch be idx, reverse the string from idx.

Input Format
First line contains a string s.

Output Format
Return the transformed string

Constraints
1<=|s|<=100000

Sample Testcase 0
Testcase Input
abc c
Testcase Output
abc
Explanation
Last occurrence of c is the last character of the string, so reversing it won’t change the string.
Sample Testcase 1
Testcase Input
abxcced c
Testcase Output
abxcdec*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.next();

        int length=str.length();

        char c=sc.next().charAt(0);
        int index=-1;
        for(int i=length-1;i>=0;i--)
        {
            if(str.charAt(i)==c)
            {
                    index=i;break;
            }
        }
        if(index!=-1){
        for(int i=0;i<index;i++)
        {
            System.out.print(str.charAt(i));
        }

        for(int i=length-1;i>=index;i--)
        {
            System.out.print(str.charAt(i));
        }
        }
        else{
            System.out.print(str);
        }
    }
}
         