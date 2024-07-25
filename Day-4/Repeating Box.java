/*Kritika has a collection of 2*n boxes, with n unique labels. Among them, one box is repeated n times.

How can Kritika identify and print the label of the repeated box?

Input Format
An integer 2*n which represents the number of boxes.

2*n space-separated integers representing the labels on the boxes.

Output Format
An integer value representing the label of the box repeated n times.

Constraints
2 <= n <= 5000
number of boxes = 2*n
0 <= label[i] <= 10^4 
Sample Testcase 0
Testcase Input
6
6 5 1 5 5 7
Testcase Output
5
Explanation
The number of boxes is 6. And we can see that the boxes with label 5 gets repeated 3 times and therefore we display 5. 

Sample Testcase 1
Testcase Input
4
0 1 1 2
Testcase Output
1 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        ArrayList<Integer>ob=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
                int ele=sc.nextInt();
                if(ob.contains(ele))
                {
                    System.out.println(ele);
                    break;
                }
                ob.add(ele);
                if(i==n-1)
                {
                     System.out.println(ob.get(0));
                }
                
        }
       
    }
}
                            