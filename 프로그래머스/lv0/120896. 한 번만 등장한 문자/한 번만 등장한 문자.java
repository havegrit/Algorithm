import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        for (int i = 0; i < s.length()-1; i++) {
            if (s.substring(i + 1, s.length()).contains(s.subSequence(i,i+1))) {
                s = s.replaceAll(Character.toString(s.charAt(i)), " ");
            }
        }
        s = Arrays.stream(s.replaceAll(" ", "")
                .split(""))
                .sorted()
                .collect(Collectors.joining());
        return s;
    }
}