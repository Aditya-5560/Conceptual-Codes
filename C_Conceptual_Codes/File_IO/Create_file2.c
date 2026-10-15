#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>


int main()
{
    int fd = 0;

    fd = creat("Hello.txt",0777);

    if(fd == -1)
    {
        printf("Unable to create the file\n");
        return -1;
    }
    else
    {
        printf("File gets Created with fd : %d\n",fd);
    }
    return 0;
}