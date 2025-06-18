import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = n;
        
        boolean[][] graph = new boolean[n + 1][n + 1];
        
        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            graph[a][b] = true;
            graph[b][a] = true;
        }
        
        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            graph[a][b] = false;
            graph[b][a] = false;
            
            boolean[] visited = new boolean[n + 1];
            visited[1] = true;
            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(1);
            int cnt = 1;

            while (!queue.isEmpty()) {
                int node = queue.poll();
                for (int i = 1; i <= n; i++) {
                    if (graph[node][i] && !visited[i]) {
                        visited[i] = true;
                        queue.add(i);
                        cnt++;
                    }
                }
            }
            answer = Math.min(answer, Math.abs(n - cnt * 2));
            graph[a][b] = true;
            graph[b][a] = true;
        }
                
        return answer;
    }
}