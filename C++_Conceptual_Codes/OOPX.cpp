#include<iostream>
using namespace std;

class arithematic
{   
    public: 
        int No1;
        int No2;

        arithematic()
        {
            No1 = 0;
            No2 = 0;
        }

        arithematic(int i,int j)
        {
            No1 = i;
            No2 = j;
        }

        int addition()
        {
            int ans = 0;
            ans = No1+No2;
            return ans;
        }
};

int main()
{
    arithematic aobj1(10,11);
    int result;

    result = aobj1.addition();          //Caller object - aobj1

    cout<<"Addition is : "<<result<<" \n";

    return 0;
}