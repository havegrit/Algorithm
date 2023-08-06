import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int x = 0; x < m; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            if (i == j) {
                arr[i-1] = k;
            }

            for (int y = i-1; y <= j-1; y++) {
                arr[y] = k;
            }
        }

        String answer = "%d".formatted(arr[0]);

        for (int z = 1; z < n; z++) {
            answer += " %d".formatted(arr[z]);
        }

        System.out.println(answer);
    }
}