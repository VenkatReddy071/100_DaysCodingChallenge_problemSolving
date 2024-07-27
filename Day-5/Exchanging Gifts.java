/*Each Christmas, the members of the royal family exchange gifts with each other. The family has n members numbered from 1 to n. However, not everyone in the family gives and receives the same number of gifts.

The youngest member receives a gift from everyone else in the family except himself but does not give any gifts to anyone else. This Christmas, there were a total of m gifts that were exchanged among the family members. You are provided with the data for all m gifts.

Find the number that represents the youngest family member using the given data.

Input Format
The first line of the input contains two integers n and m – the number of family members and the number of gifts that were exchanged.
The next m lines contain two integers each. In the ith line, two integers ai, bi represent that a gift was given by ai to bi.
Note: any ordered pair (ai, bi) will not occur more than once, i.e., a family member does not give more than one gift to the same member.
Output Format
Print a single integer, the number that represents the youngest member of the family.
If no such member is found, print “-1” instead.
Constraints
1 <= n <= 104
0 <= m <= 105
1 <= ai, bi, <= n
Sample Testcase 0
Testcase Input
2 1
1 2
Testcase Output
2
Explanation
Family member 1 gave a gift to family member 2. Now, we can see that 2 did not give any gift to anyone but received a gift from all other members (member 1). Hence, 2 is the youngest member.*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
       
       int array[][]=new int[m][2];

       for(int i=0;i<m;i++)
       {
        array[i][0]=sc.nextInt();
        array[i][1]=sc.nextInt();
       }

       System.out.println(yongest(array,n,m));
}
public static int yongest(int array[][],int n,int m)
{
    int giver[]=new int[n+1];
    int reciver[]=new int[n+1];
     if(n==1 && m==0)
        {
            return 1;
        }
    for(int a[]:array)
    {
        giver[a[0]]++;
        reciver[a[1]]++;
    }

    for(int i=0;i<=n;i++)
    {
        if(reciver[i]==n-1 && giver[i]==0)
        {
            return i;
        
        }
    }
    return -1;
}
}
                