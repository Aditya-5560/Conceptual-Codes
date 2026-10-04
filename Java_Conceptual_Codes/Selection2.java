import java.util.*;

class Selection2 
{
    public static void main(String A[]) 
    {
        Scanner sc = new Scanner(System.in);
        int no = 0;

        System.out.println("Enter your age : ");
        no = sc.nextInt();
        if(no>=18)
        {
            System.out.println("Allowed");
        }
        else
        {
            System.out.println("Not Allowed");
        }
        sc.close();
    }
}
