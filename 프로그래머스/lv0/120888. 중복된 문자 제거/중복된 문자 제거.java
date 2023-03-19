class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] bitsMyString = my_string.split("");
        for (String v : bitsMyString) {
            if (!answer.contains(v)) {
                answer += v;
            }
        }
        return answer;
    }
}