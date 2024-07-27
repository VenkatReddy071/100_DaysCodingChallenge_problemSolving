/*Steve is participating in competitive coding.

Whenever he makes a submission at time 't', any submission made exactly 5000 seconds before 't' is removed from the queue.
Given N submissions, where each submission is associated with a distinct time 't', determine the maximum size of the submission queue at any point in time after all 'N submissions.

Note: It is guaranteed that every submission uses a strictly larger value of ‘t’ than the previous submission.

 

Input Format
The first line of input contains an integer N representing the size of array which is number of submissions.

The second line contains N space separated integers representing the array arr which contains the timestamps of each submission.

Output Format
Print an integer in a single line containing the maximum size possible.

Constraints
1 <= N <= 10^5

1 <= arr[i] <= 10^8

 

Sample Testcase 0
Testcase Input
3 
300 6000 100000
Testcase Output
1
Explanation
Steve makes 3 submissions at the following times: 300, 6000, and 100000 seconds. In this scenario, each submission at time 't' results in the removal of the previous submission made exactly 5000 seconds before 't'.


After all submissions:


      At time 300, the queue contains submissions: [300]. Size of queue: 1.


      At time 6000, the submission made at time 300 (which was 5000 seconds before this submission) is removed. Queue now: [6000]. Size of queue: 1.


      At time 100000, the submission made at time 6000 (which was 5000 seconds before this submission) is removed. Queue now: [100000]. Size of queue: 1.


Therefore, the maximum size of the submission queue observed at any point after all submissions is 1.*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
       

       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<Integer> q=new LinkedList<>();
        int max=0;
        for(int i=0;i<n;i++){
          int temp=sc.nextInt();
          while(!q.isEmpty() && q.peek()<=temp-5000){
            q.remove();
          }
          q.add(temp);
          max=Math.max(max,q.size());
        }
        System.out.print(max);
    }
}
                