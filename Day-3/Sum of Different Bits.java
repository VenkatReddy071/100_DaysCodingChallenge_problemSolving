/*James has two binary strings, ‘a’ and ‘b’. He asked Jimmy to find the sum of the number of positions at which the corresponding bits are different between a and all contiguous substrings of b of length of a.

Help Jimmy to find the total sum.

Input Format
The first line of input consists of string a.
The second line of input consists of string b.
Output Format
Print a single line of output consisting of the total sum.

Constraints
1<= a.length , b.length<= 2 * 105

Sample Testcase 0
Testcase Input
01
00111
Testcase Output
3
Explanation
For the first sample case, there are four contiguous substrings of b of length |a|: "00", "01", "11", and "11". The distance between "01" and "00" is |0 - 0| + |1 - 0| = 1. The distance between "01" and "01" is |0 - 0| + |1 - 1| = 0. The distance between "01" and "11" is |0 - 1| + |1 - 1| = 1. Last distance counts twice, as there are two occurrences of string "11". The sum of these edit distances is 1 + 0 + 1 + 1 = 3.*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       String a = scanner.nextLine().trim();
        String b = scanner.nextLine().trim();
        
        // Lengths of strings a and b
        int m = a.length();
        int n = b.length();
        
        // Variable to store the total sum of distances
        int totalSum = 0;
        
        // Iterate through all substrings of b of length m
        for (int i = 0; i <= n - m; i++) {
            int currentSum = 0;
            // Calculate distance between a and b.substring(i, i + m)
            for (int j = 0; j < m; j++) {
                if (a.charAt(j) != b.charAt(i + j)) {
                    currentSum++;
                }
            }
            totalSum += currentSum;
        }
        
        // Print the total sum of distances
        System.out.println(totalSum);
        
        scanner.close();
    }
}
                           