package OOPS;

abstract class XYZ{

    int no_of_tyres;
    void display(){

        System.out.println("no of tyres : "+no_of_tyres);

    }

    abstract void start();

}

class X extends XYZ{

    void start(){
        no_of_tyres=2;
        System.out.println("Start 1");
    }

}
class Y extends XYZ {
    void start() {
        no_of_tyres=4;
        System.out.println("Start 2");
    }

}

public class AbstractionPractice {
    static void main(String[] args) {
        XYZ obj = new X();
        obj.start();
        obj.display();

        System.out.println(" ");

        XYZ obj1 = new Y();
        obj1.start();
        obj1.display();

    }
}
