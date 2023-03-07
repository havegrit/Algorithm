class Solution {
    public int solution(int n) {
        int answer = 0;
        String intToStr = Integer.toString(n);
        String[] strToArr = intToStr.split("");
        for (String str : strToArr) {
            answer += Integer.parseInt(str);
        }
        return answer;
    }
}