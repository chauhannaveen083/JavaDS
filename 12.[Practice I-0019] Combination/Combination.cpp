#include <iostream>
 
int T;
int N,K;
int Answer;
 
void back(int depth, int cnt)
{
    if(cnt == K) Answer++;
    else if(depth == N) return;
    else
    {
        back(depth+1,cnt); // non pick
        back(depth+1,cnt+1); // pick
    }
}
 
int main()
{
    scanf("%d",&T);
    for(int t = 1 ; t <= T ; t++)
    {
        scanf("%d %d",&N,&K);
        Answer = 0;
        back(0,0);
        printf("#%d %d\n",t,Answer);
    }
    return 0;
}
