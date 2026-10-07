class Demo extends Thread
{
    public void run()
    {
        int i=0;
        for(i=1;i<=10;i++)
        {
            System.out.println("Thread "+Thread.currentThread().getName()+" "+i);

        }
    }
}
public class ThreadDemo8
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