class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running....");
    }
}
public class ThreadDemo3
{
    public static void main(String[] args) {
        System.out.println("Inside Main Thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        // dobj1.start();              //Error
        // dobj2.start();              //Error

        
    }
}