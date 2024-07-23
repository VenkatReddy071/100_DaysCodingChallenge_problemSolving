/*Chris is at the entrance of Adventureland, where there is a magic grid of size N x N, filled entirely with the number 1.

To gain entry, he must correctly calculate the sum of the integers on both the main and secondary diagonals of the grid. The task is to help Chris quickly calculate this sum.

Note: As both diagonals are considered separately, the center element is counted only once when N is odd.

Input Format
The first line of input consists of integer N – representing the number of rows and columns of the matrix.

Output Format
Print a single line of output consisting of the sum of the diagonal integers

Constraints
1<= N <= 105

Sample Testcase 0
Testcase Input
2
Testcase Output
4
Explanation
The matrix is:


1 1


1 1


The total sum will be (1+ 1) + (1 + 1) = 4.

Sample Testcase 1
Testcase Input
4
Testcase Output
8
Explanation
We take the sum of that integers which is shown as bold in below matrix:


[1,1,1,1]


[1,1,1,1]


[1,1,1,1]


[1,1,1,1]


=> 8.

Sample Testcase 2
Testcase Input
3
Testcase Output
5
Expl*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

       int size=sc.nextInt();

       if(size%2==0)
       {
        System.out.println(size*2);
       }
       else{
        System.out.println((size*2)-1);
       }
    }
}
             