#include<iostream>
using namespace std;
class PPA
{
    public:
        int no1;
        int no2;
    //Default Constructer
    PPA()
    {
        cout<<"Inside Default constructer\n";
    }
    ~PPA()
    {
        cout<<"Inside Destructer\n";
    }

};
int main()
{
    PPA pobj1;
    PPA pobj2;

    return 0;
}