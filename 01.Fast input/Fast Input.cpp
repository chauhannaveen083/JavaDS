#include <iostream>
using namespace std;

// Enter a graph with N vertices and M edges
int main()
{
    // 1st time setting
    ios::sync_with_stdio(false);
    int T;
    // Number of test cases in the first line T
    cin >> T;
    for(int test_case = 1; test_case <= T; test_case++)
    {
        int N, M;
        // First line of each case, number of vertices N, number of edges M
        cin >> N >> M;
        for(int i = 0; i < M; i++)
        {
            int from,to,cost;
            // Input information of each edge from vertex, to vertex, cost
            cin >> from >> to >> cost;
        }
    }
    return 0;
}