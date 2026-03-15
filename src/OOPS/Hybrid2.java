package OOPS;

class Parent11{
    void a1(){
        System.out.println("Insurance");
    }
}
class Derive11 extends Parent11{
    void b1()
    {
        System.out.println("Cover");
    }
}
class Child11 extends  Derive11{
    void c1()
    {
        System.out.println("Expenses");
    }
}
class Child22 extends Derive11{
    void d1()
    {
        System.out.println("Weight");
    }
}

public class Hybrid2 {
    static void main(String[] args) {
        Derive11 obj = new Derive11();
        obj.b1();
        obj.a1();

        Child22 obj2 = new Child22();
        obj2.b1();
        obj2.d1();


    }
}
