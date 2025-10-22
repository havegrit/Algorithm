import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        
        long start = 1;
        long end = (long) times[times.length - 1] * n;
        long answer = end;
        
        while (start <= end) {
            long mid = (start + end) / 2;
            long processed = 0;
            
            for (int time : times) {
                processed += mid / time;
                if (processed >= n) break;
            }
            
            if (processed >= n) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return answer;
    }
}