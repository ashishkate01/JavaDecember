// Performing Multiple task from Multiple Thread

package Multithreading;

class Mythread extends Thread
{
    public void run()
    {
        System.out.println("Ashish");
    }
}
class Mythread1 extends Thread
{
    public void run()
    {
        System.out.println("Ashish Patil");
    }
}

public class Intro_Thread2
{
    static void main(String[] args)
    {
        Mythread p = new Mythread();
        p.start();

        Mythread1 q = new Mythread1();
        q.start();
    }
}
