import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] basket = new int[n];
        
        for (int k = 0; k < n; k++) {
            basket[k] = k + 1;
        }
        
        for (int l = 0; l < m; l++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int tmp;
            
            tmp = basket[i];
            basket[i] = basket[j];
            basket[j] = tmp;
        }
        
        for (int o = 0; o < n; o++) {
            System.out.printf(basket[o] + " ");
        }
    }
}