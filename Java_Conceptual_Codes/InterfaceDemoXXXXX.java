interface A 
{
    void fun();       

}
interface B
{
    void fun(int no);
}
class Demo implements A,B
{
    public void fun(){
        System.out.println("Inside Fun");
    }
    public void fun(int no){
        System.out.println("Inside Fun with no");
    }
}
class InterfaceDemoXXXXX {
    public static void main(String[] args) {
        Demo dobj = new Demo();
        dobj.fun();
        dobj.fun(11);
       
    }
}
