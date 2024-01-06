import java.io.*;
 
public class permutation {
    static int T;
    static int N;
    static int Answer;
    static int visit[];
 
    public static void back(int depth)
    {
        if(depth>0)Answer++;
        if(depth == N) return;
        else
        {
            for(int i = 0 ; i < N ; i++)
            {
                if(visit[i] == 0)
                {
                    visit[i] = 1;
                    back(depth+1);
                    visit[i] = 0;
                }
            }
        }
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for(int t = 1 ; t <= T ; t++)
        {
            N = Integer.parseInt(br.readLine());
            visit = new int [N];
            for(int i = 0 ; i < N ;i++) 
            {
                visit[i] = 0;
            }
            Answer = 0;
            back(0);
            System.out.println("#"+t+" "+Answer);
        }
    }
}
