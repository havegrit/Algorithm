import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] solution(int n) {
        return new Hanoi(1,3,n).toArray();
    }
}

class Hanoi {
    private final List<int[]> paths = new ArrayList<>();

    public Hanoi(int from, int to, int n) {
        calculate(from, to, n);
    }

    public void calculate(int from, int to, int n) {
        int empty = 6 - (from + to);

        if (n == 1) {
            addPath(from, to);
            return;
        }
        calculate(from, empty, n - 1);
        calculate(from, to, 1);
        calculate(empty, to, n - 1);
    }

    private void addPath(int from, int to) {
        paths.add(new int[]{from, to});
    }

    public int[][] toArray() {
        return paths.toArray(int[][]::new);
    }
}
