#include<stdio.h>

int addition(int no1,int no2)
{
    int result = 0;
    result = no1+no2;                       //Business logic
    return result;
}

int main()
{
    int value1 = 0 , value2 = 0 ,ans = 0 ;

    printf("Enter 1st no: \n");
    scanf("%d",&value1);

    printf("Enter 2nd no: \n");
    scanf("%d",&value2);

    ans = addition(value1,value2);

    printf("Addition is : %d\n",ans);

    return 0;
}