#include <iostream>
// Algorithm header include for sort
#include <algorithm>
#define NMAX 20
using namespace std;
struct COL
{
    int idx;
    int arr[NMAX+1];
    int sum;
    bool operator<(const COL & ref) const{
        if(sum == ref.sum) return idx < ref.idx;
        else return sum < ref.sum;
    }
};
COL col[NMAX+1];
int main()
{
    int T;
    scanf("%d",&T);
    for(int test_case = 1; test_case <= T; test_case++)
    {
        int N;
        scanf("%d",&N);
        
        for(int i = 0; i < N ; i++)
        {
            // Initialize COL information
            col[i].idx = i;
            col[i].sum = 0;
        }

        for(int i = 0; i < N ; i++)
        {
            for(int j = 0; j < N; j++)
            {
                scanf("%d",&col[j].arr[i]);
                col[j].sum += col[j].arr[i];
            }
        }

        sort(col,col+N);

        printf("#%d",test_case);
        for(int i = 0; i < N; i++)
        {
            printf(" %d",col[i].arr[N-1]);
        }
        printf("\n");
    }
    return 0;
}