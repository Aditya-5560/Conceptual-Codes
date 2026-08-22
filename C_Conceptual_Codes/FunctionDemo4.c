#include<stdio.h>

int main(){
    int value1 = 0 , value2 = 0 ,ans = 0 ;
    printf("Enter 1st no: \n");
    scanf("%d",&value1);

    printf("Enter 2nd no: \n");
    scanf("%d",&value2);

    ans = value1 + value2;          //Business logic

    printf("Addition is : %d\n",ans);

    return 0;
}