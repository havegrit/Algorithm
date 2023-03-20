class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 10; i > 0; i--) {
            int factorial = 1;  
            for (int j = i; j > 0 ; j--) {
                factorial *= j;
                if (factorial > n) {
                    break;
                }
            }
            if (factorial <= n) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}