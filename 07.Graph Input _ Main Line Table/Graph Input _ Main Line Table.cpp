#include <iostream>
#define MMAX 1000
using namespace std;

// Structure declaration to store edge table
struct edge{
    int from,to,cost;
    edge(){}
    edge(int f, int t, int c): from(f), to(t), cost(c){ }
};

// Declaring Array to Save Arrangement Tables
edge E[MMAX];
// Enter a directed graph with N vertices and M edges
int main()
{
    int T;
    // Number of test cases in the first line T
    scanf("%d",&T);
    for(int test_case = 1; test_case <= T; test_case++)
    {
        int N, M;
        // First line of each case, number of vertices N, number of edges M
        scanf("%d %d",&N,&M);
        for(int i = 0; i < M; i++)
        {
            int from,to,cost;
            // Input information of each edge from vertex, to vertex, cost
            scanf("%d %d %d",&from,&to,&cost);
            E[i] = edge(from,to,cost);
        }
    }
    return 0;
}