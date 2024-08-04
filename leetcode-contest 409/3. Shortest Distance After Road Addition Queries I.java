/*ou are given an integer n and a 2D integer array queries.

There are n cities numbered from 0 to n - 1. Initially, there is a unidirectional road from city i to city i + 1 for all 0 <= i < n - 1.

queries[i] = [ui, vi] represents the addition of a new unidirectional road from city ui to city vi. After each query, you need to find the length of the shortest path from city 0 to city n - 1.

Return an array answer where for each i in the range [0, queries.length - 1], answer[i] is the length of the shortest path from city 0 to city n - 1 after processing the first i + 1 queries.

 

Example 1:

Input: n = 5, queries = [[2,4],[0,2],[0,4]]

Output: [3,2,1]

Explanation:



After the addition of the road from 2 to 4, the length of the shortest path from 0 to 4 is 3.



After the addition of the road from 0 to 2, the length of the shortest path from 0 to 4 is 2.



After the addition of the road from 0 to 4, the length of the shortest path from 0 to 4 is 1.

Example 2:

Input: n = 4, queries = [[0,3],[0,2]]

Output: [1,1]

Explanation:



After the addition of the road from 0 to 3, the length of the shortest path from 0 to 3 is 1.



After the addition of the road from 0 to 2, the length of the shortest path remains 1.

 

Constraints:

3 <= n <= 500
1 <= queries.length <= 500
queries[i].length == 2
0 <= queries[i][0] < queries[i][1] < n
1 < queries[i][1] - queries[i][0]
There are no repeated roads among the queries.

Seen this question in a real interview before?
1/5 */

class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
     ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        
        for(int i=0;i<=n;i++)
        {
            arr.add(new ArrayList<>());
            
            if(i < n)
            {
                arr.get(i).add(i+1);
            }
        }
        
       ArrayList<Integer> res=new ArrayList<>();
        
        
        for(int i=0;i<queries.length;i++)
        {
            int u1=queries[i][0];
            int u2=queries[i][1];
            
            
            arr.get(u1).add(u2);
            
            int shortest=bfs(arr,n);
            
            res.add(shortest);
        }
        
        int re[]=new int[res.size()];
        for(int i=0;i<res.size();i++)
        {
            re[i]=res.get(i);
        }
        return re;
        
    }
    
    public int bfs(ArrayList<ArrayList<Integer>> graph,int n){
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited[0] = true;
        int level = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int node = queue.poll();
                if (node == n - 1) {
                    return level;
                }
                for (int neighbor : graph.get(node)) {
                    if (!visited[neighbor]) {
                        queue.offer(neighbor);
                        visited[neighbor] = true;
                    }
                }
            }
            level++;
        }
        
        return -1;
    }
}