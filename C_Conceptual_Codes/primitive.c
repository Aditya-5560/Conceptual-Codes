#include<stdio.h>
int main(){
    char ch = 'A';          //1
    int i = 11;             //4
    float no = 3.14f;       //4
    double d = 90.785634;   //8

    printf("%c\n",ch);
    printf("%d\n",i);
    printf("%f\n",no);
    printf("%lf\n",d);

    return 0;
}