import java.util.Arrays;

class Solution {
    private static final int INF = 1_000_000_000;
    
    public int solution(int n, int s, int a, int b, int[][] fares) {
        int[][] dist = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        for (int[] fareInfo : fares) {
            int start = fareInfo[0];
            int destination = fareInfo[1];
            int fare = fareInfo[2];

            dist[start][destination] = fare;
            dist[destination][start] = fare;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                if (dist[i][k] == INF) {
                    continue;
                }
                for (int j = 1; j <= n; j++) {
                    if (dist[k][j] != INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        int minFare = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            if (dist[s][i] != INF && dist[i][a] != INF && dist[i][b] != INF) {
                int fare = dist[s][i] + dist[i][a] + dist[i][b];
                minFare = Math.min(minFare, fare);
            }
        }

        return minFare;
    }
}