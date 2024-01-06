#include <iostream>
// stack header include
#include <stack>
using namespace std;

int main()
{
    // Stack declaration and creation
    stack<int> stk;
    
    stk.push(1); // 1 added
    stk.push(2); // 2 added
    stk.push(3); // 3 added
    cout << stk.top() << "\n"; // Top data verification : 3
    
    stk.push(4); // 4 added
    stk.push(5); // 5 added
    cout << stk.top() << "\n"; // Top data verification : 5

    stk.pop(); // Top data removal : 5 remove
    cout << stk.top() << "\n"; // Top data verification : 4
    
    // Removes all data in the Stack and print
    while(!stk.empty())
    {
        cout << stk.top() << "\n";
        stk.pop();
    }    
}
