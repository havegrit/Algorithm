import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b, gcd);

        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }

        return a;
    }

    public static int calculateLCM(int a, int b, int gcd) {
        if (gcd == 0)
            return 0;
        return a * b / gcd;
    }
}