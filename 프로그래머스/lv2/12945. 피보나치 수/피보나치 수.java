import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<Integer, Integer> cache = new HashMap<>();
    public int solution(int n) {
        return fibonacci(n);
    }

    public int fibonacci(int n) {
        if (cache.containsKey(n)) return cache.get(n);

        int result;

        if (n <= 1) {
            result = n;
        } else {
            result = solution(n - 2) + solution(n - 1);
        }

        result %= 1234567;
        cache.put(n, result);

        return result;
    }
}