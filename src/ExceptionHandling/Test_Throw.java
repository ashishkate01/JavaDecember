package ExceptionHandling;

public class Test_Throw extends RuntimeException {

    Test_Throw(String msg)
    {
        super(msg);
    }

}

class voting{
    static void main(String[] args) {
        int age = 19;
        try{
        if (age<18){
            throw new Test_Throw("You Are not eligible for voting");
        }else {
            System.out.println("you Are eligible");
            }
        }
        catch(Test_Throw t){
            t.printStackTrace();
        }
        System.out.println("Hiiiiii");
    }
}