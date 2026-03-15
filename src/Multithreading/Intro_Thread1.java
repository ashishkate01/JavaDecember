// Performing single task from Multiple Thread

package Multithreading;

public class Intro_Thread1 extends Thread
{
    public void run()
    {
        System.out.println("Hiii1111");
    }

    static void main(String[] args)
    {
        Intro_Thread1 ab = new Intro_Thread1();
        ab.start();

        Intro_Thread1 ac = new Intro_Thread1();
        ac.start();

    }
}


