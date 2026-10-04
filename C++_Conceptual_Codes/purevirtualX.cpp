#include<iostream>
using namespace std;

#pragma pack(1)
class Base
{
    public:
        int i,j;
        int addition(int no1,int no2){
            return no1+no2;
        }
        virtual int subtraction(int no1,int no2) = 0;
};

#pragma pack(1)
class Derived : public Base
{
    public:
        int x;
        int subtraction(int no1,int no2){
            return no1-no2;
        }
        int multiplication(int no1,int no2){
            return no1*no2;
        }
};
int main(){

    Derived dobj;

    int ret = 0 ;

    cout<<"Size of Base : "<<sizeof(Base)<<"\n";
    cout<<"Size of Derived : "<<sizeof(Derived)<<"\n";


    ret = dobj.addition(11,10);
    cout<<"Addition is :"<<ret<<"\n";

    ret = dobj.subtraction(11,10);
    cout<<"Subtraction is :"<<ret<<"\n";

    ret = dobj.multiplication(11,10);
    cout<<"Multiplication is :"<<ret<<"\n";


    return 0;
}
