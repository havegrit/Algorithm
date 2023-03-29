class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                num.append(my_string.charAt(i));
            } else {
                if(num.length() > 0) {
                    answer += Integer.parseInt(num.toString());
                    num.setLength(0);
                }
            }
        }
        if(num.length() > 0) answer+=Integer.parseInt(num.toString());
        return answer;
    }
}