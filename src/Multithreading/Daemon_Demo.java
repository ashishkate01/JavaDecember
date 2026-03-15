package Multithreading;

public class Daemon_Demo extends Thread
{
    public void run()
    {
//        System.out.println(Thread.currentThread().isDaemon());

        System.out.println("Daemon Thread  : "+Thread.currentThread().getName());
    }

    static void main(String[] args)
    {
        System.out.println("Parent Thread  : "+Thread.currentThread().getName());
        Daemon_Demo dd = new Daemon_Demo();
//        Daemon_Demo dd = new Daemon_Demo();
        dd.setDaemon(true);
        dd.start();
    }
}
