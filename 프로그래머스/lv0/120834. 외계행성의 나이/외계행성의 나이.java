class Solution {
    public String solution(int age) {
        String answer = "";
        String[] ageToAlphabet = new String[]{"a","b","c","d","e","f","g","h","i","j"};
        for (String bit : String.valueOf(age).split("")) {
            answer += ageToAlphabet[Integer.parseInt(bit)];
        }
        return answer;    
    }
}