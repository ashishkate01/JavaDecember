package OOPS;

public class SingleInheritance1
{

    void A(){
        System.out.println("class M");
    }
}
class Child extends SingleInheritance1
{
    void A1()
    {
        System.out.println("class M1");
    }

    public static void main(String[] args) {

        Child obj = new Child();
        obj.A1();
        obj.A();

    }
}



