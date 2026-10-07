class Demo extends Thread
{
    public void run()
    {
        System.out.println("Thread is running....");
    }
}
public class ThreadDemo6
{
    public static void main(String[] args) throws Exception
    {              
        System.out.println("Inside Main Thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.start();
        dobj2.start();

        dobj1.join();
        dobj2.join();


        System.out.println("End of main Thread");       //Issue
    }
}