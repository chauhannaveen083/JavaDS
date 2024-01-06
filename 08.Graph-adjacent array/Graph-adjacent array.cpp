#include <iostream>
#define VMAX 1000
using namespace std;

// Create adjacency array
int adjMat[VMAX+1][VMAX+1];

// Enter a directed graph with N vertices and M edges
int main()
{
    int T;
    // Number of test cases in the first line T
    scanf("%d",&T);
    for(int test_case = 1; test_case <= T; test_case++)
    {
        int N, M;
        // First line of each case, number of vertices N, number of trunk lines M
        scanf("%d %d",&N,&M);

        for(int i = 1; i <= N; i++)
        {
            for(int j = 1; j <= N; j++)
            {
                // Initial value to indicate that the trunk is not connected
                adjMat[i][j] = -1;
            }
        }
        for(int i = 0; i < M; i++)
        {
            int from,to,cost;
            // Information input of each trunk from vertex, to vertex, cost
            scanf("%d %d %d",&from,&to,&cost);
            adjMat[from][to] = cost;
        }
    }
    return 0;
}