package OOPS;


class Parent {
    void run() {
        System.out.println("Apple");
    }
}


class Derive1 extends Parent {
    void drive() {
        System.out.println("Orange");
    }
}


class Derive2 extends Parent {
    void walk() {
        System.out.println("Banana");
    }
}

public class Hierarchical2 {
    public static void main(String[] args) {

        Derive2 obj1 = new Derive2();
        obj1.run();
        obj1.walk();

        Derive1 obj2 = new Derive1();
        obj2.run();
        obj2.drive();
    }
}
