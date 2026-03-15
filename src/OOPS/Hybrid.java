package OOPS;

class B{
    void a1(){
        System.out.println("Travel");
    }
}
class B1 extends B{
    void b1()
            {
        System.out.println("Ticket");
    }
}
class C extends B1{
    void c1()
    {
    System.out.println("Train");
    }
}
class D extends C{
    void d1()
    {
        System.out.println("Flight");
    }
}

class E extends C{
    void e1()
    {
        System.out.println("Boat");
    }
}


public class Hybrid {
    static void main(String[] args) {
        E obj = new E();
        D obj1 = new D();
        E obj2 = new E();

        obj.a1();
        obj.b1();
        obj.c1();
        //obj.d1();
        obj.e1();

        obj1.d1();
        obj1.c1();

        obj2.e1();
        obj.c1();


    }
}
