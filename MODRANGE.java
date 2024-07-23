/*In a game, there are 2 queens which are to be placed on 2 mats. The mats are arranged with orders specified with numbers on them. The placement of the queen is to be done in such a manner that when one of the orders of the mat, when divided with the other order, gives the maximum possible value. The order of the mats is between the two integers denoted by l and r.

Find the order of mats on which the two queens can be placed.

Input Format
The first line contains one positive integer t (1 ≤ t ≤ 104), denoting the number of test cases.

The only line of each test case contains two integers l, r.

Output Format
For every test case, output the largest possible value of a % b over all pairs (a, b denoting the order of mats) for which l <= b <= a <= r.

Constraints
1 <= t <= 104

1 <= l <= r <= 109

Sample Testcase 0
Testcase Input
3
1 1
2 12
4 9
Testcase Output
0
5
4
Explanation
For test case 1 the only choice for a and b is 1 so the only possible pair is (1,1).


For test case 2 we can choose pair (11, 6) which gives the best possible answer.


For test case 3 we can choose pair (9, 5) which gives the best possible answer.

Topics
Companies*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
      
        for(int i=0;i<n;i++)
        {   
                int l=sc.nextInt();
                int r=sc.nextInt();
                
                
                
               int maxMod = (r / 2 < l) ? r % l : r % (r / 2 + 1);
               System.out.println(maxMod);
            

        }
        
        
                
        }   
}
    