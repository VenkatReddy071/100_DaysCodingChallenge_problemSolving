/*One day jack finds a string of characters. He is very keen to arrange the characters in reverse order, i.e., first characters become the last characters, second characters become the second-last characters, and so on.

Now he wants your help  to find the kth character from the new string formed after reverse the original string.

Note: String contain only lowercase Latin letters.

Input Format
The first line contains two integers n, k — the length of array and the value of k respectively.
The second line contains a string containing n characters.
Output Format
Print a single line containing the kth character of the string.

Constraints
1 ≤ k ≤ n≤ 10^6

 

Sample Testcase 0
Testcase Input
5 2
abdfa
Testcase Output
f
Explanation
The reversed string is:"afdba"


The 2nd character after the reversing the string is f.*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
        
        
        int k = sc.nextInt();
        
       
        sc.nextLine();
        
        // Read the string s
        String s = sc.nextLine();
        
        
        if (k > 0 && k <= s.length()) {
            
            System.out.println(s.charAt(n-k));
        } else {
            // Handle case where k is out of bounds
            System.out.println("Invalid index");
        }
        
        sc.close();
    }
}
                    