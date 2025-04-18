import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[3];

        int answerNum = 0;
        for (int i = 0; i < 3; i++) {
            input[i] = br.readLine().strip();
            if (isNumeric(input[i])) {
                answerNum = Integer.parseInt(input[i]) + (3 - i);
                break;
            }
        }

        if (isMultipleOfThree(answerNum)) {
            if (isMultipleOfFive(answerNum)) {
                System.out.println("FizzBuzz");
                return;
            }
            System.out.println("Fizz");
            return;
        } else if (isMultipleOfFive(answerNum)) {
            System.out.println("Buzz");
            return;
        }

        System.out.println(answerNum);
        return;
    }

    private static boolean isNumeric(String x) {
        try {
            Integer.parseInt(x);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static boolean isMultipleOfThree(int x) {
        return (x % 3 == 0) ? true : false;
    }

    private static boolean isMultipleOfFive(int x) {
        return (x % 5 == 0) ? true : false;
    }

}