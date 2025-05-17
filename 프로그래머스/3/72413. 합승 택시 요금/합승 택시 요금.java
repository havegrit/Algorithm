import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    static class Node implements Comparable<Node> {
        int to, cost;
        Node(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }
    
    public int solution(int n, int s, int a, int b, int[][] fares) {
        List<Node>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] fare : fares) {
            int u = fare[0], v = fare[1], w = fare[2];
            graph[u].add(new Node(v, w));
            graph[v].add(new Node(u, w));
        }
        
        int[] distS = dijkstra(n, s, graph);
        int[] distA = dijkstra(n, a, graph);
        int[] distB = dijkstra(n, b, graph);
        
        int answer = Integer.MAX_VALUE;
        for (int k = 1; k <= n; k++) {
            if (distS[k] == Integer.MAX_VALUE || distA[k] == Integer.MAX_VALUE || distB[k] == Integer.MAX_VALUE) continue;
            answer = Math.min(answer, distS[k] + distA[k] + distB[k]);
        }
        return answer;
    
    }
    
    private int[] dijkstra(int n, int start, List<Node>[] graph) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            if (dist[cur.to] < cur.cost) continue;
            for (Node next : graph[cur.to]) {
                if (dist[next.to] > dist[cur.to] + next.cost) {
                    dist[next.to] = dist[cur.to] + next.cost;
                    pq.offer(new Node(next.to, dist[next.to]));
                }
            }
        }
        return dist;
    }
}