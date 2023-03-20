import java.util.Arrays;
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        String[] bitsOfNumList = Arrays.toString(num_list).replace("[","").replace("]","").split(", ");
        for (int i = 0; i < num_list.length/n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = Integer.parseInt(bitsOfNumList[(n*i)+j]);
            }
        }
        return answer;
    }
}