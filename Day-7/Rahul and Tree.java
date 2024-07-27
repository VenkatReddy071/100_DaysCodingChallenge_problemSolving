/*Rahul has an integer array called 'arr' containing unique values. He wants to create a balanced tree where each parent node has smaller valued nodes on its left and larger valued nodes on its right. This balanced tree should ensure that the depth of the two subtrees for every node doesn't differ by more than one.

Can you assist him in creating this type of tree?

Input Format
First-line contains an integer n representing the size of the array
Next line contains n  integer array containing n elements
Output Format
 The output contains n lines denoting the pre-order traversal of nodes. If the left child of the node contains not null value then print the value else print a dot(.) , a similar process for the right child also. Each right child value is separated from the node by “->” sign and each left child by a left arrow sign
Constraints
1<= arr.length <= 10^5
1 <= arr[i] <= 10^9
Sample Testcase 0
Testcase Input
9
1 3 2 4 5 7 6 8 9
Testcase Output
3 <- 5 -> 8
2 <- 3 -> 4
1 <- 2 -> .
. <- 1 -> .
. <- 4 -> .
7 <- 8 -> 9
6 <- 7 -> .
. <- 6 -> .
. <- 9 -> .
Explanation
 Clearly this is the  height balanced tree which is formed by traversing the given array, such that all the left nodes are less than the parent node and all the right  nodes are greater than the parent node.
Sample Testcase 1
Testcase Input
7
10 31 42 19 27 35 14
Testcase Output
 14 <- 27 -> 35
10 <- 14 -> 19
. <- 10 -> .
. <- 19 -> .
31 <- 35 -> 42
. <- 31 -> .
. <- 42 -> .
Explanation
This is the height balanced tree which can be formed using the given array such that all the left nodes are less than the parent node and all the right nodes are of greater value than the parent node.*/

import java.io.*;
import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static Node construct(int[] arr,int lo, int hi) {
        if(lo>hi)return null;
        int mid = hi-((hi-lo)/2);
        int data = arr[mid];
        Node left = construct(arr,lo,mid-1);
        Node right = construct(arr,mid+1,hi);
        Node node = new Node(data, left, right);
        return node;
    }
    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }


    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        Arrays.sort(arr);
        Node root = construct(arr,0,arr.length-1);
        display(root);
    }

}
                        