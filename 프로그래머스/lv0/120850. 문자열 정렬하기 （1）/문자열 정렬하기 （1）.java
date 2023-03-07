import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("\\D", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}