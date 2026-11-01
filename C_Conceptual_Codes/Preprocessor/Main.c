#include"Marvellous.h"

//Entry point function
int main()
{
    float fRet = 0.0f;

    fRet = area(7.5f);

    printf("Area of circle is : %f\n",fRet);

    return 0;       //Return Success
}

//gcc Main.c Helper.c -o myexe
//./myexe


//gcc Main.c Helper.c -save-temps -o myexe