import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int repeat;
        StringBuilder typeName = new StringBuilder("long");

        if (n % 4 == 0) {
            repeat = n / 4 - 1;
        } else {
            repeat = n / 4;
        }

        for (int i = 0; i < repeat; i++) {
            typeName.append(" long");
        }

        typeName.append(" int");

        System.out.println(typeName);
    }
}