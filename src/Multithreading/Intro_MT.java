package Multithreading;

public class Intro_MT implements Runnable
{
   public void run(){
       System.out.println("Hiii");
   }

    static void main(String[] args) {
        Intro_MT a = new Intro_MT();
        Thread th = new Thread(a);
        th.start();
    }
}
