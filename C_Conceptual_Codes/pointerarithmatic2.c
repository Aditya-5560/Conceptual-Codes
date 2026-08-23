#include<stdio.h>

int main()
{
    int Arr[] = {11,21,51,101,111};
    
    int *p = NULL;
    int *q = NULL;

    p = &(Arr[1]);
    q = &(Arr[3]);
        
    printf("%d\n",*p);      //21
    printf("%d\n",*q);      //101
    
    p++;
    q--;

    printf("%d\n",*p);      //51
    printf("%d\n",*q);      //51
    
    return 0;
}