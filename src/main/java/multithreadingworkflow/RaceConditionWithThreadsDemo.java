package multithreadingworkflow;

class RaceConditionWithThreadsDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        SharedResourceClass resource = new SharedResourceClass();
        Task t1 = new Task(resource);
        Task t2 = new Task(resource);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(resource.counter);
    }
}
class SharedResourceClass
{
    public int counter = 0;
}
class Task extends Thread
{
    private SharedResourceClass resource;
    public Task(SharedResourceClass resource)
    {
        this.resource = resource;
    }
    @Override
    public void run()
    {
        for(int i=0;i<1000;i++)
            resource.counter++;
    }
}