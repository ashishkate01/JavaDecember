package OOPS;


class Child1 {
    void run() {
        System.out.println("Run");
    }
}

class Child2 extends Child1 {
    void drive() {
        System.out.println("Drive");
    }
}


class Child3 extends Child1 {
    void walk() {
        System.out.println("Walk");
    }
}


public class Hierarchical {
    public static void main(String[] args) {

        Child2 obj1 = new Child2();
        obj1.run();
        obj1.drive();

        Child3 obj2 = new Child3();
        obj2.run();
        obj2.walk();
    }
}
