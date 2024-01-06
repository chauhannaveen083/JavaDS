#include <stdio.h>

// Enter a graph with N vertices and M edges
int main()
{
    int T;
    // Number of test cases in the first line T
    scanf("%d",&T);
    for(int test_case = 1; test_case <= T; test_case++)
    {
        int N,M;
        // First line of each case, number of vertices N, number of edges M
        scanf("%d %d",&N,&M);
        for(int i = 0; i < M; i++)
        {
            int from, to, cost;
            // Input information of each edge from vertex, to vertex, cost
            scanf("%d %d %d", &from, &to, &cost);
        }
    }
    return 0;
}