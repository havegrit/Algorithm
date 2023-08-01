import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int n;
        int a;
        int b;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            result += a * b;
        }
        
        if (x != result) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}