#include<iostream>
using namespace std;

namespace Marvellous
{
    int i = 11;
    void display()
    {
        cout<<"Inside display\n";
    }
}

using namespace Marvellous;

int main()
{
    cout<<i<<"\n";

    display();

    return 0;
} 
