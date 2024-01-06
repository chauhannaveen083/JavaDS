#include <iostream>
// queue header include
#include <queue>
using namespace std;

int main()
{
    // Queue declaration and creation
    queue<int> que;
    
    que.push(1); // 1 added
    que.push(2); // 2 added
    que.push(3); // 3 added
    cout << que.front() << "\n"; // Front data verification : 1
    
    que.push(4); // 4 added
    que.push(5); // 5 added
    cout << que.front() << "\n"; // Front data verification : 1

    que.pop(); // Front data removal : 1 remove
    cout << que.front() << "\n"; // Front data verification : 2
    
    // Removes all data in the queue and print
    while(!que.empty())
    {
        cout << que.front() << "\n";
        que.pop();
    }    
}
