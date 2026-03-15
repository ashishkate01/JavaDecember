// Performing single task from single Thread
package Multithreading;

public class Intro_Thread extends Thread
{
    public void run()
    {
        System.out.println("Hi");
    }

    static void main(String[] args)
    {
        Intro_Thread it = new Intro_Thread();
        it.start();

    }
}
