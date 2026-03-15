package OOPS;

// Run time polymorphism / Method overriding / dynamic binding / latebindingh

class A1{
    void a(){
        System.out.println(" hi ");
    }
}
class A2 extends A1{
@Override
    void a(){
        System.out.println(" hello ");
    }
}

public class MethodOverriding {
    static void main(String[] args) {
        A1 obj = new A2();
        obj.a();



    }
}
