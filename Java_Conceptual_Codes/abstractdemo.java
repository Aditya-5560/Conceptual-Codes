abstract class Base
{
    public int i,j;
    public int addition(int no1,int no2){
        return no1+no2;
    }
    abstract int subtraction(int no1,int no2);
}
class Derived extends Base
{
    public int x;
    public int subtraction(int no1,int no2){
        return no1-no2;
    }
    public int multiplication(int no1,int no2){
        return no1*no2;
    }
}
public class abstractdemo{

    public static void main(String[] args)
    {
        Derived dobj = new Derived();

        int ret = 0 ;

        ret = dobj.addition(11,10);
        System.out.println("Addition is : " + ret);

        ret = dobj.subtraction(11,10);
        System.out.println("Substracion is : " + ret);

        ret = dobj.multiplication(11,10);
        System.out.println("Multiplication is : " + ret);

    }
}

