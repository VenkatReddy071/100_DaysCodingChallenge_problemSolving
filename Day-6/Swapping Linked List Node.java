/*Ram gave Shyaam a challenge, he gave shyaam the head of a linked list, and an integer k.

He asked Shyaam to swap the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

Input Format
Each Input has three lines

Contains N (number of nodes)
Contains N space-seprated integers (value of each node)
Contains K.
Output Format
Print the linked list after swapping the two nodes.

Constraints
The number of nodes in the list is n.
1 <= k <= n <= 10^5
0 <= Node.val <= 100
Sample Testcase 0
Testcase Input
5
1 2 3 4 5
2
Testcase Output
1 4 3 2 5*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int []linkedList=new int[n];
        for(int i=0;i<n;i++)
        {
            linkedList[i]=sc.nextInt();
        }

        int index=sc.nextInt();
        int temp=linkedList[index-1];
       linkedList[index-1]= linkedList[n-index];
       linkedList[n-index]=temp;

       for(int a:linkedList)
       {
        System.out.print(a+" ");
       }

    }
}
   