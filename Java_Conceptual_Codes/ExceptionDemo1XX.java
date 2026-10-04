import java.util.*;

class ExceptionDemo1XX {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        int no1=0,no2=0,ans=0;

        try
        {
            System.out.println("Enter 1st no");
            no1 = sobj.nextInt();

            System.out.println("Enter 2nd no");
            no2 = sobj.nextInt();

            ans = no1/no2;          //Exception prone code
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Excepption occoured : "+aobj);
        }
        catch(Exception eobj)
        {
            System.out.println("Inside Generic Catch");
        }
        finally
        {
            System.out.println("Inside Finally block");
        }


        System.out.println("Division is "+ans);
    }
}
