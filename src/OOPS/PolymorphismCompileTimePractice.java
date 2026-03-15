package OOPS;

class XY{
    void x(int a,String s)
    {
        System.out.println(a + " - " + s);
    }
    void x()
    {
        System.out.println("Hello");
    }
}

public class PolymorphismCompileTimePractice {
    static void main(String[] args) {
        XY obj = new XY();
        obj.x(10,"Krishna");
        obj.x();

    }
}
