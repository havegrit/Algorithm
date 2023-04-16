import java.util.Arrays;

class Solution {
    public int solution(String s) {
        int answer = Arrays.stream(s.split(" ")).filter(e -> !e.equals("Z")).mapToInt(Integer::parseInt).sum();
        String[] bits = s.split(" ");
        for (int i = 1; i < bits.length; i++) {
            if (bits[i].equals("Z")) {
                answer -= Integer.parseInt(bits[i-1]);
            }
        }
        return answer;
    }
}