class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        for (String bit : after.split("")) {
            if(before.contains(bit)) {
                answer++;
                before = before.replaceFirst(bit, "");
            }
        }
        return answer == after.length()?1:0;
    }
}