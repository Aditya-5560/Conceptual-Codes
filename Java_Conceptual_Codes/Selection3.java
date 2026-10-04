import java.util.*;

class Selection3 
{
    public static void main(String A[]) 
    {
        Scanner sc = new Scanner(System.in);
        int no = 0;

        System.out.println("Enter your age : ");
        no = sc.nextInt();
        if(no<18)
        {
            System.out.println("Not Allowed");
        }
        else
        {
            System.out.println("Allowed");
        }
        sc.close();
    }
}
