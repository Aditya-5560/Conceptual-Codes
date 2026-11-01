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

int main()
{
    cout<<Marvellous :: i<<"\n";

    Marvellous :: display();

    return 0;
} 
