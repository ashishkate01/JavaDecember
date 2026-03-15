package ExceptionHandling;
// Exception Flow
public class IntroToException {
    static void main(String[] args) {
        System.out.println("0");

        int a =100 , b =0 , c;
        System.out.println("1");
        try {
            System.out.println("2");

            c =  a/b;
            System.out.println("3");

            System.out.println(c);
            System.out.println("4");

            }
        catch (ArithmeticException e)
        {
            System.out.println("5");

            //System.out.println(e);
            e.printStackTrace();
            System.out.println("6");

            //System.out.println("Exception occurred : Cannot divide by Zero ");
        }
        System.out.println("Bonjour");

    }
}
