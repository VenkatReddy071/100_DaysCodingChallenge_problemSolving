/*The city has landmarks numbered from to that can act as starting or finishing points. The landmarks are connected by roads. Each road has a length of n. The city map resembles a binary tree in which each landmark represents a vertex of the tree, and each road represents an edge. The tree is rooted at vertex 1.

As the first step in planning, he wants to find the longest simple path between any two landmarks in the city.

Help Robert to find the maximum length of the marathon he can organize.

Input Format
The first line contains an integer  - the number of landmarks in the city.
The next n lines describe the binary tree structure of the city. The ith line (1 <= i <= n) contains two integers li and ri – the indices of the left and right children of the ith vertex, respectively. If some child doesn't exist, then the number “-1” is set instead.
It is guaranteed that the given graph is a binary tree rooted at vertex 1.
Output Format
The output should consist of a single integer in a new line, the maximum length of the marathon that Robert can organize.
Constraints
 1 ≤ n ≤ 4*10^4
1 ≤ l,r ≤ n or l,r= -1
Sample Testcase 0
Testcase Input
5
2 3
-1 -1
4 5
-1 -1
-1 -1
Testcase Output
3
Explanation
From the given tree, we can observe that length of one of the longest paths highlighted in the figure is 4. One of the ways to organize the marathon is to start at landmark 2 and end at landmark 4.
Sample Testcase 1
Testcase Input
7
5 3
-1 -1
-1 -1
-1 -1
7 2
-1 4
6 -1
Testcase Output
5
Explanation
From the given tree, we can see that the highlighted path is the longest, and its length is 5. The marathon can be started at landmark 3 and ended at landmark 4.*/
mport java.util.*;

class Solution {
    static class Node {
        int left;
        int right;

        Node(int l, int r) {
            left = l;
            right = r;
        }
    }

    static int maxLength;

    public static int findMaxLength(Node[] tree, int node) {
        if (node == -1)
            return 0;

        int leftHeight = findMaxLength(tree, tree[node].left);
        int rightHeight = findMaxLength(tree, tree[node].right);

        maxLength = Math.max(maxLength, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node[] tree = new Node[n + 1];
        for (int i = 1; i <= n; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            tree[i] = new Node(left, right);
        }

        maxLength = 0;
        findMaxLength(tree, 1);
        System.out.println(maxLength);
    }
}
          