import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int i, int j, int k) {
return Arrays.stream(IntStream.range(i, j + 1).mapToObj(n -> n + "").collect(Collectors.joining()).split("")).filter(n -> n.equals(String.valueOf(k))).toArray().length;
    }
}