class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running....");
    }
}
public class ThreadDemo4
{
    public static void main(String[] args) {
        System.out.println("Inside Main Thread");

        Thread dobj1 = new Thread(new Demo());
        Thread dobj2 = new Thread(new Demo());

        dobj1.start();              //Error
        dobj2.start();              //Error
        
    }
}