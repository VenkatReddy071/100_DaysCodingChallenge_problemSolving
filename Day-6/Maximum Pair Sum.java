/* a magical bag, there are "n" balls, each with a unique number. You are asked to figure out the the pair of balls where their difference and product combine to create the maximum sum among all possible combinations. 

Display the maximum sum.

Input Format
The first line of input consists of the integer n – representing the number of balls

The second line consists of n integers – a1, a2, a3, . . . , an.

Output Format
Print the maximum sum obtained.

Constraints
2 <= n <= 100000

-100 <= ai <= 1000.

Sample Testcase 0
Testcase Input
4
2 4 5 1
Testcase Output
21
Explanation
Among the pair of balls possible, the pair of 2nd and 3rd ball gives the maximum sum:


((5-4)+(5*4))= (1+20) = 21*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] balls = new int[n];
        for (int i = 0; i < n; i++) {
            balls[i] = scanner.nextInt();
        }

        Arrays.sort(balls);

        // Find the pair with the maximum sum
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int difference = balls[j] - balls[i];
                int product = balls[j] * balls[i];
                int sum = difference + product;

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}
                    