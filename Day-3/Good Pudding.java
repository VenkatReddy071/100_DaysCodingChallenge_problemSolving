/*Bob is going on a trip to Japan, where he finds a big pudding shop, where he sees a menu and food challenges. Bob accepts the challenge, so here are the game rules:

The pudding shop assigns an integer number to the puddings. The good puddings have a number which when reversed twice remains same.

Bob has to find the good puddings and then for each pudding mark it as 1 or 0.

Note:- For example, Reversing 42100 offers 421 as the leading zeros are not retained, so it is not a good pudding.

Input Format
The first line contains a Integer N –  Number of Test Cases
The next N lines contains an integer
Output Format
Print n lines containing a boolean number – “1” (Good pudding) and “0” (Bad pudding) 

Constraints
0 <= n <= 106

Sample Testcase 0
Testcase Input
3
1010
2123
9004
Testcase Output
0
1
1
Explanation
The Reverse of n (1010) is (101) and second reversal is (101) which is not same as original number which means  it is not a good pudding.


The Reverse of n (2123) is (3212) and second reversal is (2123) which is same as original number which means  it is a good pudding.


The Reverse of n (9004) is (4009) and second reversal is (9004) which is not same as original number which means  it is not a good pudding.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline character after reading n
        
        // Iterate over each line
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            int n1 = input.length();
            
            // Check the last character of the input
            if (n1 > 0 && input.charAt(n1 - 1) == '0') {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
        
        // Close the Scanner
        sc.close();
    }
}
                            