import java.util.Queue;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        Queue<Integer> pq = new PriorityQueue<>();
        
        for (int food : scoville) {
            pq.offer(food);
        }

        while (pq.size() > 1) {
            int curr = pq.poll();
            if (curr >= K) {
                return answer;
            }
            int next = pq.poll();
            pq.offer(curr + next * 2);
            answer++;
        }
        
        if (!pq.isEmpty() && pq.peek() >= K) {
            return answer;
        }

        return -1;
    }
}