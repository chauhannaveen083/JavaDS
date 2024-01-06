#include <iostream>
using namespace std;

int main()
{
    double pi = 3.141592653589793;
    cout << fixed;
    cout.precision(2);
    cout << pi << "\n";
    cout.precision(9);
    cout << pi << "\n";
    cout.precision(15);
    cout << pi << "\n";
}