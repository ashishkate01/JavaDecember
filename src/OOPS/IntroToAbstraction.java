package OOPS;

abstract class vehical{

     int No_of_tyres;

     void display()
     {
         System.out.println("No of tyres :" +No_of_tyres);

     }

     abstract void Start();
 }

class Car extends vehical{


    void Start(){
         No_of_tyres = 4;

        System.out.println("Starts with key");
    }
}
class Scooter extends vehical{



    void Start(){
         No_of_tyres = 2;

        System.out.println("Starts with kick");
    }
}

public class IntroToAbstraction {
    static void main(String[] args) {
       vehical obj = new Car();
        obj.Start();

        obj.display();


        System.out.println();

        vehical obj1 = new Scooter();
        obj1.Start();

        obj1.display();



    }
}
