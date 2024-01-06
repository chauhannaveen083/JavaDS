import java.io.*;
import java.util.*;

public class combination {
    static int T;
    static int N,K;
    static int Answer;
 
    public static void back(int depth, int cnt)
    {
        if(cnt == K) Answer++;
        else if(depth == N) return;
        else
        {
            back(depth+1,cnt); // non pick
            back(depth+1,cnt+1); // pick
        }
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        T = Integer.parseInt(br.readLine());
        for(int t = 1 ; t <= T ; t++)
        {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            Answer = 0;
            back(0,0);
            System.out.println("#"+t+" "+Answer);
        }
    }
}
