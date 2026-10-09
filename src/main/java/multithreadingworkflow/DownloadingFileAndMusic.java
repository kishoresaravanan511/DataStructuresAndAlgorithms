package multithreadingworkflow;

public class DownloadingFileAndMusic
{
    public static void main(String[] args) throws InterruptedException
    {
        DownloadFile d = new DownloadFile();

        PlayMusic p = new PlayMusic();
        Thread t = new Thread(p);

        d.start();
        t.start();
    }
}
class DownloadFile extends Thread{
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++) {
            System.out.println("File downloading " + i*10 + "%");

            try {
                Thread.sleep(2000);  //whenever we use sleep , it may or may not throws InterupptedException
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
class PlayMusic implements Runnable{
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++) {
            System.out.println("playing music " + i);
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
