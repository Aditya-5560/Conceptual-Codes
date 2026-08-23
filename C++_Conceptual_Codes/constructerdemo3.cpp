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
        cout<<"Inside Default Constructer\n";
    }
    //Parameterised Constructer
    PPA(int a,int b)
    {
        cout<<"Inside Parametrised Constructer\n";
    }
    //Copy Constructer
    PPA(PPA &obj)
    {
        cout<<"Inside Copy Constructer\n";
    }
    ~PPA()
    {
        cout<<"Inside Destructer\n";
    }

};
int main()
{
    PPA pobj1;                  //Default
    PPA pobj2(11,21);           //Parameterised
    PPA pobj3(pobj1);          //Copy

    return 0;
}