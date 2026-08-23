#include<stdio.h>
struct Demo
{
    int no;
    float f;
    int *p;

};
int main()
{
    int x = 11;
    struct Demo dobj;
    dobj.no=21;
    dobj.f=90.99;
    dobj.p=&x;

    printf("%d\n",*(dobj.p));
    
    return 0;
}