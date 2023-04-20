class Solution {
    public int solution(int a, int b) {
        return compare(a, b);
    }

    public int combine(int a, int b) {
        return Integer.parseInt(a + Integer.toString(b));
    }

    public int multi(int a, int b) {
        return 2 * a * b;
    }

    public int compare(int a, int b) {
        return Math.max(combine(a, b), multi(a, b));
    }
}