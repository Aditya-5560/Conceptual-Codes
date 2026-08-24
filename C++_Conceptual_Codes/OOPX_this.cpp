#include<iostream>
using namespace std;

class arithematic
{   
    public: 
        int No1;
        int No2;

        arithematic()
        {
            this->No1 = 0;
            this->No2 = 0;
        }

        arithematic(int i,int j)
        {
            this->No1 = i;
            this->No2 = j;
        }

        //int addition(arithematic * this)
        int addition()
        {
            int ans = 0;
            ans = this->No1+this->No2;
            return ans;
        }
};

int main()
{
    arithematic aobj1(10,11);
    int result;
    
    //result = addition(&aobj1)
    result = aobj1.addition();          

    cout<<"Addition is : "<<result<<" \n";

    return 0;
}