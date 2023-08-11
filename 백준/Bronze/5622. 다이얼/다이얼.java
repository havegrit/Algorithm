import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word = sc.next();
        int answer = 0;
        
        for (String bit:word.split("")) {
            switch (bit) {
                case "A", "B", "C" -> answer += 3;
                case "D", "E", "F" -> answer += 4;
                case "G", "H", "I" -> answer += 5;
                case "J", "K", "L" -> answer += 6;
                case "M", "N", "O" -> answer += 7;                   
                case "P", "Q", "R", "S" -> answer += 8;
                case "T", "U", "V" -> answer += 9;
                case "W", "X", "Y", "Z" -> answer += 10;
            }
        }
        System.out.println(answer);
    }
}