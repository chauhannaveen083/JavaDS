import java.io.*;
import java.util.*;

public class Graph input_adjacent list {
    // Class declaration to store trunk information in adjacency list
    public static class edge{
        int node, cost;
        edge(int node, int cost)
        {
            this.node = node;
            this.cost = cost;
        }
    }
    // Enter a directed graph with N vertices and M edges
    public static void main(String[] args) throws Exception{
        // BufferedReader declaration and creation
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer declaration
        StringTokenizer st;
        // Number of test cases in the first line T
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++)
        {
            // First line of each case, number of vertices N, number of trunk lines M
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            // Create adjacency list
            ArrayList<edge>[] adjList = new ArrayList[N+1];

            for(int n = 1; n <= N; n++)
            {
                // Create adjacency list for each vertex (initialize)
                adjList[n] = new ArrayList<edge>();
            }

            for(int i = 0; i < M; i++)
            {
                // Information input of each trunk from vertex, to vertex, cost
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());
                
                adjList[from].add(new edge(to,cost));
            }
        }
    }
}