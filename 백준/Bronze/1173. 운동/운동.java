import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        
        int timer = 0;
        int workoutTime = 0;
        int currentPurse = m;
        
        if(m + T > M) {
            System.out.println(-1);
            return;
        }
        
        while(workoutTime < N) {
            if(currentPurse + T > M) {
                currentPurse -= R;
                if(currentPurse < m) {
                    currentPurse = m;
                }
            } else {
                currentPurse += T;
                workoutTime++;
            }
            timer++;
        }
        System.out.println(timer);
        return;
    }
}