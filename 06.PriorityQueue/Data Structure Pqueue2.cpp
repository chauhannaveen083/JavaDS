#include <iostream>
// queue header include
#include <queue>
using namespace std;
struct A_B_Min_Heap
{
    int A,B;
    A_B_Min_Heap(int a, int b): A(a), B(b){ }
    bool operator<(const A_B_Min_Heap & ref) const{
        if(A == ref.A) return B<ref.B;
        else return A<ref.A;
    }
};

struct B_A_Min_Heap
{
    int A,B;
    B_A_Min_Heap(int a, int b): A(a), B(b){ }
    bool operator<(const B_A_Min_Heap & ref) const{
        if(B == ref.B) return A<ref.A;
        else return B<ref.B;
    }
};

int main()
{
    priority_queue<A_B_Min_Heap> ABminHeap;
    priority_queue<B_A_Min_Heap> BAminHeap;

    for(int a=1,b=10;a<=10;a++,b--) 
    {
        ABminHeap.push(A_B_Min_Heap(a, b));
        BAminHeap.push(B_A_Min_Heap(a, b));
    }

    printf("A_B_Min_Heap :");
    while(!ABminHeap.empty())
    {
        A_B_Min_Heap cur = ABminHeap.top();
        ABminHeap.pop();
        printf(" (%d,%d)",cur.A,cur.B);
    }
    printf("\n");

    printf("B_A_Min_Heap :");
    while(!BAminHeap.empty())
    {
        B_A_Min_Heap cur = BAminHeap.top();
        BAminHeap.pop();
        printf(" (%d,%d)",cur.A,cur.B);
    }
    printf("\n");
    return 0;
}