import java.util.*;

class Solution {   
    public int solution(int n, int[][] edge) {
        int answer = 0;
        
        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int[] e : edge) {
            int s = e[0];
            int t = e[1];
            graph[s].add(t);
            graph[t].add(s);
        }
        
        int[] dist = bfs(n, graph);
        
        int maxDist = 0;
        for (int i = 1; i <= n; i++) {
            maxDist = Math.max(maxDist, dist[i]);
        }

        for (int i = 1; i <= n; i++) {
            if (dist[i] == maxDist) answer++;
        }
        
        return answer;
    }
    
    private int[] bfs(int n, List<Integer>[] graph) {
        int[] dist = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> q = new LinkedList<>();        
        int start = 1;
        q.offer(start);
        visited[start] = true;
        dist[start] = 0;
        
        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int next : graph[curr]) {
                if (!visited[next]) {
                    visited[next] = true;
                    dist[next] = dist[curr] + 1;
                    q.offer(next);                 
                }
            }
        }        
        return dist;
    }
}