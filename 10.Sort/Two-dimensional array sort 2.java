import java.util.*;
import java.io.*;
public class two-dimensional array sort2 {
    // Class declaration to store information in a column
    public static class COL{
        int idx; // column number
        int[] arr; // Save row values for each column
        int sum; // um of columns
        COL(int n)
        {
            arr = new int[n];
            sum = 0;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = Integer.parseInt(br.readLine());
            
            COL col[] = new COL[N];
            for(int i = 0; i < N ; i++)
            {
                // Initialize and generate COL information
                col[i] = new COL(N);
                col[i].idx = i;
            }

            for(int i = 0; i < N ; i++)
            {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < N; j++)
                {
                    col[j].arr[i] = Integer.parseInt(st.nextToken());
                    col[j].sum += col[j].arr[i];
                }
            }

            Arrays.sort(col,0,N,new Comparator<COL>() {
                @Override
                public int compare(COL o1, COL o2) {
                    if(o1.sum < o2.sum) return -1;
                    else if(o1.sum > o2.sum) return 1;
                    else
                    {
                        // If the sum is the same, sort in ascending order based on the number of the column
                        if(o1.idx < o2.idx) return -1;
                        else if(o1.idx > o2.idx) return 1;
                        else return 0;
                    }
                }
            });

            System.out.print("#"+test_case);
            for(int i = 0; i < N; i++)
            {
                System.out.print(" "+col[i].arr[N-1]);
            }
            System.out.println();
        }

    }
}