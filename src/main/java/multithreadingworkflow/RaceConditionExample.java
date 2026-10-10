package multithreadingworkflow;

public class RaceConditionExample
{
    public static void main(String[] args) throws InterruptedException
    {
        Bank b1 = new Bank();

        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b1);

        t1.start();
        t2.start();

        //t2.sleep(1000);  //blocked state
        //System.out.println(t2.getState());
    }
}
class Bank implements Runnable
{
    int bal=1000;  //shared variable , stateless changes when more than one thread object access it.
    @Override
    public void run()
    {
        withdraw(800);
    }
    synchronized void withdraw(int amt)
    {
//        //just example for blocked state
//        while(true)
//        {
//            //infinite loop makes t2 in blocked state everytime
//        }


        if(amt <= bal) {
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
            bal -= amt;
            System.out.println(Thread.currentThread().getName() + " Balance " + bal );
        }
 //       else {
//            System.out.println("Insufficient balance");
//        }

    }
}
