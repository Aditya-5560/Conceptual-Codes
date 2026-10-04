import java.util.*;

class ExceptionDemo1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        int no1=0,no2=0,ans=0;

        System.out.println("Enter 1st no");
        no1 = sobj.nextInt();

        System.out.println("Enter 2nd no");
        no2 = sobj.nextInt();

        ans = no1/no2;          //Exception prone code

        System.out.println("Division is "+ans);
    }
}
