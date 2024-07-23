/*n a magical land, there is a young explorer named Raju who embarks on a thrilling adventure with his enchanted vehicle. This magical vehicle can only move in four directions: right (R), left (L), up (U), and down (D). Raju starts his journey at the heart of the mystical forest, located at coordinates (0, 0).

As Raju follows a sequence of mysterious symbols etched on ancient stones, he maneuvers his magical vehicle accordingly. 'R' guides him to the right, 'L' to the left, 'U' upwards, and 'D' downwards. The direction he faces does not matter; the symbols' magic ensures his vehicle moves in the intended direction.

Your mission is to help Raju determine whether he will return to the enchanted forest's center (0,0) after completing all his moves. If he successfully navigates back to the starting point, the forest's magic will protect him, and he will be able to continue his adventure. If not, he might be lost in the mystical realm forever.

Can you assist Raju in deciphering his fate? If he ends up back at the starting point, please say YES; otherwise, say NO.

Input Format
The first line of the input contains an integer n  — the size of string moves
The second line contains the string moves
Output Format
Raju needs to print ”YES” if car returns to origin, else “NO”.

Constraints
1 <= moves.length <= 2 * 104
moves only contains the characters 'U', 'D', 'L' and 'R'.
Sample Testcase 0
Testcase Input
6
UUDDLR
Testcase Output
YES
Explanation
The robot moves:



From (0,0) to (1,0)

From (1,0) to (2,0)

From (2,0) to (1,0)

From (1,0) to (0,0)

From (0,0) to (-1,0)

From (-1,0) to (0,0)


After these moves, the robot ends up back at the origin (0, 0).

Sample Testcase 1
Testcase Input
5
UDLRL
Testcase Output
NO
Explanation
In this scenario, the robot moves:



From (0,0) to (1,0)

From (1,0) to (0,0)

From (0,0) to (-1,0)

From (-1,0) to (0,0)

From (0,0) to (-1,0)


After these moves, the robot does not return to the origin (0, 0). Therefore, the output is false.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static boolean check(String s)
    {
        int x=0,y=0;

        for(char c:s.toCharArray())
        {
            if(c=='U' || c=='R')
            {
                x++;
            }
            else if(c=='D' || c=='L')
            {
                x--;
            }
            
        }
        return x==0&&y==0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();

        if(check(str))
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
               