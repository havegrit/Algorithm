import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        List<int[]> patterns = new ArrayList<>();
        List<Integer> scores = new ArrayList<>();
        patterns.add(new int[]{1, 2, 3, 4, 5});
        patterns.add(new int[]{2, 1, 2, 3, 2, 4, 2, 5});
        patterns.add(new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5});
        for (int[] pattern : patterns) {
            scores.add(marking(answering(pattern, answers.length), answers));
        }
        int highScore = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (highScore < scores.get(i)) {
                highScore = scores.get(i);
            }
        }
        List<Integer> topScorers = new ArrayList<>();
        for (int i = 0; i < scores.size(); i++) {
            if (highScore == scores.get(i)) {
                topScorers.add(i+1);
            }
        }
        answer = topScorers.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    public int[] answering(int[] pattern, int questionLength) {
        int[] answer = new int[questionLength];
        for (int i = 0; i < questionLength; i++) {
            answer[i] = pattern[i % pattern.length];
        }
        return answer;
    }

    public int marking(int[] response, int[] answers) {
        int correctCnt = 0;
        for (int i = 0; i < answers.length; i++) {
            if (response[i] == answers[i]) {
                correctCnt++;
            }
        }
        return correctCnt;
    }
}