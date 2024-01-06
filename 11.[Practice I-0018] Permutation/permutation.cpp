#include <iostream>
 
int T;
int N;
int Answer;
int visit[11];
 
void back(int depth)
{
    if(depth>0)Answer++;
    
    if(depth == N) return;
    else
    {
        for(int i = 0 ; i < N ; i++)
        {
            if(visit[i] == 0)
            {
                visit[i] = 1;
                back(depth+1);
                visit[i] = 0;
            }
        }
    }
}
 
int main()
{
    scanf("%d",&T);
    
    for(int t = 1 ; t <= T ; t++)
    {
        scanf("%d",&N);
        for(int i = 0 ; i < N ;i++) 
        {
            visit[i] = 0;
        }
        
        Answer = 0;
        
        back(0);
        
        printf("#%d %d\n",t,Answer);
    }
    return 0;
}
