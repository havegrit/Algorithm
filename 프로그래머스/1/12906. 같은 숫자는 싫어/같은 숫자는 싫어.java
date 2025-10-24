import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> q = new ArrayList<>();
        
        int pre = 10;
        for (int num : arr) {
            if (pre != num) {
                q.add(num);
                pre = num;
            }
        }
        
        int[] answer = new int[q.size()];
        for (int i = 0; i < q.size(); i++) {
            answer[i] = q.get(i);
        }

        return answer;
    }
}