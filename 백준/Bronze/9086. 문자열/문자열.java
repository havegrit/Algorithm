import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            String word = sc.next();
            System.out.println("%c%c".formatted(word.charAt(0), word.charAt(word.length()-1)));
        }
    }
}