package Multithreading;

public class ThreadDemo extends Thread {

    public void run(){
//        System.out.println(Thread.currentThread().getName());
        System.out.println("Raka is executed by  :  "+Thread.currentThread().getName());


    }

    static void main(String[] args)
    {
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("Ashish");
//        System.out.println(Thread.currentThread().getName());
        ThreadDemo a = new ThreadDemo();
        a.start();
        a.setName("Ak");
        System.out.println(Thread.currentThread().isAlive());

    }
}
