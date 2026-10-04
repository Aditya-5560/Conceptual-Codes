class Base1
{
    int i,j;
    void fun()                                      //1000
    { System.out.println("Inside Base fun"); }
    void gun()                                      //2000
    { System.out.println("Inside Base gun"); }
    void sun()                                      //3000
    { System.out.println("Inside Base sun"); }
    void run()                                      //4000
    { System.out.println("Inside Base run"); }

}
class Derived1 extends Base1
{
    int x;
    int i,j;
    void fun()                                          //5000
    { System.out.println("Inside Derived fun"); }
    void sun()                                          //6000
    { System.out.println("Inside Derived sun"); }
    void mun()                                          //7000
    { System.out.println("Inside derived mun"); }
    void bun()                                          //8000
    { System.out.println("Inside Derived bun"); }

}
public class virtualdemo6{
    public static void main(String[] args) {

        Base1 bp = new Derived1();

        bp.fun();       //Derived fun
        bp.gun();       //Base gun
        bp.sun();       //Derived sun
        bp.run();       //Base run

        // bp.mun();   //Error
        // bp.run();   //Error

    }
}