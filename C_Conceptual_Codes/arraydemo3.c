#include<stdio.h>
int main(){
    int arr[4] = {10,20,30,40};
    printf("%d\n",sizeof(arr));         //16
    printf("%d\n",sizeof(arr[2]));      //4
    printf("%d\n",arr[2]);              //30
    
    return 0;
}