/*
Alice is cleaning her home for Diwali. She lines up "n" bulbs that she has in her home. Each bulb has a value written on it - the power of the bulb. The non-functional bulb has a value of 0.

She wants your help in cleaning her home. She wants you to move all the non-functional bulbs to the end of the row of bulbs while maintaining the original relative ordering of the functional bulbs.

Can you help Alice?

Input Format
The first line of the input contains 'n' number of bulbs in her home
The following n lines contains the Integers – the power of each bulb.
Output Format
Output the final order of the bulbs denoted by the power of the corresponding bulb. 
Constraints
1 <= n < 10^5
-2^31 <= power[i] <=2^31-1
Sample Testcase 0
Testcase Input
3
0
0
15
Testcase Output
15 0 0
Explanation
Moving the non-functional bulbs (power = 0) to the end while maintaining the original relative ordering of the functional bulbs ( power != 0)

Sample Testcase 1
Testcase Input
9
5
3
0
4
1
0
0
2
1
Testcase Output
5 3 4 1 2 1 0 0 0*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int arr[]=new int [n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
     int lastNonZeroFoundAt = 0;
         for (int current = 0; current < arr.length; current++) {
            if (arr[current] != 0) {
               
                int temp = arr[lastNonZeroFoundAt];
                arr[lastNonZeroFoundAt] = arr[current];
                arr[current] = temp;
                
              
                lastNonZeroFoundAt++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
         