#include<stdio.h>

void addition(int no1,int no2)
{
    int result = 0;
    result = no1+no2;                       //Business logic
    printf("Addition is : %d\n",result);
}

int main()
{
    int value1 = 0 , value2 = 0 ;

    printf("Enter 1st no: \n");
    scanf("%d",&value1);

    printf("Enter 2nd no: \n");
    scanf("%d",&value2);

    addition(value1,value2);

    return 0;
}