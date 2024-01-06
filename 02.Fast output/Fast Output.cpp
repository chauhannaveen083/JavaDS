#include <iostream>
using namespace std;

// Receive N and output from 1 to N
int main()
{
    // 1st time setting
    ios::sync_with_stdio(false); 
    int T;
    // Number of test cases in the first line T
    cin >> T;
    for(int test_case = 1; test_case <= T; test_case++)
    {
        int N;
        // N input
        cin >> N;

        // Print test case number
        cout << "#" << test_case;
        for(int n = 1; n <= N; n++)
        {
            // Print from 1 to N
            cout << " " << n;
        }
        // Print newline text
        cout << "\n";
    }
    return 0;
}