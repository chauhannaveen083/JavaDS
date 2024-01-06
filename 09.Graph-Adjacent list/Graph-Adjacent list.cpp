#include <iostream>
#include <vector>
#define VMAX 1000
using namespace std;

// Structure declaration to store edge table
struct edge{
    int node,cost;
    edge(int n, int c): node(n), cost(c){ }
};
// Adjacent list declaration
vector<edge> adjList[VMAX+1];

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
        for(int n = 1; n <= N; n++)
        {
            // Initialize adjacency list for each vertex
            adjList[n].clear();
        }
        for(int i = 0; i < M; i++)
        {
            int from,to,cost;
            // Information input of each trunk from vertex, to vertex, cost
            scanf("%d %d %d",&from,&to,&cost);
            adjList[from].push_back(edge(to,cost));
        }
    }
    return 0;
}