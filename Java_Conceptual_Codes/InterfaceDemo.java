interface Calculations 
{
    int addition(int no1,int no2);
    int substraction(int no1,int no2);
}
class mathematics implements Calculations
{
    public int addition(int no1,int no2){
        return no1+no2;
    }
    public int substraction(int no1,int no2){
        return no1-no2;
    }
    public int multiplication(int no1,int no2){
        return no1*no2;
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        mathematics mobj = new mathematics();
        System.out.println(mobj.addition(11, 10));
        System.out.println(mobj.substraction(11, 10));
        System.out.println(mobj.multiplication(11, 10));

    }
}
