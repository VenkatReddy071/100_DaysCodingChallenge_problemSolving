/*Once upon a time, a city biker embarked on an exciting road trip. This journey was laid out across a sequence of n+1 points, each with varying altitudes. The biker's adventure commenced at point 0, where the altitude was a humble 0 meters above sea level.

During his expedition, he encountered different terrains. For every segment between points i and i+1, where 0≤i<n, the biker faced varying challenges in altitude. Each segment was represented by an integer array called gain of length n, where gain[i] denoted the net gain in altitude between points i and i+1.

The biker's goal was to find the highest altitude he reached during his journey. This altitude was determined by the net gain in altitude at each point along the way. It could be a thrilling peak or a serene valley, depending on the varying gains between consecutive points.

Input Format
The first line of the input contains an integer n  - the number of elements.
The next  line contains n space-separated integers.
Output Format
City Biker needs to return the highest altitude of a point.

Constraints
n == gain.length
1 <= n <= 100
-100 <= gain[i] <= 100
Sample Testcase 0
Testcase Input
5
-5 5 1 5 -3
Testcase Output
6
Explanation
The biker's altitude gains were as follows:



From point 0 to 1: -5 (net loss, altitude at point 1: 0+(-5)=-5)

From point 1 to 2: +5 (net gain, altitude at point 2: (-5)+5=0)

From point 2 to 3: +1 (net gain, altitude at point 3: 0+1=1)

From point 3 to 4: +5 (net gain, altitude at point 4: 1+5=6)

From point 0 to 1: -3 (net loss, altitude at point 5: 6+(-3)=3)*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int totalSum=0,currSum=0;

        for(int i=0;i<size;i++)
        {
            totalSum+=arr[i];
            if(totalSum > currSum)
            {
                currSum=totalSum;
            }
        }
        System.out.println(currSum);
    }
}
         