import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] basket = new int[n+1];
        
        for (int p = 1; p <= n; p++) {
            basket[p] = p;
        }
        
        for (int k = 0; k < m; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            
            while (i < j) {
                int temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;
                i++;
                j--;
            }
        }
        
        for (int o = 1; o <= n; o++) {
            System.out.printf(basket[o] + " ");    
        }
    }
}