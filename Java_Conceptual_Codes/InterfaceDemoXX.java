interface Demo 
{
    int no = 11;        //public static final
    void fun();         //public abstract

}
class hello implements Demo
{
    public void fun(){

    }
}
class InterfaceDemoXX {
    public static void main(String[] args) {

       System.out.println(Demo.no);
       //Demo.no++;
    }
}
