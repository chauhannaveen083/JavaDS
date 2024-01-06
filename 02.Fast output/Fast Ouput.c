#include <stdio.h>

// Receive N and output from 1 to N
int main()
{
    int T;
    // Number of test cases in the first line T
    scanf("%d",&T);
    for(int test_case = 1; test_case <= T; test_case++)
    {
        int N;
        // N input
        scanf("%d",&N);

        // Print test case number
        printf("#%d",test_case);
        for(int n = 1; n <= N; n++)
        {
            // Print from 1 to N
            printf(" %d",n);
        }
        // Print newline text
        printf("\n");
    }
    return 0;
}