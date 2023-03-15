class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        for (String v : String.valueOf(num).split("")) {
            answer++;
            if (v.equals(String.valueOf(k))) {
                return answer;
            }
        }
        return -1;
    }
}