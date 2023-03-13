class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int i;
        if (direction.equals("right")) {
            i = 1;
            for (int bit : numbers) {
                if (i == numbers.length) {
                    answer[0] = bit;
                }else{
                    answer[i++] = bit;
                }
            }
        } else {
            i = numbers.length;
            for (int bit : numbers) {
                if (i == numbers.length) {
                    answer[numbers.length-1] = bit;
                    i = 0;
                }else{
                    answer[i++] = bit;
                }
            }
        }
        return answer;
    }
}