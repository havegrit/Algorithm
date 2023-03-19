import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[][] morseMapping = {
                {".-", "a"},
                {"-...", "b"},
                {"-.-.", "c"},
                {"-..", "d"},
                {".", "e"},
                {"..-.", "f"},
                {"--.", "g"},
                {"....", "h"},
                {"..", "i"},
                {".---", "j"},
                {"-.-", "k"},
                {".-..", "l"},
                {"--", "m"},
                {"-.", "n"},
                {"---", "o"},
                {".--.", "p"},
                {"--.-", "q"},
                {".-.", "r"},
                {"...", "s"},
                {"-", "t"},
                {"..-", "u"},
                {"...-", "v"},
                {".--", "w"},
                {"-..-", "x"},
                {"-.--", "y"},
                {"--..", "z"}
        };
        Map<String, String> morseToMap = new HashMap<>();
        for (String[] pair : morseMapping) {
            morseToMap.put(pair[0], pair[1]);
        }
        for (String bit : letter.split(" ")) {
            answer += morseToMap.get(bit);
        }
        return answer;
    }
}