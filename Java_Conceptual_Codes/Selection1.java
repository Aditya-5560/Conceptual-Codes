import java.util.*;

class Selection1 
{
    public static void main(String A[]) 
    {
        Scanner sc = new Scanner(System.in);
        int no = 0;

        System.out.println("Enter no : ");
        no = sc.nextInt();
        if(no%2==0)
        {
            System.out.println("It is even");
        }
        else
        {
            System.out.println("It is odd");
        }
        sc.close();
    }
}
