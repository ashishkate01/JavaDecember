package ExceptionHandling;

public class Customize_exception extends RuntimeException {

    Customize_exception()
        {
            super("you are not eligible");
        }

    Customize_exception(String msg)
    {
        super(msg);
    }

    }

    class voting1{
        static void main(String[] args) {
            int age = 16;
            try{
                if (age<18){
                    throw new Customize_exception("You cannot vote");
                }else {
                    System.out.println("you Are eligible");
                }
            }
            catch(Customize_exception a){
                a.printStackTrace();
            }
            System.out.println("Hiiiiii");
        }
    }
