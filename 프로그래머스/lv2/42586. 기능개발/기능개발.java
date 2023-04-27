import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        int i = 0;
        int completionTime = 0;
        Queue<Integer> completionDays = new LinkedList<>();

        while (i != progresses.length) {
            if (progresses[i] >= 100) {
                completionDays.add(completionTime);
                i++;
                completionTime = 0;
            } else {
                progresses[i] += speeds[i];
                completionTime++;
            }
        }
        
        List<Integer> deployableTasks = new ArrayList<>();

        while (!completionDays.isEmpty()) {
            int completionDay = completionDays.poll();
            int completedTasks = 1;
            while (!completionDays.isEmpty() && completionDay >= completionDays.peek()) {
                completionDays.poll();
                completedTasks++;
            }
            deployableTasks.add(completedTasks);
        }

        answer = deployableTasks.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}