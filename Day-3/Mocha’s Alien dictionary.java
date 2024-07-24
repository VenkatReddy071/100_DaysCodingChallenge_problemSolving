/*John and Mocha are two friends. Mocha made his dictionary of length n with strings k1, k2 .. kn and called it Alien dictionary. John tries to test Mocha's Alien dictionary by giving one string s to Mocha. Help Mocha check if John's string can be segmented into a sequence of one or more words from Mocha's Alien dictionary.

Note: The words in the dictionary contain unique words of lowercase English letters and can be found multiple times in the segmentation.

Input Format
The first line contains a string s given by John.
The second line contains n, which is the length of the dictionary of strings of Mocha.
The following n lines are different strings that are present in the Mocha's Alien dictionary
Output Format
Print "true" if the string given by John can be segmented into a sequence of one or more words of Mocha's Alien dictionary.
Else, print "false".
Constraints
1 <= s.length() <= 3*10^2

1<= n <= 10^3

1 <= ki.length() <= 20

Sample Testcase 0
Testcase Input
applepenapple
2
apple
pen
Testcase Output
true
Explanation
In the first sample test case, we can make “applepenapple” using the string “apple” and “pen” by concatenation of the strings “apple”+”pen”+”apple”. So print true for this test case.
Sample Testcase 1
Testcase Input
catsandog
5
cats
dog
sand
and
cat
Testcase Output
false
Explanation
In the second sample test case, we can not make “catsandog” using the string “cat”,”dog”,”sand”,”and” and “cat” at all. So, Print false for this test case.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
            if(s.contains(str[i])){
                s=s.replace(str[i],"");
            }
        }
        System.out.println(s.equals(""));
    }
}
    