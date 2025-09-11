import java.util.Queue;
import java.util.ArrayDeque;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[] dx = new int[]{1, -1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0, 1});
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;
        
        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            int cx = curr[0];
            int cy = curr[1];
            int dist = curr[2];
            
            if (cx == n - 1 && cy == m - 1) {
                return dist;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, dist + 1});
                }
            }
        }
        return -1;
    }
}