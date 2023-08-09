import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 28;
        
        int[] students = new int[30];
        int[] unsubmittedStudent = new int[2];
        int unsubmittedStudentCnt = 0;
        
        while(cnt != 0) {
            int n = sc.nextInt();
            students[n-1] = 1;
            cnt--;
        }
        
        for (int i = 0; i < 30; i++) {
            if (students[i] == 0) unsubmittedStudent[unsubmittedStudentCnt++] = i+1;
            if (unsubmittedStudentCnt == 2) break;
        }
        
        System.out.println(unsubmittedStudent[0]);
        System.out.println(unsubmittedStudent[1]);
    }
}