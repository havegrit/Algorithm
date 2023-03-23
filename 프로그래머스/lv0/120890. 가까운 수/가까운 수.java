class Solution {
    public int solution(int[] array, int n) {
            int answer = 0;
        int proximateVal = 100;
        for (int bit : array) {
            if(Math.abs(bit-n) <= proximateVal) {
                if (Math.abs(bit - n) == proximateVal) {
                    answer = Math.min(bit, answer);
                } else {
                    answer = bit;
                }
                proximateVal = Math.abs(bit-n);
            }
        }
        return answer;
    }
}