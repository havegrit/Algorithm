import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] ordered = Arrays.stream(emergency).sorted().toArray();
        for (int i = 0; i < ordered.length / 2; i++) {
            int temp = ordered[i];
            ordered[i] = ordered[ordered.length - 1 - i];
            ordered[ordered.length - 1 - i] = temp;
        }
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < ordered.length; j++) {
                if(emergency[i] == ordered[j]) {
                    emergency[i] = j + 1;
                    break;
                }
            }
        }
        return emergency;
    }
}