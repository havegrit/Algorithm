import java.util.Arrays;
import java.util.Queue;
import java.util.ArrayDeque;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        if (!Arrays.asList(words).contains(target)) {
            return 0;
        }
        
        int wordLen = words.length;
        
        Queue<Pair> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[wordLen];
        queue.offer(new Pair(begin, 0));
        
        while(!queue.isEmpty()) {
            Pair curr = queue.poll();
            String currWord = curr.word;
            int cnt = curr.cnt;
            
            if (currWord.equals(target)) {
                answer = cnt;
                break;
            }
            
            for (int i = 0; i < wordLen; i++) {
                if (!visited[i] && isOneLetterDiff(currWord, words[i])) {
                    visited[i] = true;
                    queue.offer(new Pair(words[i], cnt + 1));
                }
            }
        }
        
        return answer;
    }
    
    private boolean isOneLetterDiff(String word1, String word2) {
        int cnt = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                cnt++;
                if (cnt > 1) {
                    return false;                
                }
            }
        }
        
        return true;
    }
    
    private class Pair {
        String word;
        int cnt;

        Pair(String word, int cnt) {
            this.word = word;
            this.cnt = cnt;
        }
    }
}