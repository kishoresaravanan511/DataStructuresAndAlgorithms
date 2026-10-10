package multithreadingworkflow;

public class ThreadBasics
{
    public static void main(String[] args) throws InterruptedException
    {
        //both threads gets executed concurrently. , when we use start() , otherwise directly run() calling leads to normal method call, not uses concurrent working mechanisms.


        ThreadTask t1 = new ThreadTask();  //new state
        t1.start();  //newly created thread is started parallel working,Runnable state - using t1.getState();
        //t1.start();  //you can call one start() exactly,once per thread object,attempting second start() leads to "IllegalThreadStateException".
        //t1.run(2,5);  //general method class.

        RunnableInterfaceThread r = new RunnableInterfaceThread();  //method for runnable interface .
        Thread t2 = new Thread(r);
        t2.start();  //internally calls the respective run() in a class.
    }
}
class ThreadTask extends Thread
{
    @Override
    public void run()   //contains business logic  -> runnable's own method, so we override it
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }
        System.out.println("10");
    }
    public void run(int a,int b) //different method signature ,method overloading
    {
        System.out.println("It is normal/general method");
    }
}
class RunnableInterfaceThread implements Runnable //second method for creating thread,why this method comes, when already thread class is present, because of , multiple inheritance purpose.
{
    @Override
    public void run()
    {
        for(int i=95;i<=100;i++)
        {
            System.out.println(i);
        }
    }
}