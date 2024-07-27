/*In computer class, every student is somehow relative to each other. The teacher represents all students in the form of a binary search tree (BST).Every student has a  roll number as a random integer. In this binary search tree, the roll number of every student is a node of the binary search tree. He randomly picks up any two students from the class and names them as x and y, respectively. He asks students to find the ancestor origin of x and y in the tree.

The ancestor origin is defined between two nodes x and y as the lowest node that has both x and y as descendants (where we allow a node to be a descendant of itself).

Help students to find the lowest common ancestor (LCA) of two nodes, x and y.

Input Format
First line of the input contains an integer n  —  number of nodes in the binary search tree.
Second-line contains n space-separated integer – nodes of the binary search tree. Nodes are in the form of level order traversal of binary search tree.
Third line contains two space-separated integers – x and y.
Output Format
Print an integer which is the lowest common ancestor (LCA) of nodes x and y.

Constraints
The number of nodes in the tree is in the range [2, 10^5].
-10^9 <= value of node <= 10^9
All nodes are unique.
x != y
x and y will exist in the BST.
Sample Testcase 0
Testcase Input
9
6 2 8 0 4 7 9 14 1
2 8
Testcase Output
6
Explanation
This Binary search tree has nine nodes. 6 is the root node of the tree.2, 8 are the descendants of node 6. Hence, the LCA of nodes 2 and 8 is 6.	
Sample Testcase 1
Testcase Input
7
6 2 8 0 4 7 9  
2 4
Testcase Output
2
Explanation
This Binary search tree has seven nodes. 6 is the tree's root node. Since a node can be a descendant of itself according to the LCA definition, so the LCA of nodes 2 and 4 is 2.*/
mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Main {
    public static class Node{

        int data;
        Node left,right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      int n=sc.nextInt();

      int arr[]=new int[n];

      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }

      int x=sc.nextInt();
      int y=sc.nextInt();
      Arrays.sort(arr);
        

       Node curr= insert(0,n-1,arr);
       Node rs= findLCA(curr,x,y);
       System.out.println(rs.data);
    }

    public static Node insert(int i,int j,int arr[])
    {
        if(i >=j)
        {
            return null;
        }
        int mid=(i+j)/2;
        Node node=new Node(arr[mid]);

        node.left=insert(i,mid,arr);
        node.right=insert(mid+1,j,arr);

        return node;
    }


    public static Node findLCA(Node root, int x, int y) {
        if (root == null) {
            return null;
        }

        if (x < root.data && y < root.data) {
            return findLCA(root.left, x, y);
        } else if (x > root.data && y > root.data) {
            return findLCA(root.right, x, y);
        } else {
            return root;
        }
    }

    
}
                 