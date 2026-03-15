
class Test1
{
    int i=10;
    public static void main(String[] args)
    {
//        System.out.println(i); // (invalid)
//        C.E:non-static variable i cannot be referenced from a static
//        context(invalid)

        Test1 t=new Test1();
        System.out.println(t.i);//10(valid)
        t.methodOne();
    }
    public void methodOne()
    {
        System.out.println(i);//10(valid)
    }
}
