import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        String[] bits = s.split("},\\{");

        Map<Integer, int[]> elements = Arrays.stream(bits)
                .map(bit -> bit.split(","))
                .map(arr -> Arrays.stream(arr).mapToInt(Integer::parseInt).toArray())
                .collect(Collectors.toMap(arr -> arr.length, arr -> arr));

        Set<Integer> answer = new LinkedHashSet<>();

        IntStream.rangeClosed(1, elements.size())
                .mapToObj(elements::get)
                .forEach(arr -> Arrays.stream(arr).forEach(answer::add));

        return answer
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}