#include <iostream>
// queue header include
#include <queue>
using namespace std;

int main()
{
    priority_queue<int,vector<int>,greater<int>> minHeap;
    priority_queue<int> maxHeap;
    
    for(int i=1;i<=10;i++) 
    {
        minHeap.push(i);
        maxHeap.push(i);
    }

    printf("minHeap :");
    while(!minHeap.empty())
    {
        printf(" %d",minHeap.top());
        minHeap.pop();
    }
    printf("\n");

    printf("maxHeap :");
    while(!maxHeap.empty())
    {
        printf(" %d",maxHeap.top());
        maxHeap.pop();
    }
    printf("\n");
    return 0;
}