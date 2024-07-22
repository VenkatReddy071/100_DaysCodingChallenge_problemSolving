Distinct K
/*You wish to help Ashish, who possesses a collection of N strings, some of which may be duplicated, and has been assigned the task of finding the kth unique string.

If the number of unique strings is less than k, he needs to display an empty string. Considering you are Ashish's best friend can you assist him with this challenge?

Input Format
The first line contains an integer N denoting the number of strings.
The next N lines contain strings.
The next line contains an integer k.
Output Format
The output contains the kth distinct string. If there are less than k unique string display an empty string.

Constraints
1<=N<=105
-10^8<=arr[i].length()<=10^8
Sample Testcase 0
Testcase Input
6
d
b
c
b
c
a
2
Testcase Output
a
Explanation
The only strings in arr that are distinct are "d" and "a." The letter "d" comes first, making it the first separate string.

Because "a" appears second, it is the second distinct string. "a" is returned since k == 2.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
  

    public static String findKthUniqueString(int N, String[] strings, int k) {
        if (N == 0 || k <= 0) {
            return "";
        }

        Map<String, Integer> countMap = new HashMap<>();
        List<String> uniqueStrings = new ArrayList<>();

        // Count occurrences of each string
        for (String s : strings) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }

        // Collect unique strings that appear exactly once
        for (String s : strings) {
            if (countMap.get(s) == 1) {
                uniqueStrings.add(s);
            }
        }

        // Check if we have enough unique strings
        if (uniqueStrings.size() >= k) {
            return uniqueStrings.get(k - 1); // k-1 because k is 1-based index
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Reading input
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] strings = new String[N];
        for (int i = 0; i < N; i++) {
            strings[i] = scanner.nextLine();
        }
        int k = scanner.nextInt();

        // Finding kth unique string
        String result = findKthUniqueString(N, strings, k);
        System.out.println(result);
        
        scanner.close();
    }
}
                  