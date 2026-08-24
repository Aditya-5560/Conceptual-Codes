#include<iostream>
using namespace std;

int addition(int No1,int No2){
    int ans = 0;
    ans = No1 + No2;
    return ans;
}

int main()
{
    int value1 = 0, value2 = 0,Result = 0;
    
    cout<<"Enter 1st no. : \n";
    cin>>value1;
    cout<<"Enter 2nd no. : \n";
    cin>>value2;

    Result = addition(value1,value2);

    cout<<"Addition is : "<<Result<<" \n";

    return 0;
}