import java.io.*;
import java.util.*;

// Enter a graph with N vertices and M edges
public class fast input {
    public static void main(String[] args) throws Exception{
        // BufferedReader declaration and creation
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer declaration
        StringTokenizer st;
        // Number of test cases in the first line T
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++)
        {
            // First line of each case, number of vertices N, number of edges M
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            for(int i = 0; i < M; i++)
            {
                // Input information of each edge from vertex, to vertex, cost
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());
            }
        }
    }
}