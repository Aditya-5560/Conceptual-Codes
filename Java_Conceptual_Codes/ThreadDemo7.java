class Demo extends Thread
{
    // public Demo(String name)
    // {
    //     currentThread().setName(name);
    // }
    public void run()
    {
        System.out.println("Thread is running.... "+currentThread().getName());
    }
}
public class ThreadDemo7
{
    public static void main(String[] args) throws Exception
    {              
        System.out.println("Inside Main Thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("First Thread");
        dobj2.setName("Second Thread");

        dobj1.start();
        dobj2.start();

        dobj1.join();
        dobj2.join();


        System.out.println("End of main Thread");       //Issue
    }
}