#include<iostream>
using namespace std;

namespace Marvellous
{
    int i = 11;
    void display()
    {
        cout<<"Inside display of Marvellous\n";
    }
}

namespace PPA
{
    int i = 21;
    void display()
    {
        cout<<"Inside display of PPA\n";
    }
}

int main()
{
    cout<<Marvellous :: i<<"\n";

    Marvellous :: display();
 
    cout<<PPA :: i<<"\n";

    PPA :: display();

    return 0;
} 
