/*In a peculiar basketball game, where World Cup is happening, Aniket is tasked with keeping the scores of the match. The game unfolds in rounds, and with each rounds there is a syste like thematches played previously will be highlighted in future scores too i.e where the scores of previous rounds can influence those in the future.

Aniket starts each game with an null record.

He is provided with a list of operations, represented by strings, denoted as 'ops'.

Each operation, 'ops[i]', can be one of the following: an integer 'x', indicating the recording of a new score 'x'; a '+', which means recording a score that is the sum of the previous two scores (and it is ensured that there are always two previous scores available); 'D', signifying recording a score that is double the previous score (and there is always a previous score); or 'C', indicating the invalidation of the previous score, removing it from the record (and it is ensured that there is always a previous score to remove).

Aniket's task is to process these operations and calculate the sum of all the scores and keep record of it for the final judgement.

Input Format
The first line contains a single integer n.

From the Second line take input a vector of a string of size n.

Output Format
Print a single integer that is the sum of all the scores on the record.

Constraints
1 <= ops.length <= 1000

ops[i] is "C", "D", "+", or a string representing an integer in the range [-3 * 104, 3 * 104].

For operation "+", there will always be at least two previous scores on the record.

For operations "C" and "D", there will always be at least one previous score on the record.

Sample Testcase 0
Testcase Input
7
3 4 + D C D +
Testcase Output
49
Explanation
- Aniket records 3: [3] - Aniket records 4: [3, 4] - Aniket records the sum of the last two scores (3 + 4): [3, 4, 7] - Aniket records double the previous score (7 * 2): [3, 4, 7, 14] - Aniket invalidates the previous score: [3, 4, 7] - Aniket records double the previous score (7 * 2): [3, 4, 7, 14] - Aniket records the sum of the last two scores (7 + 14): [3, 4, 7, 14, 21] Total score: 3 + 4 + 7 + 14 + 21 = 49

Sample Testcase 1
Testcase Input
8
1 2 + C D 8 D +
Testcase Output
55
Explanation
- Aniket records 1: [1] - Aniket records 2: [1, 2] - Aniket records the sum of the last two scores (1 + 2): [1, 2, 3] - Aniket invalidates the previous score: [1, 2] - Aniket records double the previous score (2 * 2): [1, 2, 4] - Aniket records 8: [1, 2, 4, 8] - Aniket records double the previous score (8 * 2): [1, 2, 4, 8, 16] - Aniket records the sum of the last two scores (8 + 16): [1, 2, 4, 8, 16, 24] Total score: 1 + 2 + 4 + 8 + 16 + 24 = 55*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n1=sc.nextInt();
        sc.nextLine();

        String s[]=sc.nextLine().split(" ");

        Stack<Integer> ob = new Stack<>();
        for(String str:s)
        {
            if(str.equals("+"))
            {
                int ele=ob.peek();
                ob.pop();
                int ele2=ob.peek();
               ob.add(ele);
                ob.add(ele+ele2);
            }

            else if(str.equals("D"))
            {
                int ele=ob.pop();
                ob.add(ele);
                ob.add(ele*2);
            }

            else if(str.equals("C"))
            {
                ob.pop();
            }
            else{
                int n=Integer.parseInt(str);
                ob.add(n);
            }
        }
        int sum=0;
        for(int res:ob)
        {
            sum+=res;
        }
       System.out.println(sum);
      
      
    }
}
     