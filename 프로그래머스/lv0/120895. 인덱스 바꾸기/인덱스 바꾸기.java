class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] my_string_bits = my_string.split("");
        char tmp = my_string.charAt(num1);
        my_string_bits[num1] = Character.toString(my_string.charAt(num2));
        my_string_bits[num2] = Character.toString(tmp);
        for (String bit : my_string_bits) {
            answer += bit;
        }
        return answer;
    }
}