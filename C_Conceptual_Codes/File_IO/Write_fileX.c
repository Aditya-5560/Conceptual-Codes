#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>


int main()
{
    int fd = 0;
    char arr[] = "Marvellous Infosystems";

    fd = open("Hello.txt",O_RDWR);

    if(fd == -1)
    {
        printf("Unable to open the file\n");
        return -1;
    }
    else
    {
        printf("File gets opened with fd : %d\n",fd);

        write(fd,arr,10);

        close(fd);
    }
    return 0;
}